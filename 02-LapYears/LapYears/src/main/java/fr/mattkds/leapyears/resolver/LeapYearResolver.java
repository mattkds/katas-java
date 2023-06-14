package fr.mattkds.leapyears.resolver;

public class LeapYearResolver {
    public Boolean isLeapYear(Integer yearToIdentify) {
        if (isDivisibleByFourHundred(yearToIdentify)) {
            return true;
        }
        if (isDivisibleByOneHundred(yearToIdentify)) {
            return false;
        }
        if (isDivisibleByFour(yearToIdentify)) {
            return true;
        }
        return false;
    }


    /**
     * First Criteria to validate Year is Divisible by 400
     * If true the year parameter is a LeapYear
     * @param yearToIdentify
     * @return boolean
     */
    private boolean isDivisibleByFourHundred(Integer yearToIdentify) {
        return yearToIdentify % 400 == 0;
    }
    /**
     * Third Criteria to validate Year is Divisible by 4 but not by 100
     * If true the year parameter is a LeapYear
     * @param yearToIdentify
     * @return boolean
     */
    private boolean isDivisibleByOneHundred(Integer yearToIdentify) {
        return yearToIdentify % 100 == 0;
    }
    /**
     * Third Criteria to validate Year is Divisible by 4
     * If true the year parameter is a LeapYear
     * @param yearToIdentify
     * @return boolean
     */
    private boolean isDivisibleByFour(Integer yearToIdentify) {
        return yearToIdentify % 4 == 0;
    }
}
