package lec07io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class IoMovieObject {

    public static void main(String[] args) {

        Movie movie1 = new Movie("Annabelle", 120, "Horror");
        Movie movie2 = new Movie("Totoro", 90, "Animation");

        FileOutputStream fileOut = null;
        try {
            fileOut = new FileOutputStream("movie.obj");
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);

            objOut.writeObject(movie1);
            objOut.writeObject(movie2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileOut != null)
                    fileOut.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
