package com.svshayt.knowledge.base.demo.java.time;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateDemo {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now(); // текущая дата
        LocalDate specificDate = LocalDate.of(2021, Month.JANUARY, 1); // 1 января 2021 года

        System.out.println(today);
        System.out.println(specificDate);

        //Сравнение дат
        LocalDate date1 = LocalDate.of(2021, Month.JANUARY, 1);
        LocalDate date2 = LocalDate.of(2022, Month.JANUARY, 1);

        boolean isBefore = date1.isBefore(date2); // true
        boolean isAfter = date1.isAfter(date2);   // false

        System.out.println(isBefore);
        System.out.println(isAfter);

        //Добавление и вычитание времени
        LocalDate today2 = LocalDate.now();
        LocalDate nextWeek = today2.plusWeeks(1); // добавляем неделю
        LocalDate lastMonth = today2.minusMonths(1); // вычитаем месяц

        System.out.println(today2);
        System.out.println(nextWeek);
        System.out.println(lastMonth);
    }
}
