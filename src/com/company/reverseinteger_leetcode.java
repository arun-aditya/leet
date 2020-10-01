package com.company;

import java.util.Scanner;

public class reverseinteger_leetcode {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter number?");
        int number=scanner.nextInt();
        int k=reverse(number);
        System.out.println(k);
    }

    public static int reverse(int x){
        int r,s=0,n;
        if(x<0){
            n=x*(-1);
        }
        else{
            n=x;
        }
        while (n!=0){
            r=n%10;
            s=(10*s) +r;
            n= n/10;
        }
        if(x<0){
            s=s*(-1);
        }
        return s;
    }
}

//1534236469

