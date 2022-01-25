package org.vashonsd;
public class Bmr {
    static String gender;
    static int height;
    static double weight;
    static int age;
    static int exercise;


    public Bmr(String gender, int height, double weight, int age, int exercise) {
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.exercise = exercise;

    }

    public double getBMR() {
        double usersBMR1;
        if (gender.equals("male")) {
            usersBMR1 = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
        } else {
            usersBMR1 = 665 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
        }
        return usersBMR1;


    }

    public void getCalories() {
        double userBmr = getBMR();

        if (exercise == 1) {
            System.out.println("You should be eating " + (int)(userBmr * 1.2) + " calories per day");

        } else if (this.exercise == 2) {
            System.out.println("You should be eating " + (int)(userBmr * 1.375) + " calories per day");

        } else if (this.exercise == 3) {
            System.out.println("You should be eating " + (int)(userBmr * 1.55) + " calories per day");

        } else if (this.exercise == 4) {
            System.out.println("You should be eating " + (int)(userBmr * 1.725) + " calories per day");

        } else {
            System.out.println("You should be eating " + (int)(userBmr * 1.9) + " calories per day");

        }
    }
}

