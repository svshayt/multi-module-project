package com.svshayt.knowledge.base.demo.java.time;

import java.time.Duration;
import java.time.Instant;

public class DurationDemo {

    public static void main(String[] args) {
        Duration duration = Duration.ofMinutes(5); // 5 минут
        Duration betweenInstants = Duration.between(Instant.now(), Instant.now().plusSeconds(10)); // разница между моментами времени
        System.out.println(duration);
        System.out.println(betweenInstants);
    }
}
