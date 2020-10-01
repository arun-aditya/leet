package com.company;

import java.util.Scanner;

public class longestpalindromesubstring_leetcode {

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the string");
        String str= scanner.nextLine();
        String ko= longestpoalindrome(str);
        System.out.print(ko);
    }

    public static String longestpoalindrome(String string){
        int n=string.length();
        int max=0;
        String p="jnfj";
        for(int i=0;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                if(ispalindrome(string,i,j)){
                    p= string.substring(string.indexOf(i),string.indexOf(j));
                }
            }
        }
    return p;
    }


    public static boolean ispalindrome(String s, int a, int b){
        int i,j, n=s.length();
        for(i=a,j=b;i<b;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
