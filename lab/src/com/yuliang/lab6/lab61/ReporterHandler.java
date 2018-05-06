package com.yuliang.lab6.lab61;

public class ReporterHandler extends AbstractHandler{

    @Override
    void handleRequest(CallRecord callRecord) {

        if(canHandleRequest(callRecord)) {
            System.out.println("Generate one sale lead: " + callRecord.toString());
        } else {
            System.out.println("Not a valid sale lead: " + callRecord.toString());
        }
    }

    @Override
    boolean canHandleRequest(CallRecord callRecord) {
        return callRecord.isASalesLead();
    }
}
