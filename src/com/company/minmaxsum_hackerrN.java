package com.company;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

    public class minmaxsum_hackerrN {

        // Complete the miniMaxSum function below.
        static void miniMaxSum(long[] arr) {

            long[] sumarray= new long[arr.length];
            long[] demoarray;
            demoarray=arr;
            for (int i=0;i<arr.length;i++){
                long sum=0;
                for(int j=0;j<arr.length;j++){
                    if(i!=j){
                        sum+=demoarray[j];
                    }
                }
                sumarray[i]=sum;

            }
            Arrays.sort(sumarray);
            System.out.print(sumarray[0]+" ");
            System.out.print(sumarray[arr.length-1]);

        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            long[] arr = new long[5];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < 5; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }

            miniMaxSum(arr);

            scanner.close();
        }
    }