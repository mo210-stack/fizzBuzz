package com.fizzbuzz.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void testFizzBuzz1() {
	    FizzBuzzer fb = new FizzBuzzer1();

	    String [] expected = { "0", "1" ,"2" , "Fizz","4" , "Buzz","Fizz","7", "8","Fizz","Buzz",
                               "11","Fizz","13","14", "FizzBuzz", "16","17","Fizz","19","Buzz",
                               "Fizz", "22", "23", "Fizz","Buzz"};

	    for (int i = 1 ; i < expected.length; i++){
	        assertEquals(expected[i], fb.fuzzbuzz(i), "expected "+   expected[i]);

	    }

        assertEquals("52", fb.fuzzbuzz(52));
        assertEquals("352", fb.fuzzbuzz(352));
        assertEquals("532", fb.fuzzbuzz(532));
	}

    @Test
    void testFizzBuzz2() {
        FizzBuzzer fb = new FizzBuzzer2();

        String [] expected = { "0", "1" ,"2" , "Fizz","4" , "Buzz","Fizz","7", "8","Fizz","Buzz",
                               "11","Fizz","Fizz","14","FizzBuzz","16","17","Fizz","19","Buzz",
                               "Fizz", "22", "Fizz", "Fizz","Buzz"};

        for (int i = 1 ; i < expected.length; i++){
            assertEquals(expected[i], fb.fuzzbuzz(i), "expected "+   expected[i]);
        }

        assertEquals("Buzz", fb.fuzzbuzz(52));
        assertEquals("FizzBuzz", fb.fuzzbuzz(352));
        assertEquals("FizzBuzz", fb.fuzzbuzz(532));
    }

}
