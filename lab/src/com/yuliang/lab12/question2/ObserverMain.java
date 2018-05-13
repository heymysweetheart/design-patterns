package com.yuliang.lab12.question2;

public class ObserverMain {
    public static void main(String[] args) {
        NamesData namesData = new NamesData();
        namesData.attach(new GuiPannel());

        namesData.addName("apple");
        namesData.addName("cup");
        namesData.addName("cupon");
        namesData.deleteName("cup");
    }
}
