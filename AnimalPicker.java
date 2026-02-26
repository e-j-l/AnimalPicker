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
            System.out.println("Which animal would you like to see: a dog, cat, fish, or moose?");
            String animal = scanner.nextLine();

            // check which animal and prints image statement
            if(animal.equals("dog")) {
                valid = true;
                System.out.println("/^-----^\\\nV  o o  V\n |  Y  |\n  \\ Q /\n  / - \\\n  |    \\\n  |     \\     )\n  || (___\\====\n");

            } else if(animal.equals("cat")) {
                valid = true;
                System.out.println("                        _\n                       | \\\n                       | |\n                       | |\n  |\\                   | |\n /, ~\\                / /\nX     `-.....-------./ /\n ~-. ~  ~              |\n    \\             /    |\n     \\  /_     ___\\   /\n     | /\\ ~~~~~   \\ |\n     | | \\        || |\n     | |\\ \\       || )\n    (_/ (_/      ((_/\n");

            } else if(animal.equals("fish")) {
                valid = true;
                System.out.println("      /`·.¸\n     /¸...¸`:·\n ¸.·´  ¸   `·.¸.·´)\n: © ):´;      ¸  {\n `·.¸ `·  ¸.·´\\`·¸)\n     `\\\\´´\\¸.·´");

            }else if (animal.equals("moose")){
                System.out.println("                                          .      //\n                                       /) \\ |\\    //\n  VK                             (\\\\|  || \\)u|   |F     /)\n                                  \\```.FF  \\  \\  |J   .\'/\n                               __  `.  `|   \\  `-\'J .\'.\'\n        ______           __.--\'  `-. \\_ J    >.   `\'.\'   .\n    _.-\'      \"\"`-------\'           `-.`.`. / )>.  /.\' .<\'\n  .\'                                   `-._>--\' )\\ `--\'\'\n  F .                                          (\'.--\'\"\n (_/                                            \'\\\n  \\                                             \'o`.\n  |\\                                                `.\n  J \\          |              /      |                \\\n   L \\                       J       (             .  |\n   J  \\      .               F        _.--\'`._  /`. \\_)\n    F  `.    |                       /        \"\"   \"\'\n    F   /\\   |_          ___|   `-_.\'\n   /   /  F  J `--.___.-\'   F  - /\n  /    F  |   L            J    /|\n (_   F   |   L            F  .\'||\n  L  F    |   |           |  /J  |\n  | J     `.  |           | J  | |              ____.---.__\n  |_|______ \\  L          | F__|_|___.---------\'\n--\'        `-`--`--.___.-\'-\'---");
            } else {
                System.out.println("Error: Unknown animal, please try again");

            }

        }

        scanner.close();

    }
}
