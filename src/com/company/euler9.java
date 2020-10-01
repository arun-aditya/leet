package com.company;

public class euler9 {
    public static  void main(String[] args){
        int a=0,b=0,c=0,s=1000;
        boolean t=false;
        for(int i=0;i<1000/3;i++){
            for(int j=0;j<1000/2;j++){
                c=s-i-j;

                if (i*i + j*j ==c*c){
                    t=true;
                    System.out.println(i*j*c);
                    System.out.println(j);
                    break;
                }
            }
            if(t){
                System.out.println(i);
                break;
            }

        }
        System.out.println(c);
    }
}
