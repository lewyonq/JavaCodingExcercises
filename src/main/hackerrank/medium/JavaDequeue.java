package hackerrank.medium;

import java.util.*;

/*
https://www.hackerrank.com/challenges/java-dequeue/problem
 */
public class JavaDequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        Deque<Integer> data = new ArrayDeque<>();

        for (int i = 0 ; i < m; i++) {
            data.add(in.nextInt());
        }

        Set<Integer> set = new HashSet<>();
        set.addAll(data);
        int max = set.size();

        for (int i = m; i < n; i++) {
            data.removeFirst();
            data.addLast(in.nextInt());
            set.clear();
            set.addAll(data);
            if (set.size() > max) {
                max = set.size();
            }
        }

        System.out.println(max);
    }
}

//first try, working too slow to pass

//    public static int findMaxNumberOfUniqueIntegers(int[] nums, int m) {
//        int max;
//        Deque<Integer> deque = new ArrayDeque<>();
//
//        for (int i = 0; i < m; i++) {
//            deque.add(nums[i]);
//        }
//
//        Set<Integer> set = new HashSet<>();
//        set.addAll(deque);
//
//        max = set.size();
//
//        for (int i = m; i < nums.length; i++) {
//            set.removeAll(deque);
//            deque.removeFirst();
//            deque.addLast(nums[i]);
//            set.addAll(deque);
//
//            int currentNumberOfUniqueValues = set.size();
//
//            if (currentNumberOfUniqueValues > max) {
//                max = currentNumberOfUniqueValues;
//            }
//        }
//
//        return max;
//    }


// second try - faster, but to pass it is necessary to take data from input and don't save to array
//
//    public static int findMaxNumberOfUniqueIntegers(int[] nums, int m) {
//        Set<Integer> actualNumbers = makeSetFromArray(nums,0,m);
//        int max = actualNumbers.size();
//
//        for (int i = m + 1; i <= nums.length; i++) {
//            actualNumbers = makeSetFromArray(nums, i - m, i);
//            int actualNumbersSize = actualNumbers.size();
//            if (actualNumbersSize > max) {
//                max = actualNumbersSize;
//            }
//        }
//
//        return max;
//    }
//
//    private static Set<Integer> makeSetFromArray(int[] arr, int from, int to) {
//        Set<Integer> result = new HashSet<>();
//        for(int i = from; i < to; i++) {
//            result.add(arr[i]);
//        }
//        return result;
//    }