package lec07io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Io07 {

	// read multiple data from file and create an object
	public static void main(String[] args) {

		String filename = "data/restaurant.txt";
		List<Restaurant> restaurants = new ArrayList<>();
		try {
			FileReader fileReader = new FileReader(filename);
			BufferedReader buffer = new BufferedReader(fileReader);

			String line;
			while ((line = buffer.readLine()) != null) {
				String[] data = line.split(",");
				String name = data[0].trim();
				String type = data[1].trim();
				String area = data[2].trim();
				int rating = Integer.parseInt(data[3].trim());

				Restaurant r = new Restaurant(name, type, area);
				r.setRating(rating);
				restaurants.add(r);
				System.out.println(r);
			}	
		}
		catch (FileNotFoundException e){
			System.err.println("Cannot read file "+filename);
		}		
		catch (IOException e){
			System.err.println("Error reading from file");
		}		

	}
}
