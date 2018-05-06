package com.yuliang.lab6.lab61;

public class DataWasherHandler extends AbstractHandler{

    @Override
    void handleRequest(CallRecord callRecord) {
        if(canHandleRequest(callRecord)) {
            callRecord.setASalesLead(true);
        } else {
            callRecord.setASalesLead(false);
        }

        nextHaldler.handleRequest(callRecord);
    }

    @Override
    boolean canHandleRequest(CallRecord callRecord) {
        return callRecord.isValid();
    }
}
