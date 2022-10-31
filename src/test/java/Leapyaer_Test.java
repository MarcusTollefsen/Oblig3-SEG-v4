import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;



public class Leapyaer_Test {

    @Test
    public void when_divided_by_4_not_100() {
        assertEquals(true, Loopyear.isLeapYear(1916));
    }

    @Test
    public void not_divides_by_4() {
        assertEquals(false, Loopyear.isLeapYear(1800));
    }


    @Test
    public void when_divided_by_400_() {
        assertEquals(true, Loopyear.isLeapYear(2000));
    }

    @Test
    public void not_divides_by_400() {
        assertEquals(false, Loopyear.isLeapYear(2100));
    }

}





