import payment.*;

public class Main {
    public static void main(String[] args) {

        RegularCustomer customer1 = new RegularCustomer("Jack ");
        RegularCustomer customer2 = new RegularCustomer("Julia ");
        PremiumCustomer customer3 = new PremiumCustomer("Jamal ");

        CreditCardPayment first = new CreditCardPayment("001" , "Jack");
        PayPalPayment second = new PayPalPayment("julia@gmail.com");
        BitcoinPayment third = new BitcoinPayment("GOOGOOLI");

        System.out.println("Info of Customers : ");
        customer1.displayCustomerInfo();
        customer2.displayCustomerInfo();
        customer3.displayCustomerInfo();

        System.out.println();

        System.out.println("Payments : ");
        System.out.println("Jack's payments");
        System.out.println("amount :    payment Method :    card num & holder num: ");
        customer1.makePayment( first, 900);
        customer1.makePayment( first, 200);
        System.out.println("Julia's payments");
        System.out.println("amount :    payment Method :    email: ");
        customer2.makePayment( second, 500);
        customer2.makePayment( second, 400);
        System.out.println("Jamal's payments");
        System.out.println("amount :    payment Method :    wallet address : ");
        customer3.makePayment( third, 580);
        customer3.makePayment( third, 800);
        System.out.println();

        System.out.println("Payments History : ");
        customer1.showPaymentHistory();
        System.out.println();
        customer2.showPaymentHistory();
        System.out.println();
        customer3.showPaymentHistory();
    }
}