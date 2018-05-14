package com.yuliang.lab8.lab81;

public class BuilderDemoMain {
    public static void main(String[] args) {
        RequestDirector requestDirector = new RequestDirector(new ConcreteRequestBuild());
        requestDirector.createRequest();
        System.out.println(requestDirector.getRequest());
    }
}
