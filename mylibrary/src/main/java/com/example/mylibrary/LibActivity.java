package com.example.mylibrary;

import java.util.Calendar;
import java.util.Date;

public class LibActivity {
    public static Date getTime() {
        Calendar calendar= Calendar.getInstance();
        return calendar.getTime();
    }
}