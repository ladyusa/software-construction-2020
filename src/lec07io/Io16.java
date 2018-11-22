package lec07io;

import java.io.*;

public class Io16 {

    // write entire objects to file
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Restaurant r = new Restaurant("After Me", "Dessert", "Phahonyothin");

        FileOutputStream fileOs = new FileOutputStream("data/res-object");
        ObjectOutputStream out = new ObjectOutputStream(fileOs);

        out.writeObject(r);
        out.close();


        FileInputStream fileIs = new FileInputStream("data/res-object");
        ObjectInputStream in = new ObjectInputStream(fileIs);

        Restaurant readRes = (Restaurant) in.readObject();

        System.out.println(readRes);


    }
}
