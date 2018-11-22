package lec07io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

/**
 * This class demonstrate how to use JFileChooser
 * @author usa
 *
 */
public class Io15 {

	// using UI JFileChooser to open file
	public static void main(String[] args) {

		try {
			JFileChooser chooser = new JFileChooser(); 
			FileReader fileReader = null;
			if (chooser.showOpenDialog(null) ==
					JFileChooser.APPROVE_OPTION)
			{
				File selectedFile = chooser.getSelectedFile();
				fileReader = new FileReader(selectedFile);

				BufferedReader buffer = new BufferedReader(fileReader);

				System.out.println("Open file:");
				String line = buffer.readLine();

				while (line != null) {
					System.out.println("-----> " + line);
					line = buffer.readLine();
				}			
			}
		}
		catch (FileNotFoundException e){
			System.err.println("Cannot read file ");
		}		
		catch (IOException e){
			System.err.println("Error reading from file");
		}		

	}
}
