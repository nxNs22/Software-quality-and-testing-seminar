package csie.ase.ro.patterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class TestApp {
    public static void main(String[] args){
        StandardCardProcessor card = new StandardCardProcessor(1000, "VisaTerminal");
        card.processPayment("1000", 45.5);

        List<AbstractPaymentProcessor> processors = new ArrayList<>();
        processors.add(card);

        LegacyCashRegister legacy = new LegacyCashRegister("NewSystem", 0, true);
        legacy.printReceipt();

        processors.add(new External2StandardCardProcessorAdapter(legacy));

        // object adapter
        AbstractPaymentProcessor objectAdapter = new External2StandardCardProcessorAdapter(legacy);
        objectAdapter.logTransaction(44.5);

        // class adapter
        AbstractPaymentProcessor classAdapter = new External2StandardCardClassAdapter(200, "Mastercard");
        classAdapter.logTransaction(44.5);


    }
}
