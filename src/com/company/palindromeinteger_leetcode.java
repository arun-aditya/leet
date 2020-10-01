package com.company;

import java.util.Scanner;

public class palindromeinteger_leetcode {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter number:");
        int n=scanner.nextInt();
        if(isPalindrome(n)){
            System.out.println("yes");
        }
        else {
            System.out.println("no");

        }
    }

    public static boolean isPalindrome(int num){
        int r,s=0,number=num;
        if(number<0){
            return false;
        }
        while (number!=0){
            r=number%10;
            s= s*10 +r;
            number/=10;
        }
        if (s==num){
            return true;
        }
        else {
            return false;
        }
    }
}
