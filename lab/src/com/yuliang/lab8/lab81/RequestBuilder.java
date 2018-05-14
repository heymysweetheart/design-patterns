package com.yuliang.lab8.lab81;

public interface RequestBuilder {
    void createOpening();
    void addResponseContent(String content);
    void closing(boolean answered);
    Request getRequest();
}
