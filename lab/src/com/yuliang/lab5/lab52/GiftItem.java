package com.yuliang.lab5.lab52;

public class GiftItem {
    private String giftId;
    private String giftName;
    private String description;
    private String packagingType; //"bag", "box", or "wrap".
    private Packaging packaging;

    public GiftItem(String giftId, String giftName, String description, String packagingType) {
        this.giftId = giftId;
        this.giftName = giftName;
        this.description = description;
        this.packagingType = packagingType;
    }

    public String getGiftId() {
        return giftId;
    }

    public void setGiftId(String giftId) {
        this.giftId = giftId;
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPackagingType() {
        return packagingType;
    }

    public void setPackagingType(String packagingType) {
        this.packagingType = packagingType;
    }

    public Packaging getPackaging() {
        return packaging;
    }

    public void setPackaging(Packaging packaging) {
        this.packaging = packaging;
    }
}
