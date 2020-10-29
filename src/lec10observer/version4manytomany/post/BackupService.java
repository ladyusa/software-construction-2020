package lec10observer.version4manytomany.post;

import version4manytomany.util.Observer;
import version4manytomany.util.Subject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BackupService implements Observer {
    private String filename;

    public BackupService(String filename, Subject subject) {
        this.filename = filename;
        subject.addObserver(this);
    }

    @Override
    public void update(Object obj) {
        String data = (String) obj;
        // write file
        FileWriter writer = null;
        try {
            writer = new FileWriter(filename, true);
            PrintWriter out = new PrintWriter(writer);
            out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null)
                    writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
