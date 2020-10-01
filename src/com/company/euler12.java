package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class euler12 {
    public static void main(String[] args){
       int[] ar=new int[501];

    }

    public static List getdivisors(long num){
        List<Integer> arr=new ArrayList<>();
        int i=0;
        for(int j=1;j<=num;j++){
           if(num%j==0){
               arr.add(j);
           }
       }
       return arr;
    }
}
