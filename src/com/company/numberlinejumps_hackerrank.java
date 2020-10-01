package com.company;

import java.util.ArrayList;
import java.util.List;

public class numberlinejumps_hackerrank {

    public static void main(String[] args){
        System.out.println(kangaroo(21,6,47,3));
    }




    public static String kangaroo(int x1, int v1, int x2, int v2) {
        String ans="NO";
        if(x1<x2 && v1<v2 || x2<x1 && v2<v1){
            ans="No";

        }

        else{
            int[] jumpsarrayk1= new int[1000];
            int[] jumpsarrayk2= new int[1000];
            List<Integer> jumpk1= new ArrayList<>();
            List<Integer> jumpk2= new ArrayList<>();

            int sum1=x1,sum2=x2;
            jumpsarrayk1[0]=x1;
            jumpsarrayk2[0]=x2;


            for(int i=1; i<1000 ;i++){
                sum1+=v1;
                sum2+=v2;
                jumpsarrayk1[i]=sum1;
                jumpsarrayk2[i]=sum2;
            }

            for(int i=0;i<jumpsarrayk1.length;i++){
                if(jumpsarrayk1[i]==jumpsarrayk2[i]){
                    ans="Yes";
                    break;
                }
            }
        }

        return ans;

    }
}
