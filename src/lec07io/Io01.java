package lec07io;

import java.io.IOException;

public class Io01 {

    // simple read from System.in
	public static void main(String[] args) {
		
        System.out.print("Enter characters: ");
        try {
            int inChar = System.in.read();
            char a = (char) inChar;
            System.out.println("You entered: " + inChar);
            System.out.println("You entered: " + a);
        }
        catch (IOException e){
            System.err.println("Error reading from user");
        }	
	}
}
