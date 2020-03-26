package com.fizzbuzz.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.IntStream;

@SpringBootApplication
public class DemoApplication {

    public static final int START = 1;
    public static final int END = 100;


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		//if program argument is provided and its 2, create a FizzBuzzer2
		String fizzBuzzerName = "1";
        if (args.length == 1 && args[0].equals("2"))
           fizzBuzzerName = "2";


        // build fizzbuzzer
        FizzBuzzer fb = FizzBuzzerFactory.BuildFizzBuzzer(fizzBuzzerName);

        // apply a fizzbuzzer to the range and then print the output in the console
        IntStream.range(START, END).mapToObj(x->fb.fuzzbuzz(x)).forEach(x ->System.out.println(x));
	}

}
