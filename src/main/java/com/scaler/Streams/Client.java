package com.scaler.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 2, 1, 4, 6, 7, 9, -2, -3);

        numbers.stream()
                .filter((x) ->x % 2 == 0)
                .sorted()
                .map((x) -> x * x)
                .distinct()
                .forEach((x) -> System.out.println(x));

        List<Integer> result = numbers.stream()
                .filter((x) ->x % 2 == 0)
                .sorted()
                .map((x) -> x * x)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
