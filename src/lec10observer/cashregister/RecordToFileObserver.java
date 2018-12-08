package lec10observer.cashregister;

import java.io.*;

public class RecordToFileObserver implements Observer {

    private PrintWriter out;

    public RecordToFileObserver(String filename) throws IOException {
        FileWriter file = new FileWriter(filename);
        out = new PrintWriter(file);
    }

    @Override
    public void update(double amount) {
        out.println(amount);
    }

    public void closeFile() {
        out.close();
    }
}
