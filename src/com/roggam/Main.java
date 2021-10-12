package com.roggam;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static String mortgage(){
        // write your code here

        Scanner scanner = new Scanner(System.in);


        double principal;
        while(true){
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextDouble();
            if(principal >= 1000 && principal <= 1000000) {
                break;
            }
            else {
                System.out.println("Enter a number between 1,000 and 1,000,000");
                continue;
            }

        }


        System.out.print("Annual Interest rate: ");
        double  Interest;

        while (true){
            Interest = scanner.nextDouble();

            if(Interest > 0 && Interest <= 30){
                Interest = (Interest / 100) / 12;
                break;
            }
            else {
                System.out.println("Enter a number greater than 0 and less than or equal to 30 ");
                continue;
            }
        }

        System.out.print("Period of Years: ");
        double  loanYears;

        while (true){
            loanYears = scanner.nextDouble();

            if (loanYears >= 1 && loanYears <= 30){
                loanYears = loanYears * 12;
                break;
            }else {
                System.out.println("Enter a value between 1 and 30");
                continue;
            }
        }

        double Mortgage = (principal * Interest) / (1 - Math.pow(1 + Interest, -loanYears));
        String result = NumberFormat.getCurrencyInstance().format(Mortgage);



        return ("Your Monthly payment will be " + result);


    }
    public static void main(String[] args) {

        System.out.println(mortgage());
    }
}
