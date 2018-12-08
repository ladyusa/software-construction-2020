package lec10observer.cashregister;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // subject
        CashRegister data = new CashRegister();

        // observers
        TotalPurchaseDisplay totalDisplay = new TotalPurchaseDisplay();
        RecordToFileObserver fileObserver = null;
        try {
            fileObserver =
                    new RecordToFileObserver("data/purchase.txt");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        // connect subject and observers
        data.registerObserver(totalDisplay);
        data.registerObserver(fileObserver);

        // input receives new data from a user via System.in
        // whenever a user inputs new data, all observers are
        // updated
        InputUI inputUI = new InputUI();
        inputUI.receive(data);

        fileObserver.closeFile();
    }
}
