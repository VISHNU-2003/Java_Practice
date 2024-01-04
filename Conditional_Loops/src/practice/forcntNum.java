package practice;

import java.math.BigInteger;

public class forcntNum {
    public static void main(String[] args) {
        long n = 8885880648L;
        int count = 0;
        for(;n>0;n=n/10){
            long rem = n%10;
            if(rem == 8){
                count ++;
            }
        }
        System.out.println(count);

    }
}
