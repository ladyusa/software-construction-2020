package lec07io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Io13 {

	// PrintWriter is flexible, can be used with several types
	public static void main(String[] args) {

		try {
			// write to file
			FileWriter fileWriter = new FileWriter("data/any-type.txt");
			PrintWriter out = new PrintWriter(new BufferedWriter(fileWriter));

			out.println("hello");
			out.println(5.67);
			Restaurant r = new Restaurant("After You", "Dessert", "Phahonyothin");
			r.setRating(5);
			out.println(r);
			out.flush();
		}
		catch (IOException e){
			System.err.println("Error reading from user");
		}	

	}
}
