package hackerrank.algorithms.easy;

import java.util.List;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        double positive = arr.stream().filter(a -> a > 0).count();
        double negative = arr.stream().filter(a -> a < 0).count();
        double zeros = arr.stream().filter(a -> a == 0).count();
        System.out.printf("%.6f\n", positive/arr.size());
        System.out.printf("%.6f\n", negative/arr.size());
        System.out.printf("%.6f", zeros/arr.size());
    }
}
