package com.learn.demotdd.method;

public class NextDayCalculator {

    public static final String CONCATENATION = "/";

    public static String getNextDay(int day, int month, int year){
        int endOfMonth = 31;
        if(day == endOfMonth){
            int startOfMonth = 1;
            day = startOfMonth;
            month ++;
        }else {
            day++;
        }
        return day + CONCATENATION + month + CONCATENATION + year;
    }
}
