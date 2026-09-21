package com.practice;

import java.util.Scanner;

public class BinomialCoefficient {

    public static int factOfNum(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static int binoCoeff(int n, int r){
        int nFact = factOfNum(n);
        int rFact = factOfNum(r);
        int nMrFact = factOfNum(n-r);

        int bino = nFact/(rFact * nMrFact);

        return bino;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number n: ");
        int n = sc.nextInt();

        System.out.print("Enter number r: ");
        int r = sc.nextInt();

        int binoCo = binoCoeff(n,r);
        System.out.println(binoCo);
    }
}
