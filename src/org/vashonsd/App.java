package org.vashonsd;

import java.io.*;
import java.util.Scanner;


public class App {

    public static void main(String[] args) {
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
//            writer.write("Writing to a text file");
//            writer.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
//            reader.readLine();
//            System.out.println(reader.readLine());
//            reader.close();
//        } catch(IOException e) {
//            e.printStackTrace();
//            }



        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your weight in pounds:");
        double weight = scan.nextInt();
        System.out.println("Enter your height, rounded to the nearest whole inch");
        int height = scan.nextInt();
        System.out.println("Enter your age in years");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your gender");
        String gender = scan.nextLine();
        System.out.println("How often do you exercise?\n enter 1 for little to no,\n enter 2 for light exercise/sports 1-3 days/week \n enter 3 for moderate exercise/sports 3-5 days/week \n enter 4 for hard exercise/sports 6-7 days a week \n enter 5 for very hard exercise/sports & physical job or 2x training ");
        int exercise = scan.nextInt();
        Bmr bmr = new Bmr(gender, height, weight, age, exercise);
        bmr.getBMR();








    }
}
