package com.company;

import java.util.HashMap;

public class inttoroman_leetcode {
    public static void main(String[] args){
        System.out.println( inttoroman(9));

    }

    public static String inttoroman(int number){
        HashMap<Integer, String > inttoromanhashmap= new HashMap<>();
        inttoromanhashmap.put(1,"I");
        inttoromanhashmap.put(4,"IV");

        inttoromanhashmap.put(5,"V");
        inttoromanhashmap.put(9,"IX");

        inttoromanhashmap.put(10,"X");
        inttoromanhashmap.put(40,"XL");

        inttoromanhashmap.put(50,"L");
        inttoromanhashmap.put(90,"XC");

        inttoromanhashmap.put(100,"C");
        inttoromanhashmap.put(400,"CD");

        inttoromanhashmap.put(500,"D");
        inttoromanhashmap.put(900,"CM");

        inttoromanhashmap.put(1000,"M");


        int[] seq= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        StringBuffer stringBuffer= new StringBuffer();

        for(int i=0;i<seq.length;i++){
            int base= seq[i];

            while(number>=base){
                stringBuffer.append(inttoromanhashmap.get(base));
                number-=base;
            }
        }
        return stringBuffer.toString();


    }
}
