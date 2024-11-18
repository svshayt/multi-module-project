package com.svshayt.knowledge.base.demo.java.time;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {

    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));

        System.out.println(zonedDateTime); // 2024-11-18T11:25:30.460883-05:00[America/New_York]
    }
}
