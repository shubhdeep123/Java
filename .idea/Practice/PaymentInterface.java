package Practice;

public class PaymentInterface {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment();
        Payment payPalPayment = new PayPalPayment();
        Payment upiPayment = new UPIPayment();

        creditCardPayment.pay(100);
        payPalPayment.pay(200);
        upiPayment.pay(300);
    }
}

interface Payment {
    void pay(int amount);
}

class CreditCardPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class PayPalPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}

class UPIPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
}
