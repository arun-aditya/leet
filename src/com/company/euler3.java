package com.company;

import java.math.BigInteger;

public class euler3 {

    public static void main(String[] args) {
	        BigInteger big=new BigInteger("31554");
	        long k= big.longValue();
	        for(int i=2;i<k;i++){
	            while(k%i==0 && k!=i){
                        k=k/i;
	            }
            }
	        System.out.println(k);
    }
}
