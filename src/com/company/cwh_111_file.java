package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class cwh_111_file {
    public static void main(String[] args) {

        //code to create a new file
        /*
        File myFile = new File("cwh111file.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
           e.printStackTrace();
        }


        //code to write to a file
        try {
            FileWriter fileWriter = new FileWriter("cwh111file.txt");
            fileWriter.write("this is a first file from this java course \nOkay now by");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        //reading a file
        File myFile = new File("cwh111file.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
        }
         */

        //deleting a file
        File myFile = new File("cwh111file.txt");
        if(myFile.delete()){
            System.out.println("I have deleted : "+myFile.getName());
        }else {
            System.out.println("some error has been occurred");
        }
    }
}
