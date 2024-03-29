package com.kodilla.stream.iterate;

import java.util.stream.*;

public class NumbersGenerator {
    public static void generateEven(int max) {
        Stream.iterate(1, n -> n+3)
                .limit(max)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }

}
