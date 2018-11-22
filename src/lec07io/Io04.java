package lec07io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Io04 {

	// read efficiently with BufferedReader from System.in
	// with while loop but no break
	public static void main(String[] args) {

		try {
			InputStreamReader inReader = new InputStreamReader(System.in);
			BufferedReader buffer = new BufferedReader(inReader);

			System.out.println("Enter lines:");
			String line = buffer.readLine();

			while (!line.equals("bye")) {
				System.out.println("-----> " + line);
				line = buffer.readLine();
			}			
		}
		catch (IOException e){
			System.err.println("Error reading from user");
		}	
	}
}
