package fr.mattkds.dictionary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

@ExtendWith(MockitoExtension.class)
class DictionaryReplacerTest {

    @InjectMocks
    private DictionaryReplacer dictionaryReplacer;

    @Test
    public void shouldReturnEmptyInput() {
        //Arrange
        String input = "";
        String expectedOutput = "";
        Map<String, String> dictionary = new HashMap<>();
        //Act
        String output = dictionaryReplacer.replace(input, dictionary);
        //Assert
        Assertions.assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldReturnStringOnParameter() {
        //Arrange
        String input = "$temp$";
        String expectedOutput = "temporary";
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("temp", "temporary");
        //Act
        String output = dictionaryReplacer.replace(input, dictionary);
        //Assert
        Assertions.assertEquals(expectedOutput, output);
    }

    @Test
    public void shouldReturnStringTwoParameter() {
        //Arrange
        String input = "$temp$ here comes the name $name$";
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("temp", "temporary");
        dictionary.put("name", "John Doe");
        String expectedOutput = "temporary here comes the name John Doe";
        //Act
        String output = dictionaryReplacer.replace(input, dictionary);
        //Assert
        Assertions.assertEquals(expectedOutput, output);
    }
}