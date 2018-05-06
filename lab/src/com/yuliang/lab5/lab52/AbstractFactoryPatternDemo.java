package com.yuliang.lab5.lab52;

import java.util.ArrayList;
import java.util.List;

public class AbstractFactoryPatternDemo {
    private static String packaging;

    public static void main(String[] args) {
        GiftItem giftItem1 = new GiftItem("1", "Cup", "hot", "box");
        GiftItem giftItem2 = new GiftItem("2", "pen", "hot", "wrap");
        GiftItem giftItem3 = new GiftItem("3", "bag", "hot", "bag");
        GiftItem giftItem4 = new GiftItem("4", "book", "hot", "box");
        List<GiftItem> itemList = new ArrayList<>();
        itemList.add(giftItem1);
        itemList.add(giftItem2);
        itemList.add(giftItem3);
        itemList.add(giftItem4);
        GiftPack businessGiftPack = new GiftPack(itemList, new Address(), "Business");
        System.out.println(getPackagingCost(businessGiftPack));
    }

    private static float getPackagingCost(GiftPack businessGiftPack) {
        float packagingFee = 0.0f;
        setPackaging(businessGiftPack);
        List<GiftItem> giftItems = businessGiftPack.getGiftItems();
        for (GiftItem giftItem : giftItems) {
            packagingFee += giftItem.getPackaging().getCost();
        }
        return packagingFee;
    }

    public static void setPackaging(GiftPack businessGiftPack) {
        String packType = businessGiftPack.getPackType();
        List<GiftItem> giftItems = businessGiftPack.getGiftItems();
        BagPackagingFactory concretePackagingFactory = new BagPackagingFactory();

        for (GiftItem giftItem : giftItems) {
            if("bag".equalsIgnoreCase(giftItem.getPackagingType())) {
                giftItem.setPackaging(new BagPackagingFactory().getBagPackage(packType));
            } else if("box".equalsIgnoreCase(giftItem.getPackagingType())) {
                giftItem.setPackaging(new BagPackagingFactory().getBoxPackage(packType));
            } else {
                giftItem.setPackaging(new BagPackagingFactory().getWrapPackage(packType));
            }
        }

    }
}
