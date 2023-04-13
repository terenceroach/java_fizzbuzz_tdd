package java_fizzbuzz_tdd;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void testNumberNotDivisibleReturnsNumberOne(){
        FizzBuzz fizzbuzz = new FizzBuzz(1);
        Assert.assertEquals("1", fizzbuzz.play());
    }

    @Test
    public void testNumberNotDivisibleReturnsNumberTwo(){
        FizzBuzz fizzbuzz = new FizzBuzz(2);
        Assert.assertEquals("2", fizzbuzz.play());
    }

    @Test
    public void testNumberDivisibleByThreeOnly(){
        FizzBuzz fizzBuzz = new FizzBuzz(3);
        Assert.assertEquals("Fizz", fizzBuzz.play());
    }

    @Test
    public void testNumberDivisibleByFiveOnly(){
        FizzBuzz fizzBuzz = new FizzBuzz(5);
        Assert.assertEquals("Buzz", fizzBuzz.play());
    }

    @Test
    public void testNumberDivisibleByFifteenOnly(){
        FizzBuzz fizzBuzz = new FizzBuzz(15);
        Assert.assertEquals("FizzBuzz", fizzBuzz.play());
    }
}
