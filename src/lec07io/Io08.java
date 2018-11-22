package lec07io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Io08 {

	// closing file
	public static void main(String[] args) {

		String filename = "data/hello.txt";
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(filename);
			BufferedReader buffer = new BufferedReader(fileReader);

			System.out.println("Open file:");
			String line = buffer.readLine();

			while (line != null) {
				System.out.println("-----> " + line);
				line = buffer.readLine();
			}			
		}
		catch (FileNotFoundException e){
			System.err.println("Cannot read file "+filename);
		}		
		catch (IOException e){
			System.err.println("Error reading from file");
		}	
		finally {
			try {
				if (fileReader != null)
					fileReader.close();
			} catch (IOException e) {
				System.err.println("Error closing files");
			}
		}
	}
}
