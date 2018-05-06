package com.yuliang.lab6.lab61;

public class CallRecord {
    private Customer customer;
    private Agent agent;
    private String requestInformation;
    private boolean isValid;
    private boolean isASalesLead;

    public CallRecord(Customer customer, Agent agent, String requestInformation, boolean isValid, boolean isASalesLead) {
        this.customer = customer;
        this.agent = agent;
        this.requestInformation = requestInformation;
        this.isValid = isValid;
        this.isASalesLead = isASalesLead;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public String getRequestInformation() {
        return requestInformation;
    }

    public void setRequestInformation(String requestInformation) {
        this.requestInformation = requestInformation;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public boolean isASalesLead() {
        return isASalesLead;
    }

    public void setASalesLead(boolean ASalesLead) {
        isASalesLead = ASalesLead;
    }

    @Override
    public String toString() {
        return "CallRecord{" +
                "customer=" + customer +
                ", agent=" + agent +
                ", requestInformation='" + requestInformation + '\'' +
                ", isValid=" + isValid +
                ", isASalesLead=" + isASalesLead +
                '}';
    }
}
