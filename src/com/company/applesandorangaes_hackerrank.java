package com.company;

public class applesandorangaes_hackerrank {


    public static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int[] newapples= new int[apples.length];
        int[] neworanges= new int[oranges.length];
        int numberofapples=0,numberoforanges=0;

        for(int i=0;i<apples.length;i++){
            newapples[i]= a + apples[i];
        }
        for(int i=0;i<oranges.length;i++){
            neworanges[i]= b + oranges[i];
        }

        for(int i=0;i<newapples.length;i++){
            if(newapples[i]<=t && newapples[i]>=a){
                numberofapples++;
            }
        }

        for(int i=0;i<neworanges.length;i++){
            if(neworanges[i]<=t && neworanges[i]>=a){
                numberoforanges++;
            }
        }

        System.out.println(numberofapples);
        System.out.println(numberoforanges);


    }
}
