package tudelft.leapyear;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearTest {
    //Cuando esta en false : true, no sigue la logica de años bisiestos, ya que 2016
    //si es año bisiesto pero la logica de flase : true no
    @Test
    public void leapYearsThatAreNonCenturialYears() {
        LeapYear ly = new LeapYear();
        boolean result = ly.isLeapYear(2016);
        Assertions.assertTrue(result);
    }

    @Test
    public void leapCenturialYears() {
        LeapYear ly = new LeapYear();
        Assertions.assertTrue(ly.isLeapYear(2000));
    }

    @Test
    public void nonLeapCenturialYears() {
        LeapYear ly = new LeapYear();
        Assertions.assertFalse(ly.isLeapYear(1500));
    }
    //Cuando esta en false : true, no sigue la logica de años bisiestos, ya que 2016
    //si es año bisiesto pero la logica de flase : true no
    @Test
    public void nonLeapYears() {
        LeapYear ly = new LeapYear();
        Assertions.assertFalse(ly.isLeapYear(2017));
    }
}
