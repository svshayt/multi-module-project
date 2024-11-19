package com.svshayt.knowledge.base.demo.java.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formattedDate = LocalDateTime.now().format(formatter); // форматирование
        LocalDateTime parsedDate = LocalDateTime.parse("01-01-2021 14:30", formatter); // разбор строки

        System.out.println(formatter);
        System.out.println(formattedDate);
        System.out.println(parsedDate);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate2 = LocalDateTime.now().format(formatter2);
        LocalDateTime parsedDate2 = LocalDateTime.parse("2021-01-01 14:30:00", formatter2);

        System.out.println(formatter2);
        System.out.println(formattedDate2);
        System.out.println(parsedDate2);
    }
}
