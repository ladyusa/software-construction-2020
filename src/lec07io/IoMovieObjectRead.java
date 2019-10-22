package lec07io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class IoMovieObjectRead {

    public static void main(String[] args) {

        try {
            FileInputStream fileIn = new FileInputStream("movie.obj");
            ObjectInputStream objIn = new ObjectInputStream(fileIn);

            Object o1 = objIn.readObject();
            Object o2 = objIn.readObject();

            Movie m1 = (Movie) o1;
            Movie m2 = (Movie) o2;

            System.out.println("Movie1: " + m1);
            System.out.println("Movie2: " + m2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
