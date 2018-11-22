package lec07io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Io05 {

	// read from file (similar to Io04 where the only
	// different is using FileReader instead of
	// InputStreamReader
	public static void main(String[] args) {

		String filename = "data/hello.txt";
		try {
			FileReader fileReader = new FileReader(filename);
			BufferedReader buffer = new BufferedReader(fileReader);

			System.out.println("Open file:");
			String line = buffer.readLine();

			while (line != null) {
				System.out.println("-----> " + line);
				line = buffer.readLine();
			}			
		}
		catch (FileNotFoundException e){
			System.err.println("Cannot read file: "+filename);
		}		
		catch (IOException e){
			System.err.println("Error reading from file");
		}		

	}
}
