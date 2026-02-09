package org.studentUtility;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StudentUtilityApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while(true) {

            // Display the Menu options
            System.out.println("==== STUDENT UTILITY APP ====");
            System.out.println("1. Add two numbers ");
            System.out.println("2. Check if a number is EVEN or ODD ");
            System.out.println("3. Print numbers from 1 to N ");
            System.out.println("4. Display day of the week ");
            System.out.println("5. Exit ");

            int choice = scanner.nextInt();

            // based on the option selected, run the methods
            switch (choice) {
                case 1:
                    addNumber();
                    break;
                case 2:
                    checkOddOrEven();
                    break;
                case 3:
                    printNumbers();
                    break;
                case 4:
                    dayOfTheWeek();
                    break;
                case 5:
                    System.out.println("Thank you for using the app");
                    System.exit(0);
                default:
                    System.out.println("Invalid number selected. Please select number from 1 - 5 ");
            }
        }
    }

    //Methods

    public static void addNumber(){
        System.out.println("Enter a number ");
        int num1 = scanner.nextInt();
        System.out.println("Enter another number ");
        int num2 = scanner.nextInt();
        int result = num1 + num2;
        System.out.println(result);
    }

    public static void checkOddOrEven(){
        System.out.println("Enter a number ");
        int number = scanner.nextInt();
        String result = (number % 2 == 0) ? "EVEN" : "ODD";
        System.out.println(result);
    }

    public static void printNumbers(){
        System.out.println("Enter a number ");
        int number = scanner.nextInt();
        for(int i = 1; i <= number; i++){
            System.out.println(i);
        }
    }

    public static void dayOfTheWeek(){
        System.out.println("Enter a whole number");
        int number = scanner.nextInt();

        switch(number){
            case 1:
                System.out.println("1 ---> Monday");
                break;
            case 2:
                System.out.println("2 --> Tuesday");
                break;
            case 3:
                System.out.println("3 --> Wednesday");
                break;
            case 4:
                System.out.println("4 --> Thursday");
                break;
            case 5:
                System.out.println("5 --> Friday");
                break;
            case 6:
                System.out.println("6 --> Saturday");
                break;
            case 7:
                System.out.println("7 --> Sunday");
                break;
            default:
                System.out.println("case --> Invalid day");
        }

    }
}