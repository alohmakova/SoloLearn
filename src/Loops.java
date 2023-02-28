import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
////Цикл While
        int x = 3;
        while (x > 0) {
            System.out.println (x);
            x--;
        }
        int y = 6;

        while (y < 10) {
            System.out.println (y);
            y++;
        }
        System.out.println ("Loop ended");
////For your math class you need a program to calculate the factorial of a number.
////You're given a program which takes a number as input.
////
////Task
////Complete the program to calculate the factorial of the given number and output it.
////
////Sample input
////6
////
////Sample output
////720
////
////Explanation
////The factorial of a number is equal to the product of all numbers less than or equal to the given number.
////The factorial of 6 will be 6*5*4*3*2*1 = 720.
////
////Hint
////Use while loop to calculate the factorial of the number.
        int number = 6;
        int fact = 1;
        while (number >= 1) {

            fact = fact * (number);
            number--;

        }
        System.out.println (fact);
////Цикл for
////You are given code that takes the number of students who enter the university as input. Let's greet them!
////Task
////Complete the program to output "Welcome" for each student.
////Sample Input
////2
////Sample Output
////Welcome
////Welcome
        Scanner scanner = new Scanner(System.in);
        for(int n = scanner.nextInt(); n > 0; n--) {
            System.out.println ("Welcome");
        }
////Цикл do while
////You're creating a bank security system. The user must insert the correct password in order to access payments.
////The password is 8819.
////Task
////Write a program that will continuously take a password as input and output Write password, until the client inserts the correct password.
//
////Sample Input
////3332
////8819
//
////Sample Output
////Write password
////Write password
////Use Scanner in a do while loop to take input continuously
        Scanner read = new Scanner(System.in);
        int password;
        do {
            password = read.nextInt();
            System.out.println("Write password");
        } while (password!=8819);

//You take a loan from a friend and need to calculate how much you will owe him after 3 months.
//You are going to pay him back 10% of the remaining loan amount each month.
//Create a program that takes the loan amount as input, calculates and outputs the remaining amount after 3 months.
//
//Sample Input: 20000
//Sample Output: 14580
//        Here is the monthly payment schedule:
//        Month 1
//        Payment: 10% of 20000 = 2000
//        Remaining amount: 18000
//        Month 2
//        Payment: 10% of 18000 = 1800
//        Remaining amount: 16200
//        Month 3:
//        Payment: 10% of 16200 = 1620
//        Remaining amount: 14580

        int amount = scanner.nextInt();
        int mon = 0;
        while (mon != 3) {

            amount = amount - amount / 10;
            mon++;
        }
        System.out.println (amount);
    }
}
