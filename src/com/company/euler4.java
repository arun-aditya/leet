package com.company;

public class euler4 {
    public static void main(String[] args){

        int largestpalindromenumber=0;
        for(int i=100;i<1000;i++){
            for(int j=100;j<1000;j++){
                if(pal(i*j) && i*j>largestpalindromenumber)
                    largestpalindromenumber=i*j;
            }
       }
        System.out.println(largestpalindromenumber);
    }
    public static boolean pal(int n){
        int r=0,x;
        int num=n;

        while(num>0){
            x=num%10;
            r=r*10+x;
            num=num/10;
        }
        if(n==r)
            return true;
        else
            return false;
    }
}
