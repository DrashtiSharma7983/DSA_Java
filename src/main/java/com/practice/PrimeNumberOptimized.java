package com.practice;
import java.util.Scanner;
public class PrimeNumberOptimized {
    public static void primeOptimized(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n==2){
                System.out.print("The number is prime.");
            }
            if(n%i == 0){
                System.out.print("The number is not prime.");
            }
        }
        System.out.print("The number is prime.");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        primeOptimized(n);
    }
}
