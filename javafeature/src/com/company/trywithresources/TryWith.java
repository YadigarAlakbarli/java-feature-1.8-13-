package com.company.trywithresources;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryWith {
    public static void main(String[] args)  {

        try (Scanner scanner = new Scanner(new File("test.txt"))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        }
        catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }

        //try-with-resources With Multiple Resources
        try (Scanner scanner = new Scanner(new File("testRead.txt"));
             PrintWriter writer = new PrintWriter(new File("testWrite.txt"))) {
            while (scanner.hasNext()) {
                writer.print(scanner.nextLine());
            }
        }
        catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }
}
