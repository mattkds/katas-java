# FizzBuzz
First Kata to improve TDD usages

**Category** : TDD | BabySteps

### Built With

![Spring](https://img.shields.io/static/v1?style=for-the-badge&message=Spring&color=6DB33F&logo=Spring&logoColor=FFFFFF&label=)
![JUnit5](https://img.shields.io/static/v1?style=for-the-badge&message=JUnit5&color=25A162&logo=JUnit5&logoColor=FFFFFF&label=)

## Description

[Kata Description](https://codingdojo.org/kata/FizzBuzz/?ref=blog.ippon.fr)

Imagine the scene. You are eleven years old, and in the five minutes before the end of the lesson, your Maths teacher decides he should make his class more “fun” by introducing a “game”. He explains that he is going to point at each pupil in turn and ask them to say the next number in sequence, starting from one. The “fun” part is that if the number is divisible by three, you instead say “Fizz” and if it is divisible by five you say “Buzz”. So now your maths teacher is pointing at all of your classmates in turn, and they happily shout “one!”, “two!”, “Fizz!”, “four!”, “Buzz!”… until he very deliberately points at you, fixing you with a steely gaze… time stands still, your mouth dries up, your palms become sweatier and sweatier until you finally manage to croak “Fizz!”. Doom is avoided, and the pointing finger moves on.

So of course in order to avoid embarassment infront of your whole class, you have to get the full list printed out so you know what to say. Your class has about 33 pupils and he might go round three times before the bell rings for breaktime. Next maths lesson is on Thursday. Get coding!

Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz “.

### Solution

Usage of modulo expression to detect if there is a rest of the division when we divide by Fizz or Buzz Value.

```java
public class FizzBuzzResolver {

    private static String FIZZ = "Fizz!";
    private static Integer FIZZ_VALUE = 3;
    private static String BUZZ = "Buzz!";
    private static Integer BUZZ_VALUE = 5;

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
``` 

