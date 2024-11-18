package com.svshayt.knowledge.base.demo.java.time;

import java.time.LocalTime;

public class LocalTimeDemo {

    public static void main(String[] args) {
        LocalTime now = LocalTime.now(); // текущее время
        LocalTime specificTime = LocalTime.of(14, 30); // 14:30

        System.out.println(now);
        System.out.println(specificTime);
    }
}
