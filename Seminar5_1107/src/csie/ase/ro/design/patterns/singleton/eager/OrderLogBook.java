package csie.ase.ro.design.patterns.singleton.eager;

import csie.ase.ro.design.patterns.singleton.eager.interfaces.ILogging;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class OrderLogBook implements ILogging {
    private static final OrderLogBook instance = new OrderLogBook();
    private PrintWriter writer;


    private OrderLogBook(){
        try {
            this.writer = new PrintWriter(new FileWriter("orders.log",true));
        } catch (IOException e) {
            throw new RuntimeException("Cannot write into orders.log", e);
        }
    }

    public static OrderLogBook getInstance(){
        return instance;
    }

    @Override
    public void log(String message) {
        writer.println("[" + LocalDateTime.now() + "]: " + message);
        writer.flush();
    }
}
