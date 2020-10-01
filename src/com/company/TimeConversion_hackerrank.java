package com.company;

import javax.print.DocFlavor;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion_hackerrank {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */

        String timelist[]=s.split(":");
        String hours= timelist[0];
        String min= timelist[1];
        String sec= timelist[2].substring(0,2);
        String meridiem= timelist[2].substring(2,4);

        if(meridiem.equals("AM")){
            if(hours.equals("12")){
                hours="00";
            }
        }
        else{
            if(!hours.equals("12")){
                int h=Integer.parseInt(hours);
                h=h+12;
                hours=""+h;
            }
        }
        String newtime=(hours+":"+min+":"+sec);

        return newtime;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}