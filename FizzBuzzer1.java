package com.fizzbuzz.demo;

/**
 * Standard FizzBuzzer
 * check if number divides by 3 or 5
 */
public final class FizzBuzzer1 extends FizzBuzzerBase {

    protected boolean cond3(int num , String sNum){
        return  num %3 == 0;
    }
    protected boolean cond5(int num , String sNum){
        return  num %5 == 0;
    }
}
