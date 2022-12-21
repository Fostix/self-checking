package com.selfcheck.selfcheckingComponent.repositories;

import java.sql.Timestamp;
import java.util.Calendar;

public class test {
    public static void main(String[] args) {

        Timestamp timestamp = new Timestamp(Calendar.getInstance().getTimeInMillis());
        System.out.println(timestamp);
        System.out.println(timestamp.toString().substring(0, 16));
        System.out.println(timestamp.toString().substring(16));
    }
}
