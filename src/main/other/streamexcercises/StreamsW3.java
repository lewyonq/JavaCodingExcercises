package other.streamexcercises;
//https://www.w3resource.com/java-exercises/stream/index.php

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsW3 {
    //1 Write a Java program to calculate the average of a list of integers using streams.
    public static double calculateAverage(List<Integer> integers) {
        return integers.stream()
                .mapToDouble(Double::valueOf)
                .average()
                .orElse(0.0);
    }

    //2 Write a Java program to convert a list of strings to uppercase or lowercase using streams.
    public static List<String> convertToUppercase(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    // 3 Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
    public static int calculateSumOfEvenNumbers(List<Integer> integers) {
        return integers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::valueOf)
                .sum();
    }

    // 4 Write a Java program to remove all duplicate elements from a list using streams.
    public static List<Integer> removeDuplicates(List<Integer> objects) {
        return objects.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    // 5 Write a Java program to count the number of strings in a list that start with a specific letter using streams.
    public static long countNumberOfStringsStartsWithX(List<String> strings) {
        return strings.stream()
                .filter(s -> s.startsWith("X"))
                .count();
    }

    // 6 Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
    public static List<String> sortingAlphabeticalAscending(List<String> strings) {
        return strings.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public static List<String> sortingAlphabeticalDescending(List<String> strings) {
        return strings.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    // 7. Write a Java program to find the maximum and minimum values in a list of integers using streams.
    public static int maxValue(List<Integer> integers) {
        return integers.stream()
                .max(Integer::compare)
                .orElse(0);
    }

    public static int minValue(List<Integer> integers) {
        return integers.stream()
                .mapToInt(Integer::valueOf)
                .min()
                .orElse(0);
    }

    // 8. Write a Java program to find the second smallest and largest elements in a list of integers using streams.
    public static int findSecondSmallestElement(List<Integer> integers) {
        return integers.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(0);
    }

    public static int findSecondLargestElement(List<Integer> integers) {
        return integers.stream()
                .distinct()
                .sorted((a, b) -> Integer.compare(b, a))
                .skip(1)
                .findFirst()
                .orElse(0);
    }
}
