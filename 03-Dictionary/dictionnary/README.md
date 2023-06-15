# Dictionary Replacer
Simple Kata to improve TDD usages

**Category** : TDD | Easy

### Built With

![Spring](https://img.shields.io/static/v1?style=for-the-badge&message=Spring&color=6DB33F&logo=Spring&logoColor=FFFFFF&label=)
![JUnit5](https://img.shields.io/static/v1?style=for-the-badge&message=JUnit5&color=25A162&logo=JUnit5&logoColor=FFFFFF&label=)
![Gradle](https://img.shields.io/static/v1?style=for-the-badge&message=Gradle&color=02303A&logo=Gradle&logoColor=FFFFFF&label=)

## Description

[Kata Description](https://codingdojo.org/kata/LeapYears/?ref=blog.ippon.fr)

This kata is about making a simple string replacer. It is inspired by Corey Haines Lightning talk about practicing. (aac2009.confreaks.com/06-feb-2009-20-30-lightning-talk-under-your-fingers-corey-haines.html)

Create a method that takes a string and a dictionary, and replaces every key in the dictionary pre and suffixed with a dollar sign, with the corresponding value from the Dictionary.

### Tests

**input** : “”, dict empty, **output**:""

**input** : “$temp$”, dict [“temp”, “temporary”], **output**: “temporary”

**input** : “$temp$ here comes the name $name$”, dict [“temp”, “temporary”] [“name”, “John Doe”], **output** : “temporary here comes the name John Doe”

### Solution


```java
public class Formatter {
    
    public String replace(String input, Map<String, String> dictionary) {
        if (input == null || dictionary == null) {
            return input;
        }
        return dictionary.entrySet().stream().reduce(input, DictionaryReplacer::reduceString, nothing());
    }
    
    private static String reduceString(String output, Map.Entry<String, String> entry) {
        String characterSequence = "$" + entry.getKey() + "$";
        return output.replace(characterSequence, entry.getValue());
    }

    private static BinaryOperator<String> nothing() {
        return (k, v) -> v;
    }
    
}
``` 

