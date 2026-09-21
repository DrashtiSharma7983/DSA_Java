package com.practice;

import java.util.Scanner;

public class Factorial {
    public static int factOfNum(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to print factorial: ");
        int n = sc.nextInt();
        int facto = factOfNum(n);
        System.out.println(facto);
    }

}
