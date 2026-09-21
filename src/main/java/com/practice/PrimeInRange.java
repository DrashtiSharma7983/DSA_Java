package com.practice;

import java.util.Scanner;


public class PrimeInRange {

        public static void primeInRange(int n){
            for(int i=2; i<=n; i++){
                if(primeNum(i)){
                    System.out.print(i+" ");
                }

            }
        }

        public static boolean primeNum(int n){
            boolean isPrime = true;
            for(int i=2; i<=n-1; i++){
                if(n%i == 0){
                    isPrime = false;
                    break;
                }
            }
            return isPrime;
        }

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number: ");
            primeInRange(23);
        }
}
