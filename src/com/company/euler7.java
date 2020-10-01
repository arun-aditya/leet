package com.company;

public class euler7 {
    public static void main(String[] args){
        int c=0,i,largest=0;
            for(i=2;c<10001;i++){
                int t=1;
                for(int j=2;j<(i/2)+1;j++){
                    if(i%j==0){
                        t=t*0;
                        break;}
                }
                if(t==1){
                    c++;
                    largest=i;
                }
            }
            System.out.println(largest);
    }
}
