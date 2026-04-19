package csie.ase.ro.patterns.adapter;

public class External2StandardCardProcessorAdapter extends AbstractPaymentProcessor{
    IExternalCashRegister externalCashRegister;

    public External2StandardCardProcessorAdapter(IExternalCashRegister externalCashRegister) {
        super(0, externalCashRegister.getRegisterName());
        this.externalCashRegister = externalCashRegister;
    }

    @Override
    public void processPayment(String orderId, double amount) {
        System.out.println("Processing payment " + orderId);
        float value = (float)(amount * 100);
        this.externalCashRegister.chargeBill(value);

    }

    @Override
    public void refundPayment(String orderId) {
        System.out.println("Refunding on the way...");
        int billNumber = Integer.parseInt(orderId);
        this.externalCashRegister.cancelBill(billNumber);

    }
}
