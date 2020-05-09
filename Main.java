import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // AsciiChars.printNumbers();
        // AsciiChars.printUpperCase();
        // AsciiChars.printLowerCase();

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?   ");
        String name = scanner.next();

        System.out.println("Hello " + name + ","
                + " Do you wish to continue to the interactive portion? \n Enter 'Yes' or 'No' to continue:");
        String answer = scanner.next();

        switch (answer) {
            case "Yes":
            case "yes":
                System.out.println("Happy to continue!!");
                break;
            case "No":
            case "no":
                System.out.println("Thank you for visiting.See you later.");
                break;
            default:
                System.out.println("Enter correct option.");
                break;
        }
        String playMore;
        boolean userAns = true;
        do {
            System.out.print("Do you have a red car?(yes or no)  ");
            String car = scanner.next();

            System.out.print("Write the name of your favorite pet :  ");
            String pet = scanner.next();

            System.out.print("Write the age of your favorite pet:  ");
            int petAge = scanner.nextInt();

            System.out.print("Write your lucky number:  ");
            int luckyNum = scanner.nextInt();

            System.out.print("Do you have a favorite quarterback?   ");
            String play = scanner.next();

            switch (play) {
                case "Yes":
                case "yes":
                    System.out.print("What is their jersey number?   ");
                    int jerseyNum = scanner.nextInt();
                    break;
                default:
                    break;
            }
            System.out.print("What is two-digit model year of your car?  ");
            int modelCar = scanner.nextInt();

            System.out.print("What is first name of your favorite actor or actress?    ");
            String actor = scanner.next();

            System.out.print("Enter a random number between 1 and 50:  ");
            int randNum = scanner.nextInt();

            Random rand = new Random();
            int upperbound = 76;
            // int int_random = rand.nextInt();

            int random_int1 = rand.nextInt(upperbound);
            int random_int2 = rand.nextInt(upperbound);
            // int random_int3 = rand.nextInt(upperbound);

            int magicBall = random_int1 * luckyNum;
            while (magicBall > 75) {
                magicBall = magicBall - 75;
            }
            // System.out.println(magicBall);
            // no 1
            int petNum = pet.charAt(2);
            while (petNum > 60) {
                petNum = petNum - 60;
            }
            // no 2
            int num2 = 42;
            // no 3
            int num3 = modelCar + luckyNum;
            // no 4
            int num4 = petAge + modelCar;
            // n0 5
            int num5 = randNum - random_int2;
            if (num5 < 1) {
                num5 = num5 + 64;
            }
            System.out.println("The lottery numbers are:" + petNum + "," + num2 + "," + num3 + "," + num4 + "," + num5
                    + "  Magic Number:" + magicBall);

            System.out.print("Do u want to play again? :  ");
            playMore = scanner.next();

            if (playMore.equalsIgnoreCase("YES")) {
                userAns = true;
            } else {
                userAns = false;
                System.out.print("Thanks for playing.");

            }
        } while (userAns);
        scanner.close();
    }
}