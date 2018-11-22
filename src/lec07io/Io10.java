package lec07io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Io10 {

	// write to file (write over old file)
	// with BufferedWriter
	public static void main(String[] args) {

		FileWriter fileWriter = null;
		try {
			// read from user
			InputStreamReader inReader = new InputStreamReader(System.in);
			BufferedReader buffer = new BufferedReader(inReader);

			// write to file (write over old file)
			fileWriter = new FileWriter("data/from-user.txt");
			BufferedWriter out = new BufferedWriter(fileWriter);

			System.out.println("Input text to file:");
			String line = buffer.readLine();

			while (!line.equals("bye")) {
				out.write("-----> " + line);
				out.newLine();
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
