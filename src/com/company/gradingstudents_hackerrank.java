package com.company;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Scanner;

public class gradingstudents_hackerrank {

    public static void main(String[] args){
//        System.out.println(67/5);
//        System.out.println(5*(13+1));
//        List<Integer> list= new ArrayList<>();
//        for(int i=0;i<9;i++){
//            if(i%2==0){
//                list.add(i);
//            }
//        }
//
//        System.out.println(list);

        List<Integer> qslist= new ArrayList<>();
        List<Integer> finallst= new ArrayList<>();


        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter size");
        int nsize= scanner.nextInt();

        for(int i=0;i<nsize;i++){
            int number=scanner.nextInt();
            qslist.add(number);
        }

        finallst= gradingStudents(qslist);

        System.out.println(finallst);

    }



    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> finalgrades= new ArrayList<>();
        for(int i=0;i<grades.size();i++){
            int r,a,n;
            n=grades.get(i);
            if(n%5!=0) {
                r = n / 5;
                a = 5 * (r + 1);

                if ((a - n) < 3 && n >= 38) {
                    finalgrades.add(a);
                }
                else {
                    finalgrades.add(n);
                }
            }
            else {
                finalgrades.add(n);
            }

        }
        return finalgrades;
    }
}
