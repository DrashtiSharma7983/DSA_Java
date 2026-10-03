package com.ArraysPart1;

public class BinarySearch {

    public static int binarySearch(int num[],int key){
        int start=0;
        int end=num.length-1;

        while(start<=end){
            int mid = (start + end)/2;
           //comparison
           if(num[mid] == key){
               return mid;
           }
           if(num[mid] < key){
               start = mid+1;
           }
           else {
               end = mid-1;
           }

        }
        return -1;
    }

    public static void main(String[] args){
        int num[] = {2,4,6,8,10};
        int key = 4;
        int keyFound = binarySearch(num,key);
        System.out.println("Key is found at index: "+keyFound);
    }
}
