package csie.ase.ro.patterns.adapter;

public abstract class AbstractPaymentProcessor {
    String processorName;
    int transactionCode;

    public AbstractPaymentProcessor(int transactionCode, String processorName) {
        this.transactionCode = transactionCode;
        this.processorName = processorName;
    }

    public void logTransaction(double amount){
        System.out.println(this.processorName + " logged a transaction of " + amount);
    }

    public abstract void processPayment(String orderId, double amount);
    public abstract void refundPayment(String orderId);
}
