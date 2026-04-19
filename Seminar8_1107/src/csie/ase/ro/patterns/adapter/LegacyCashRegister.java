package csie.ase.ro.patterns.adapter;

public class LegacyCashRegister implements IExternalCashRegister {
    String name;
    float totalCharged;
    boolean isOnline;

    public LegacyCashRegister(String name, float totalCharged, boolean isOnline) {
        this.name = name;
        this.totalCharged = totalCharged;
        this.isOnline = isOnline;
    }

    @Override
    public String getRegisterName() {
        return this.name;
    }

    @Override
    public void chargeBill(float totalInCents) {
        System.out.println("LegacyCashRegister charged " + totalInCents);
    }

    @Override
    public void cancelBill(int billNumber) {
        System.out.println("LegacyCashRegister cancelled bill with id: " + billNumber);
    }

    @Override
    public void printReceipt() {
        System.out.println("LegacyCashRegister printed the receipt");
    }
}
