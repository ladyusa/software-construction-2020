package lec07io;

import java.util.Scanner;

public class IoScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = new String[3];
        for (int i = 0; i < 3; i++) {
            line[i] = scanner.nextLine();
        }


        System.out.println("data1 : " + line[0]);
        System.out.println("data2 : " + line[1]);
        System.out.println("data3 : " + line[2]);


    }
}
