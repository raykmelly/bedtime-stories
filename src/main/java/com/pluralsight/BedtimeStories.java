package com.pluralsight;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter .txt file name
        System.out.println("-> Enter the file name you want to read: ");
        String fileName = scanner.nextLine();

        // Attempt to read the file, if not catch the failure
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            // Loop through all lines till file is finished
            while ((line = reader.readLine()) != null) {
                // Read each line of the file
                System.out.println(line);
            }
        } catch (java.io.FileNotFoundException e) {
            // File not found
            System.out.println("Error: File not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}