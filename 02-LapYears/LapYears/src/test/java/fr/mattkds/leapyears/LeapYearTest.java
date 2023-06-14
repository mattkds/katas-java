package fr.mattkds.leapyears;

import fr.mattkds.leapyears.resolver.LeapYearResolver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class LeapYearTest {

    @InjectMocks
    private LeapYearResolver leapYearResolver;

    @Test
    void shouldReturnYear2000IsALeapYear() {
        //Arrange
        Integer yearToIdentify = 2000;
        //Act
        Boolean isLeapYear = this.leapYearResolver.isLeapYear(yearToIdentify);
        //Assert
        Assertions.assertEquals(true, isLeapYear);
    }

    @Test
    void shouldReturnYear1700IsNotALeapYear() {
        //Arrange
        Integer yearToIdentify = 1700;
        //Act
        Boolean isLeapYear = this.leapYearResolver.isLeapYear(yearToIdentify);
        //Assert
        Assertions.assertEquals(false, isLeapYear);
    }

    @Test
    void shouldReturnYear1800IsNotALeapYear() {
        //Arrange
        Integer yearToIdentify = 1800;
        //Act
        Boolean isLeapYear = this.leapYearResolver.isLeapYear(yearToIdentify);
        //Assert
        Assertions.assertEquals(false, isLeapYear);
    }

    @Test
    void shouldReturnYear1900IsNotALeapYear() {
        //Arrange
        Integer yearToIdentify = 1900;
        //Act
        Boolean isLeapYear = this.leapYearResolver.isLeapYear(yearToIdentify);
        //Assert
        Assertions.assertEquals(false, isLeapYear);
    }

    @Test
    void shouldReturnYear2100IsNotALeapYear() {
        //Arrange
        Integer yearToIdentify = 2100;
        //Act
        Boolean isLeapYear = this.leapYearResolver.isLeapYear(yearToIdentify);
        //Assert
        Assertions.assertEquals(false, isLeapYear);
    }

    @Test
    void shouldReturnYear2008IsALeapYear() {
        //Arrange
        Integer yearToIdentify = 2008;
        //Act
        Boolean isLeapYear = this.leapYearResolver.isLeapYear(yearToIdentify);
        //Assert
        Assertions.assertEquals(true, isLeapYear);
    }

    @Test
    void shouldReturnYear2012IsALeapYear() {
        //Arrange
        Integer yearToIdentify = 2012;
        //Act
        Boolean isLeapYear = this.leapYearResolver.isLeapYear(yearToIdentify);
        //Assert
        Assertions.assertEquals(true, isLeapYear);
    }

    @Test
    void shouldReturnYear2016IsALeapYear() {
        //Arrange
        Integer yearToIdentify = 2016;
        //Act
        Boolean isLeapYear = this.leapYearResolver.isLeapYear(yearToIdentify);
        //Assert
        Assertions.assertEquals(true, isLeapYear);
    }

    @Test
    void shouldReturnYear2017IsNotALeapYear() {
        //Arrange
        Integer yearToIdentify = 2017;
        //Act
        Boolean isLeapYear = this.leapYearResolver.isLeapYear(yearToIdentify);
        //Assert
        Assertions.assertEquals(false, isLeapYear);
    }

    @Test
    void shouldReturnYear2018IsNotALeapYear() {
        //Arrange
        Integer yearToIdentify = 2018;
        //Act
        Boolean isLeapYear = this.leapYearResolver.isLeapYear(yearToIdentify);
        //Assert
        Assertions.assertEquals(false, isLeapYear);
    }

    @Test
    void shouldReturnYear2019IsNotALeapYear() {
        //Arrange
        Integer yearToIdentify = 2019;
        //Act
        Boolean isLeapYear = this.leapYearResolver.isLeapYear(yearToIdentify);
        //Assert
        Assertions.assertEquals(false, isLeapYear);
    }
}
