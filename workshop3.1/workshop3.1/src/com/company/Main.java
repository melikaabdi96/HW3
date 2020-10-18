package com.company;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //get the ecurrent time
        Calendar calendar = Calendar.getInstance();
        ClockDisplay clockDisplay = new ClockDisplay(calendar.getTime().getHours(), calendar.getTime().getMinutes(), calendar.getTime().getSeconds() );
        System.out.println(clockDisplay.getTime());
        clockDisplay.updateDisplay();
    }
}
