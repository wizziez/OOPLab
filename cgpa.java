package com.example.Name_Roll_CGPA;

import java.util.Scanner;

public class Name_Roll_CGPA {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter your class roll: ");
        long roll = a.nextLong();
        System.out.println("Enter your name: ");
        // Use nextLine() to read the entire line
        String name = a.nextLine();
        System.out.println("Enter your CGPA: ");
        double cgpa = a.nextDouble();
        System.out.println("Roll: " + roll + "\n" + "Name: " + name + "\n" + "CGPA: " + cgpa);
    }
}
