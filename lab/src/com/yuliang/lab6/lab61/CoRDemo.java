package com.yuliang.lab6.lab61;

public class CoRDemo {
    public static void main(String[] args) {
        Address address = new Address("N 2000", "Fairfield", "Iowa", "52556");
        Customer customer = new Customer("lei", "Lee", address, "12345678901", "leilee@gmail.com");
        Agent agent = new Agent();
        CallRecord callRecord = new CallRecord(customer, agent, "", false, false);
        ValidatorHandler validatorHandler = new ValidatorHandler();
        DataWasherHandler dataWasherHandler = new DataWasherHandler();
        ReporterHandler reporterHandler = new ReporterHandler();
        dataWasherHandler.setNextHaldler(reporterHandler);
        validatorHandler.setDataWasherHandler(dataWasherHandler);
        validatorHandler.handleRequest(callRecord);
    }
}
