package other.streamexcercises;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StreamsW3Test {
    @Test
    void averageEqualsTo8() {
        assertEquals(8.0, StreamsW3.calculateAverage(List.of(10,20,0,2)));
    }

    @Test
    void listOfUpperCase() {
        List<String> list = List.of("Aqwe", "bqwe", "cqwE");
        assertIterableEquals(List.of("AQWE", "BQWE", "CQWE"), StreamsW3.convertToUppercase(list));
    }

    @Test
    void sumOfEvenEquals60() {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,20,21,23,16,17,4,99);
        assertEquals(60, StreamsW3.calculateSumOfEvenNumbers(list));
    }

    @Test
    void removeDuplicates() {
        List<Integer> list = List.of(1,2,3,1,2,3,4,4,5,6,7,8,5);
        assertIterableEquals(List.of(1,2,3,4,5,6,7,8), StreamsW3.removeDuplicates(list));
    }

    @Test
    void numberOfStringsStartsWithXEquals4() {
        List<String> strings = List.of("a", "Xv", "bad", "asd", "Xqq", "XF", "qwe", "Xss");
        assertEquals(4, StreamsW3.countNumberOfStringsStartsWithX(strings));
    }

    @Test
    void sortingListAscending() {
        List<String> strings = List.of("dws", "das", "asd", "bc", "cc");
        assertIterableEquals(List.of("asd", "bc", "cc", "das", "dws"), StreamsW3.sortingAlphabeticalAscending(strings));
    }

    @Test
    void sortingListDescending() {
        List<String> strings = List.of("asd", "bc", "cc", "das", "dws");
        assertIterableEquals(List.of("dws", "das", "cc", "bc", "asd"), StreamsW3.sortingAlphabeticalDescending(strings));
    }
}