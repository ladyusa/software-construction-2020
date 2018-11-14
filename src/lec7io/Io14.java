package lec7io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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
