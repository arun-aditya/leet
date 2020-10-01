package com.company;

public class euler2 {
    public static void main(String[] args){
        int sum=0;
            for(int i=1;sum<4000000;i++){
                if(fibonacci(i)%2==0)
                    sum+=fibonacci(i);
            }
        System.out.println(sum);
    }


    //function to find fibonacci
    public static long fibonacci(int num){
        if(num==1)
            return 1;
        else if (num==2)
            return 2;
        else
            return fibonacci(num-2)+fibonacci(num-1);
    }

}
