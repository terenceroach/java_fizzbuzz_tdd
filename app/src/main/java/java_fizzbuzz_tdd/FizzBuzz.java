package java_fizzbuzz_tdd;

public class FizzBuzz {

    Integer number;

    public FizzBuzz(Integer number) {
        this.number = number;
    }

    public String play() {
        if (this.number % 15 == 0) {
            return "FizzBuzz";
        } else if (this.number % 5 == 0) {
            return "Buzz";
        } else if (this.number % 3 == 0) {
            return "Fizz";
        } else {
            return Integer.toString(this.number);
        }
    }
}
