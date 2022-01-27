import java.io.*;
import java.util.Scanner;


public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
            // finds weight of the person
            System.out.println("Enter your weight in pounds:");
            double weight = scan.nextInt();

            //finds height of the person
            System.out.println("Enter your height in inches, rounded to the nearest whole inch");
            int height = scan.nextInt();

            //finds age of the person
            System.out.println("Enter your age in years");
            int age = scan.nextInt();
            scan.nextLine();

            //finds gender and makes sure there was no user error
            String gender = "";
            while(true){
            System.out.println("Enter your gender as either male or female");
            gender = scan.nextLine();
            if (gender.equals("male") || gender.equals("female")) {
                break;
            }
            else {
                System.out.println("I did not understand your input, make sure that is is the same as in the question ");
                continue;
                }
            }

            //finds how much user exercises and checks for user error
            int exercise = 0;
            while (true) {
                System.out.println("How often do you exercise?\n enter 1 for little to no,\n enter 2 for light exercise/sports 1-3 days/week \n enter 3 for moderate exercise/sports 3-5 days/week \n enter 4 for hard exercise/sports 6-7 days a week \n enter 5 for very hard exercise/sports & physical job or 2x training ");
                exercise = scan.nextInt();
                scan.nextLine();
                if (exercise > 5 || exercise < 1) {
                    System.out.println("I did not understand your input, make sure it is answered how the question asked");
                    continue;
                }
                else {
                    break;
                }
            }

            // creates new bmr object
            Bmr bmr = new Bmr(gender, height, weight, age, exercise);
            //prints calories using getCalories method
            bmr.getCalories();


        System.out.println("Would you like to record your weight?\nEnter yes or no:");
        String record = scan.nextLine();


        // takes date and writes date with weight to output.txt but does not overwrite past entries and checks month and day for user error
        if (record.equals("yes")){
            int month = 0;
            int day = 0;
            while(true) {
                System.out.println("Enter the month as a number:");
                month = scan.nextInt();

                System.out.println("Enter the day as a number:");
                day = scan.nextInt();
                if (day > 31 || month > 12) {
                    System.out.println("please review your input, it appears either date or month is a impossible number");
                    continue;
                }
                else {
                    break;
                }
            }

            System.out.println("Enter the year:");
            int year = scan.nextInt();
            scan.nextLine();

            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(new File("output.txt"), true));
                writer.write("\n" + month + " / " + day + " / " + year + ": " + weight + " lbs");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        System.out.println("Would you like to see previous recorded weights\nEnter yes or no:");
        String read = scan.nextLine();

        //reads the contents of output.txt, which is the recorded weights
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
