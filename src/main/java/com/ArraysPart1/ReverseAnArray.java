package com.ArraysPart1;

public class ReverseAnArray {
    public static void reverseAnArray(int num[]){
             int start = 0;
             int end = num.length-1;

             while(start<end){
                 int temp = 0;

                 temp = num[start];
                 num[start] = num[end];
                 num[end] = temp;

                 start++;
                 end--;
             }
    }

    public static void main(String[] arg){
        int num[] = {2,4,6,8,10};
        reverseAnArray(num);

        //print reverse array
        for(int i = 0; i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}
