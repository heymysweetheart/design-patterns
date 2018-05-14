package com.yuliang.lab8.lab81;

import java.util.UUID;

public class ConcreteRequestBuild implements RequestBuilder{

    private Request request;

    public ConcreteRequestBuild(Request request) {
        this.request = request;
    }

    public ConcreteRequestBuild() {
        request = new Request();
    }

    @Override
    public void createOpening() {
        request.setAgent(new Agent());
        request.setReqId(UUID.randomUUID().toString());
    }

    @Override
    public void addResponseContent(String content) {
        request.setReqContent(content);

    }

    @Override
    public void closing(boolean answered) {
        request.setAnswered(answered);

    }

    @Override
    public Request getRequest() {
        return request;
    }
}
