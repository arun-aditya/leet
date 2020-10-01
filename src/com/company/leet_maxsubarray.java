package com.company;

import java.util.Arrays;

public class leet_maxsubarray {
    public static void main(String[] args){
        int[] nums= new int[]{-1,3,-3,-4,-5,-9,-8};

        int i=0, max=nums[i],sum=0;
        int l= nums.length;
        int[] b= new int[l];
        while(i!=l){
            b[i]= nums[i];
            i++;
        }
        Arrays.sort(b);
        if(b[l-1]<0){
            System.out.println(b[l-1]);
        }

        i=0;
        while(i!=l){
            sum+=nums[i];
            if(sum<0){
                sum=0;
            }
            else if (sum>max)
                max=sum;
            i++;
        }
        System.out.println(max);
        System.out.println(nums.length);
    }
}
