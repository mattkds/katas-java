package fr.mattkds.dictionary;

import java.util.Map;
import java.util.function.BinaryOperator;

public class DictionaryReplacer {

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


