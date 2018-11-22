package lec07io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * 
 * @author usa
 *
 */
public class Io09 {

	// write to file (write over old file)
	// with PrintWriter
	public static void main(String[] args) {

		FileWriter fileWriter = null;
		try {
			// read from user
			InputStreamReader inReader = new InputStreamReader(System.in);
			BufferedReader buffer = new BufferedReader(inReader);

			// write to file (write over old file)
			fileWriter = new FileWriter("data/from-user.txt");
			PrintWriter out = new PrintWriter(fileWriter);

			System.out.println("Input text to file:");
			String line = buffer.readLine();

			while (!line.equals("bye")) {
				out.println("-----> " + line);
				line = buffer.readLine();
			}	
			out.flush();
		}
		catch (IOException e){
			System.err.println("Error reading from user");
		}	
		finally {
			try {
				if (fileWriter != null)
					fileWriter.close();
			} catch (IOException e) {
				System.err.println("Error closing files");
			}
		}		

	}
}
