package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class lenghtoflongestsubstring_leetcode {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a string");
        String str= scanner.nextLine();

        int number=lengthoflongestsubstring2(str);
        System.out.println(number);
    }


//    method 1:

    public static int lenghtoflongestsubstring(String string){
          int n=string.length();
          int max=0;
          for(int i=0;i<=n;i++){
              for(int j=i+1;j<=n;j++){
                  if(repetionisnotthere(string,i,j)){
                      max= Math.max(max,j-i);
                  }
              }
          }
          return max;

    }

    public static boolean repetionisnotthere(String s, int a, int b){
        Set<Character> set=new HashSet<>();
        for(int i=a;i<b;i++) {
            Character ch= s.charAt(i);
            if(set.contains(ch)){
                return  false;
            }
            set.add(ch);
        }
        return true;
    }


//  method 2:

    public static int lengthoflongestsubstring2(String string){
        int n= string.length();
        Set<Character> set= new HashSet<>();
        int i=0,j=0,max=0;
        while(i<n && j<n){
            if(! set.contains(string.charAt(j))){
                set.add(string.charAt(j++));
                max = Math.max(max, j-i);
            }
            else{
                set.remove(string.charAt(i++));
            }
        }
        return max;
    }

}
