package TemplateMethodPattern;

public abstract class TemplateMethodPattern {

    //To send money user must follow this steps / Skeleton for an algorithm
    public final void doPayment(){
        validateCustomer();
        transferMoney();
        validateAmountForCustomer();
        printStatement();
        updateCustomer();
        sendMessage();
    }

    //They're made private so the user class can't override them and only base class have the responsibility to access these methods.
    private void validateCustomer(){
        System.out.println("Validating customer");
    }

    protected abstract void transferMoney();

    private void validateAmountForCustomer(){
        System.out.println("Validating customer account if amount is greater than account balance");
    }

    private void printStatement(){
        System.out.println("Printing Statement for customer");
    }

    protected abstract void updateCustomer();

    //Hook method
    protected void sendMessage(){

    }

}
