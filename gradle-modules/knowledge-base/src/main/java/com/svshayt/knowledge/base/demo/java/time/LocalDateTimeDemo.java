package com.svshayt.knowledge.base.demo.java.time;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeDemo {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now(); // текущая дата и время
        LocalDateTime specificDateTime = LocalDateTime.of(2021, Month.JANUARY, 1, 14, 30); // 1 января 2021 года, 14:30

        System.out.println(now);
        System.out.println(specificDateTime);
    }
}
