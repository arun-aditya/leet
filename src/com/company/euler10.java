package com.company;

import java.math.BigInteger;

public class euler10 {
    public static void main(String[] args){
        long s=0;
        for(int i=0;i<2000000;i++)
            if(isprime(i))
                s+=i;

        System.out.println(s);

    }

    public static boolean isprime(long n){
        if (n < 2) return false;
        else if (n == 2) return true;
        for (int i = 2; i < Math.pow(n, 0.5) + 1; i++)
            if (n % i == 0)
                return false;
        return true;
    }
}
