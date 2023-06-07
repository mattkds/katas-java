package fr.mattkds.fizzbuzz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FizzBuzzResolver {

    private static Logger LOGGER = LoggerFactory.getLogger(FizzBuzzResolver.class);
    private static String FIZZ = "Fizz!";
    private static Integer FIZZ_VALUE = 3;
    private static String BUZZ = "Buzz!";
    private static Integer BUZZ_VALUE = 5;

    public List<String> resolve(Integer sizeOfNumberRange) {
        LOGGER.info("Launch Resolve");
        return IntStream.rangeClosed(1, sizeOfNumberRange)
                .boxed()
                .toList()
                .stream()
                .map(this::getResponseOf)
                .toList();
    }

    public boolean isFizz(Integer value) {
        return value % FIZZ_VALUE == 0;
    }
    public boolean isBuzz(Integer value) {
        return value % BUZZ_VALUE == 0;
    }

    public String getResponseOf(Integer value) {
        if (isFizz(value) && isBuzz(value)) {
            return FIZZ + BUZZ;
        } else if (isFizz(value)) {
            return FIZZ;
        } else if (isBuzz(value)) {
            return BUZZ;
        } else {
            return String.valueOf(value);
        }
    }
}
