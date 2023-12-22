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
    @Test
    @DisplayName("case 31/1/2021")
    void testDay31Month1Year2021(){
        int dayTest  = 31;
        int monthTest = 1;
        int yearTest = 2021;

        String result = NextDayCalculator.getNextDay(dayTest, monthTest ,yearTest);
        String expected = "1/2/2021";
        assertEquals(expected, result );
    }

    @Test
    @DisplayName("case 31/04/2021")
    void testDay30Month4Year2021(){
        int dayTest  = 30;
        int monthTest = 4;
        int yearTest = 2021;
        String expected = "1/5/2021";

        String result = NextDayCalculator.getNextDay(dayTest, monthTest ,yearTest);
        assertEquals(expected, result );
    }
    @Test
    void testDay28Month2Year2018(){
        int dayTest  = 28;
        int monthTest = 2;
        int yearTest = 2018;
        String expected = "1/3/2018";

        String result = NextDayCalculator.getNextDay(dayTest, monthTest ,yearTest);
        assertEquals(expected, result );
    }

    @Test
    void testDay29Month2Year2020(){
        int dayTest  = 29;
        int monthTest = 2;
        int yearTest = 2020;
        String expected = "1/3/2020";

        String result = NextDayCalculator.getNextDay(dayTest, monthTest ,yearTest);
        assertEquals(expected, result );
    }

    @Test
    void testDay28Month2Year2020(){
        int dayTest  = 28;
        int monthTest = 2;
        int yearTest = 2020;
        String expected = "29/2/2020";

        String result = NextDayCalculator.getNextDay(dayTest, monthTest ,yearTest);
        assertEquals(expected, result );
    }

    @Test
    void testDay31Month12Year2020(){
        int dayTest  = 31;
        int monthTest = 12;
        int yearTest = 2020;
        String expected = "1/1/2021";

        String result = NextDayCalculator.getNextDay(dayTest, monthTest ,yearTest);
        assertEquals(expected, result );
    }
    @Test
    void testDay28Month12Year2100(){
        int dayTest  = 28;
        int monthTest = 2;
        int yearTest = 2100;
        String expected = "1/3/2100";

        String result = NextDayCalculator.getNextDay(dayTest, monthTest ,yearTest);
        assertEquals(expected, result );
    }

}