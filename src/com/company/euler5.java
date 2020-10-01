package com.company;

public class euler5 {
    public static void main(String[] args){
        int k=0;
        for(int i=1;k==0;i++){
            int t=0;
            for(int j=1;j<=20;j++){
                if(i%j!=0){
                    t=1;
                    break;
                }
            }
            if(t==0){
                k=1;
                System.out.println(i);}
        }
    }
}
