package MyPractice.SingleInheritance.BankAccountManagement.RetailProductManagement;

public class ProductRunner {
    public static void main(String[] args) {
        Electronics electronics = new Electronics("Potato", 8.145, 5);

        System.out.println(" product Name: " + electronics.getProductName());
        System.out.println(" product: " + electronics.getPrice());
        System.out.println(" product Name: " + electronics.getWarrantyPeriod());


    }
}
