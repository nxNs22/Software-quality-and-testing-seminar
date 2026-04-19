package csie.ase.ro.patterns.adapter;

public class External2StandardCardClassAdapter extends AbstractPaymentProcessor implements IExternalCashRegister{

    public External2StandardCardClassAdapter(int transactionCode, String processorName) {
        super(transactionCode, processorName);
    }

    // methods from IExternalCashRgeister
    @Override
    public String getRegisterName() {
        return this.processorName;
    }

    @Override
    public void chargeBill(float totalInCents) {
        System.out.println(this.processorName + " charged " + totalInCents);
    }

    @Override
    public void cancelBill(int billNumber) {
        System.out.println(this.processorName + " canceled bill " + billNumber);
    }

    @Override
    public void printReceipt() {
        System.out.println(this.processorName + " printed the receipt");
    }

    // methods from AbstractPaymentProcessor
    @Override
    public void processPayment(String orderId, double amount) {
        this.chargeBill((float) (amount*100));
    }

    @Override
    public void refundPayment(String orderId) {
        this.cancelBill(Integer.parseInt(orderId));
    }
}
