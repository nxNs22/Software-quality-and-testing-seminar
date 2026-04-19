package csie.ase.ro.patterns.adapter;

public class StandardCardProcessor extends AbstractPaymentProcessor {

    public StandardCardProcessor(int transactionCode, String processorName) {
        super(transactionCode, processorName);
    }

    @Override
    public void processPayment(String orderId, double amount) {
        System.out.println("Standard card payment for order " + orderId + ": " + amount);
    }

    @Override
    public void refundPayment(String orderId) {
        System.out.println("Refund from standard card order with id: " + orderId);
    }
}
