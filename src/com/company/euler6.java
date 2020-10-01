package com.company;

public class euler6 {
    public static void main(String[] args){
        int s1=0,s2=0;
        for(int i=1;i<=100;i++){
            s1+=i;
            s2+=Math.pow(i,2);
        }
        int x= (int) Math.pow(s1,2);
        System.out.println(x-s2);
    }
}
