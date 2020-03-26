package com.fizzbuzz.demo;

/**
 * FizzBuzzer factory
 * by default builds basic FizzBuzzer 1
 */
public class FizzBuzzerFactory {
    // build method
    public static FizzBuzzer BuildFizzBuzzer(String fizzBuzzerName)
    {
        if (fizzBuzzerName.equals("2"))
            return new FizzBuzzer2();

        // default case: 1 or anything else
        return new FizzBuzzer1();
    }
}
