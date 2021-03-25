import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {
    @Test
    void shouldReturnFizzIfNumDivisibleBy3() {
        Assertions.assertEquals("Fizz", FizzBuzz.evaluate(3));
    }

    @Test
    void shouldReturnBuzzIfNumDivisibleBy5() {
        Assertions.assertEquals("Buzz", FizzBuzz.evaluate(5));
    }

    @Test
    void shouldReturnFizzBuzzIfNumDivisibleBy5and3() {
        Assertions.assertEquals("FizzBuzz", FizzBuzz.evaluate(15));
    }

    void shouldReturnNumIfNotDivisibleBy5or3() {
        Assertions.assertEquals("4", FizzBuzz.evaluate(4));
    }
}
