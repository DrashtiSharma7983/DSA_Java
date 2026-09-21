package com.practice;
import java.util.Scanner;
public class BinaryToDecimal {
    public static void binToDec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int dec = 0;
        while(binNum >0){

            int LD = binNum % 10;
            dec = dec + (LD* (int)Math.pow(2,pow));
            binNum = binNum/10;
            pow++;
        }
        System.out.print("Decimal of "+myNum+" is: "+dec);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        binToDec(n);
    }
}
