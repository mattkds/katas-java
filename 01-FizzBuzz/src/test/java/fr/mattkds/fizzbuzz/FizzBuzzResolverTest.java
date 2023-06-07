package fr.mattkds.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class FizzBuzzResolverTest {

    @InjectMocks
    FizzBuzzResolver fizzBuzzResolver;

    @Test
    void launchFizzBuzzTest() {
        //Arrange
        Integer sizeOfNumberRange = 100;
        String fizz = "Fizz!";
        String buzz = "Buzz!";
        String fizzBuzz = "Fizz!Buzz!";

        //Act
        List<String> numbersPrinted = this.fizzBuzzResolver.resolve(sizeOfNumberRange);
        //Assert
        Assertions.assertEquals(fizz, numbersPrinted.get(2));
        Assertions.assertEquals(buzz, numbersPrinted.get(4));
        Assertions.assertEquals(fizzBuzz, numbersPrinted.get(14));
        Assertions.assertEquals("4", numbersPrinted.get(3));
    }
}
