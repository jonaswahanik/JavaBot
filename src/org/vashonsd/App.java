package org.vashonsd;

import java.io.*;
import java.util.Scanner;


public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

            System.out.println("Enter your weight in pounds:");
            double weight = scan.nextInt();

            System.out.println("Enter your height, rounded to the nearest whole inch");
            int height = scan.nextInt();

            System.out.println("Enter your age in years");
            int age = scan.nextInt();
            scan.nextLine();

            System.out.println("Enter your gender as either male or female");
            String gender = scan.nextLine();

            System.out.println("How often do you exercise?\n enter 1 for little to no,\n enter 2 for light exercise/sports 1-3 days/week \n enter 3 for moderate exercise/sports 3-5 days/week \n enter 4 for hard exercise/sports 6-7 days a week \n enter 5 for very hard exercise/sports & physical job or 2x training ");
            int exercise = scan.nextInt();

            Bmr bmr = new Bmr(gender, height, weight, age, exercise);
            bmr.getCalories();


        System.out.println("Would you like to record your weight?\nEnter yes or no:");
        String record = scan.nextLine();
        scan.nextLine();

        if (record.equals("yes")){
            System.out.println("Enter the month as a number:");
            int month = scan.nextInt();

            System.out.println("Enter the day as a number:");
            int day = scan.nextInt();

            System.out.println("Enter the year:");
            int year = scan.nextInt();

            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(new File("output.txt"), true));
                writer.write("\n" + month + " / " + day + " / " + year + ": " + weight);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Would you like to see previous recorded weights\nEnter yes or no:");
        String read = scan.nextLine();

        if (read.equals("yes")){
            try {
                BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
                String line;
                while((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
