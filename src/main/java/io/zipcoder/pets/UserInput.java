package io.zipcoder.pets;

import java.util.Scanner;

public class UserInput {

    public Scanner scanner = new Scanner(System.in);

    public void getPetInfo() {
        System.out.println("How many pets do you have?");
        int numberOfPets = scanner.nextInt();

        System.out.println("What type(s) of pet(s) do you have?");
        String petType = scanner.next();

        System.out.println("What is/are the name(s) of your pet(s)?");
        String petName = scanner.next();
    }
}




