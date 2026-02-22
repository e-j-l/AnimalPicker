/*
Emmett Leary
*/

import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // craetes loop to continuously ask for inputs until a valid one is detected
        boolean valid = false;

        while(!valid) {

            // ask user which animal they want to see
            System.out.println("Which animal would you like to see: a dog or a cat?");
            String animal = scanner.nextLine();

            // check which animal and prints image statement
            if(animal.equals("dog")) {
                valid = true;
                System.out.println("DOG ASCII ART HERE");

            } else if(animal.equals("cat")) {
                valid = true;
             System.out.println("CAT ASCII ART HERE");

            } else {
                System.out.println("Error: Unknown animal, please try again");

            }

        }
        scanner.close();

    }
}
