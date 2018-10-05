package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int num;
        int seven = 0;
        int counter = 1;



        String response;
        System.out.println("Enter a number");
        num = src.nextInt();

        while(num>=0){

            System.out.println(num);
            seven = num / 7;
            System.out.println(seven * 7);
            num =  num - counter * 5;
            counter++;
            }
                    System.out.println("Would you like to enter another number(y/n)");
                    response = src.next();
                    if (response.equals("y")) {
                        System.out.println("Enter a number");
                        num = src.nextInt();
                    } else
                        System.out.println("Thanks for Playing!");
                }









    }
