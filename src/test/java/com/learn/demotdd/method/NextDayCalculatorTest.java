package com.learn.demotdd.method;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    @DisplayName("case 1/1/2021")
    void testDay1Month1Year2021(){
        int dayTest  = 1;
        int monthTest = 1;
        int yearTest = 2021;

        String result = NextDayCalculator.getNextDay(dayTest, monthTest ,yearTest);
        String expected = "2/1/2021";
        assertEquals(expected, result );
    }

}