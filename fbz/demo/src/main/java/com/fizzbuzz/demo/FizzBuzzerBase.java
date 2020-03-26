package com.fizzbuzz.demo;

/**
 * FizzBuzzerBase
 * implements the fizzbuzz() method
 * relies on derived classes to implement cond3 and cond5
 */
public abstract class FizzBuzzerBase implements FizzBuzzer {

    // abstract methods
    protected abstract boolean cond3(int num , String sNum);
    protected abstract boolean cond5(int num , String sNum);

    // generic fizzbuzz
    public String fuzzbuzz(int num){
        String sNum = Integer.toString(num);

        boolean check3 = cond3(num, sNum);
        boolean check5 = cond5(num, sNum);

        if (check3 && check5){
            return "FizzBuzz";
        }
        if (check3){
            return "Fizz";
        }
        if (check5){
            return "Buzz";
        }
        return sNum;
    }


}
