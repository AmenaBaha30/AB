package MyPractice.SingleInheritance.BankAccountManagement.RetailProductManagement;

public class Electronics extends Product {

    private final int warrantyPeriod;

    // constructor to initialize all variables.

    public Electronics(String productName, double price, int warrantyPeriod) {
        super(productName, price);
        this.warrantyPeriod = warrantyPeriod;
    }
    public int getWarrantyPeriod(){
        return warrantyPeriod;
    }

}
