package com.company;
/* IMPORTANT: Multiple classes and nested static classes are supported */


//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
         */

        //Scanner
        Scanner s = new Scanner(System.in);
        System.out.println("enter number of participants");
        int n = s.nextInt();                 // Reading input from STDIN
        // System.out.println("Hi, " + name + ".");    // Writing output to STDOUT



        // Write your code here

        int[][] rarray=new int[n][n];
        int[] narray= new int[n];
        int sum=0,sumsum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println("Enter number");
                rarray[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            sum+=rarray[i][0];
            sumsum=0;
            for(int j=1;j<n;j++){
                sumsum+=rarray[i][j];
            }
            sumsum+=sum;
            narray[i]=sumsum;
        }

        Arrays.sort(narray);

        int num= narray[n-1];

        System.out.println(num);


    }

}

