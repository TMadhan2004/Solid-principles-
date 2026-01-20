interface paymentMethods{
    void pay(double amount);
}

class creditCardPayment implements paymentMethods{
    public void pay(double amount){
        System.out.println("Paid Rs "+amount+" using credit card");
    }
}

class upiPayment implements paymentMethods{
    public void pay(double amount){
        System.out.println("Paid Rs "+amount+" using UPI");
    }
}

class wallet implements paymentMethods{
    public void pay(double amount){
        System.out.println("Paid Rs "+amount+" using wallet");
    }
}
class paymentService{
    public void processPayment(paymentMethods method, double amount){
        method.pay(amount);
    }
}

public class paymentprocessing{
    public static void main(String args[]){
        paymentService service = new paymentService();
        paymentMethods card = new creditCardPayment();
        paymentMethods upi = new upiPayment();
        paymentMethods wallet = new wallet();
        service.processPayment(card,1000);
        service.processPayment(upi,500);
        service.processPayment(wallet,10000);
    }
}
