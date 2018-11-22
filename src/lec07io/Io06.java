package lec07io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Io06 {

	// read numbers from file
	public static void main(String[] args) {

		String filename = "data/number.txt";
		try {
			FileReader fileReader = new FileReader(filename);
			BufferedReader buffer = new BufferedReader(fileReader);

			String line;
			int sum = 0;
			while ((line = buffer.readLine()) != null) {
				int num = Integer.parseInt(line);
				sum += num;
			}	
			System.out.println("Total: " + sum);
		}
		catch (FileNotFoundException e){
			System.err.println("Cannot read file "+filename);
		}		
		catch (IOException e){
			System.err.println("Error reading from file");
		}		

	}
}
