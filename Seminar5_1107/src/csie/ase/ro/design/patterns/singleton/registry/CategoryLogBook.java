package csie.ase.ro.design.patterns.singleton.registry;

import csie.ase.ro.design.patterns.singleton.eager.interfaces.ILogging;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class CategoryLogBook implements ILogging {
    private String category;
    private PrintWriter writer;

    CategoryLogBook(String category){
        this.category = category;
        try {
            this.writer = new PrintWriter(new FileWriter(category.toLowerCase() + ".log", true));
        } catch (IOException e) {
            throw new RuntimeException("Cannot write into the file",e);
        }
    }


    @Override
    public void log(String message) {
        writer.println("[" + LocalDateTime.now() + "]: " + message);
        writer.flush();
    }

    public String getCategory(){
        return this.category;
    }
}
