package com.example.demo;

import java.util.Scanner;

public class Classwork {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String name = keyboard.nextLine();
        double gpa = keyboard.nextDouble();
        int credits  = keyboard.nextInt();
        double major_gpa = keyboard.nextDouble();
        double acct = keyboard.nextDouble();

        System.out.println("Name :" + name );
        System.out.println("GPA :" + gpa );
        System.out.println("Credits :" + credits);

        if (gpa >= 1.0 && credits >= 120 && acct==0.0 && major_gpa >= 2.5)
        {
            System.out.print("Can Graduate");
        } else
        {
            System.out.print("Can NOT Graduate");
        }

        System.out.print(name.charAt(1));

    }

}