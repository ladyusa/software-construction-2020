package lec07io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This class helps explain about IO.
 * @author usa
 *
 */
public class Io02 {

	// read efficiently with BufferedReader from System.in
	public static void main(String[] args) {

		System.out.print("Enter characters: ");
		try {
			InputStreamReader inReader = new InputStreamReader(System.in);        	
			BufferedReader buffer = new BufferedReader(inReader);

			String line = buffer.readLine();
			System.out.println("You entered: " + line);
		}
		catch (IOException e){
			System.err.println("Error reading from user");
		}		

	}
}
