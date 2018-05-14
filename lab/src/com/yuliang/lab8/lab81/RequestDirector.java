package com.yuliang.lab8.lab81;

public class RequestDirector {
    private RequestBuilder requestBuilder = null;

    public RequestDirector(RequestBuilder requestBuilder) {
        this.requestBuilder = requestBuilder;
    }

    public void createRequest() {
        requestBuilder.createOpening();
        requestBuilder.addResponseContent("response content");
        requestBuilder.closing(true);
    }

    public Request getRequest() {
        return requestBuilder.getRequest();
    }
}
