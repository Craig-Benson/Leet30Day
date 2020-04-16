package com.company;

public class Happy {


    public static void main(String[] args){
        isHappy(2);
    }

    public static boolean isHappy(int n) {

        int in = n;

        boolean happy = false;

        return recursion(n);

    }

    public static boolean recursion(int in) {
        int firstDigit =0;
        int secondDigit =0;
        int thirdDigit =0;

        if(in == 1){
            return true;
        }
if(in >= 100){
     firstDigit = in / 100;
     secondDigit = (in / 10) % 10;
     thirdDigit = in % 10;
}else if(in < 10){
    firstDigit = in % 10;
    secondDigit = in / 10;
    thirdDigit = in / 100;

}else if(in > 10){

    firstDigit = in / 10;
    secondDigit = in % 10;
    thirdDigit = in / 100;

}
        firstDigit *= firstDigit;
        secondDigit *= secondDigit;
        thirdDigit *= thirdDigit;


        return recursion(firstDigit + secondDigit + thirdDigit);
    }
    }

