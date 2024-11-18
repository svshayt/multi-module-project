package com.svshayt.knowledge.base.demo.java.time;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateDemo {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now(); // текущая дата
        LocalDate specificDate = LocalDate.of(2021, Month.JANUARY, 1); // 1 января 2021 года

        System.out.println(today);
        System.out.println(specificDate);
    }
}
