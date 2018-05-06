package com.yuliang.lab6.lab61;

public class ValidatorHandler extends AbstractHandler{

    AbstractHandler dataWasherHandler;

    public AbstractHandler getDataWasherHandler() {
        return dataWasherHandler;
    }

    public void setDataWasherHandler(AbstractHandler dataWasherHandler) {
        this.dataWasherHandler = dataWasherHandler;
    }

    @Override
    void handleRequest(CallRecord callRecord) {
        if(canHandleRequest(callRecord)) {
            callRecord.setValid(true);
        } else callRecord.setValid(false);
        dataWasherHandler.handleRequest(callRecord);
    }

    @Override
    boolean canHandleRequest(CallRecord callRecord) {
        return checkValidContactInformation(callRecord);
    }

    private boolean checkValidContactInformation(CallRecord callRecord) {
        Address address = callRecord.getCustomer().getAddress();
        String email = callRecord.getCustomer().getEmail();
        String phone = callRecord.getCustomer().getPhone();
        if(isValidAddress(address) && isValidEmail(email) && isValidPhone(phone)) return true;

        return false;
    }

    private boolean isValidEmail(String email) {
        return email != null;
    }

    private boolean isValidPhone(String phone) {
        return phone != null;
    }

    private boolean isValidAddress(Address address) {
        return address != null;
    }
}
