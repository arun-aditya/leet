package com.company;

import java.util.Scanner;

public class containerwithmostwater_leetcode {
    public int maxArea(int[] height) {

        int max=0;
        int left=0;
        int right=height.length-1;

        while(left<right){
            max=Math.max(max, (right-left) * Math.min(height[left],height[right]));
            if(height[left]< height[right]){
                left++;
            }
            else{
                right--;
            }
        }

        return max;
    }

    public static void main(String[] args){
           Scanner scanner=new Scanner(System.in);

    }
}
