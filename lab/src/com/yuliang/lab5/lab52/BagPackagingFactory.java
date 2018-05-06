package com.yuliang.lab5.lab52;

public class BagPackagingFactory extends AbstractPackagingFactory{
    @Override
    public BagPackaging getBagPackage(String type) {
        if(type == null) return null;
        if("Business".equalsIgnoreCase(type)) {
            return new BagBusinessPackage();
        } else if("Adults".equalsIgnoreCase(type)) {
            return new BagAdultsPackaging();
        } else {
            return new BagKidsPackaging();
        }
    }

    @Override
    public BoxPackaging getBoxPackage(String type) {
        if(type == null) return null;
        if("Business".equalsIgnoreCase(type)) {
            return new BoxBusinessPackage();
        } else if("Adults".equalsIgnoreCase(type)) {
            return new BoxAdultsPackaging();
        } else {
            return new BoxKidsPackaging();
        }
    }

    @Override
    public WrapPackaging getWrapPackage(String type) {
        if(type == null) return null;
        if("Business".equalsIgnoreCase(type)) {
            return new WrapBusinessPackage();
        } else if("Adults".equalsIgnoreCase(type)) {
            return new WratAdultsPackaging();
        } else {
            return new WrapKidsPackaging();
        }
    }
}
