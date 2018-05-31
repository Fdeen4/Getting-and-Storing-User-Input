package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

String firstInitial;
String lastName, streetName, streetType, city;
int houseNumber;

        Scanner keyboard = new Scanner(System.in);



        System.out.print("Enter your first Initial: ");
        firstInitial = keyboard.next();

        System.out.print("Enter your last name: ");
        lastName = keyboard.next();

        System.out.print("Enter street name: ");
        streetName = keyboard.next();

        System.out.print("Enter street type: ");
        streetType = keyboard.next();

        System.out.print("Enter city: ");
        city = keyboard.next();

        System.out.print("Enter house number: ");
        houseNumber = keyboard.nextInt();

        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);

    }
}
