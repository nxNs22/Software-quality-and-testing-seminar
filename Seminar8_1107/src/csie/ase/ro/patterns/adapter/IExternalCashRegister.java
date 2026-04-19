package csie.ase.ro.patterns.adapter;

public interface IExternalCashRegister {
    String getRegisterName();
    void chargeBill(float totalInCents);
    void cancelBill(int billNumber);
    void printReceipt();
}
