
package com.company;
        import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int num;
        int seven = 0;
        int counter = 1;
        String response;

        // creating loop
        do {
            System.out.println("Enter a number");
            num = src.nextInt();
            for (int i = num; i <= num; i--) {
                myMethod(i);
                //calling method so that it can run the codes method under it.
            }
            System.out.println("Would you like to enter another number(y/n)");
            response = src.next();
            System.out.println("Would you like to enter anthoer number (y/n)");
            response = src.next();

            // asking and giving the output
        } while (!response.equalsIgnoreCase("n"));
        //condition to end while loop.
    }
    public static void myMethod(int num){
        if(num>0) {
            if (num % 5 == 0 || num % 7 == 0) {
                System.out.println(num);
            }
        }
    }

    }














