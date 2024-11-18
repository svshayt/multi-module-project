package com.svshayt.knowledge.base.demo.java.time;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {

    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));

        System.out.println(zonedDateTime);
    }
}
