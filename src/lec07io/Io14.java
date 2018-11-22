package lec07io;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Io14 {

	// using scanner to read data
	public static void main(String[] args) {

		InputStreamReader inReader = new InputStreamReader(System.in);
		Scanner in = new Scanner(inReader);

		while (true) {
			System.out.print("Enter line: ");
			String line = in.nextLine();

			if (line.equals("bye")) 
				break;

			System.out.println("You entered: " + line);
		}			

	}
}
