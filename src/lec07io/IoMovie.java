package lec07io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IoMovie {

    public static void main(String[] args) {

        List<Movie> myMov = readMovies();

        for (Movie movie : myMov) {
            System.out.println(movie);
        }

    }

    public static List<Movie> readMovies() {
        String filename = "data/movie.txt";
        List<Movie> movieList = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(filename);
            BufferedReader in = new BufferedReader(fileReader);

            String line = null;
            while ( (line = in.readLine()) != null ) {
                String[] data = line.split("\\|");
                String movieName = data[0].trim();
                int length = Integer.parseInt(data[1].trim());
                String category = data[2].trim();

                Movie movie = new Movie(movieName, length, category);
                movieList.add(movie);
            }
        }
        catch (FileNotFoundException e){
            System.err.println("Cannot read file "+filename);
        }
        catch (IOException e){
            System.err.println("Error reading from file");
        }

        return movieList;
    }
}
