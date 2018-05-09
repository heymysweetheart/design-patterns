package com.yuliang.lab8.lab81;

import java.util.Date;

public class Call {
    private String requestId;
    private Agent agent;
    public void callPop(Agent agent){
        this.agent = agent;
        this.requestId = ""+(new Date()).getTime();
    }
}
