import java.util.Scanner;

public class SwitchStatements {
//Syntax
        public static void main(String[] args) {
            int day = 3;
            switch(day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;

            }
//Default case
                    switch(day) {
                    case 6:
                        System.out.println("Saturday");
                        break;
                    case 7:
                        System.out.println("Sunday");
                        break;
                    default:
                        System.out.println("Workday");
                }
//The switch Expression

                String dayType  = switch(day) {
                    case 1, 2, 3, 4, 5 -> "Working day";
                    case 6, 7 -> "Weekend";
                    default -> "Invalid day";
                };
                System.out.println(dayType);
//            Your robot can recognize your emotions marked with number that represents each of them:
//            1 - You are happy!
//            2 - You are sad!
//            3 - You are angry!
//            4 - You are surprised!
//            other - "Unknown emotion."
//            Write a program that takes the emotion number as input and outputs the corresponding message in given format.
//            If the input is an emotion that the program doesn’t know, it should output: "Unknown emotion.".
//
//            Sample input
//            1
////          Sample output
//            You are happy!
//            Scanner scanner = new Scanner(System.in);
//            int emo = scanner.nextInt();
            int emotion = 1;
            switch(emotion) {
                case 1:
                    System.out.println ("You are happy!");
                    break;
                case 2:
                    System.out.println ("You are sad!");
                    break;
                case 3:
                    System.out.println ("You are angry!");
                    break;
                case 4:
                    System.out.println ("You are surprised!");
                    break;
                default:
                    System.out.println("Unknown emotion.");
            }

            }

        }
