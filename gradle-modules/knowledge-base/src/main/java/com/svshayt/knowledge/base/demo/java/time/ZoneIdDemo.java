package com.svshayt.knowledge.base.demo.java.time;

import java.time.ZoneId;

public class ZoneIdDemo {

    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.systemDefault();

        System.out.println(zoneId); // Europe/Moscow
    }
}
