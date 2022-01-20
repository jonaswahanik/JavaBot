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

    public void getBMR() {
        double usersBMR1;
        if (gender.equals("male")) {
            usersBMR1 = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
            //String usersBMR = Double.toString(usersBMR1);
            System.out.println(usersBMR1);


        } else {
            usersBMR1 = 665 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
            //String usersBMR = Double.toString(usersBMR1);
            System.out.println("wYour BRM is: " + usersBMR1);

        }
        //return usersBMR1;


    }

    public int getCalories() {
        
        if (exercise == 1) {

        } else if (this.exercise == 2) {

        } else if (this.exercise == 3) {

        } else if (this.exercise == 4) {

        } else {

        }


    }
}


