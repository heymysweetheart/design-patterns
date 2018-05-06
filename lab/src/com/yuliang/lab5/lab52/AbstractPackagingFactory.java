package com.yuliang.lab5.lab52;

public abstract class AbstractPackagingFactory {
    public abstract BagPackaging getBagPackage(String type);
    public abstract BoxPackaging getBoxPackage(String type);
    public abstract WrapPackaging getWrapPackage(String type);
}
