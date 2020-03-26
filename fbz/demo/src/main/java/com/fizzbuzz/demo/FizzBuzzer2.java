package com.fizzbuzz.demo;

/**
 * Standard FizzBuzzer
 * check if number divides by 3 or 5 and if number contains 3 or 5
 */
public final class FizzBuzzer2 extends FizzBuzzerBase {

    public boolean cond3(int num , String sNum){
        return  num % 3 == 0 || sNum.contains("3");
    }

    public boolean cond5(int num , String sNum){
        return  num % 5 == 0 || sNum.contains("5");
    }
}
