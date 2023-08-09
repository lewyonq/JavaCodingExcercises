package hackerrank.algorithms.easy;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        if (arr.size() != arr.get(0).size()) {
            return -1;
        }

        int leftDiagonal = 0, rightDiagonal = 0;

        for (int i = 0; i < arr.size(); i++) {
            leftDiagonal += arr.get(i).get(i);
            rightDiagonal += arr.get(i).get(arr.get(0).size() - 1 - i);
        }

        return Math.abs(leftDiagonal - rightDiagonal);
    }
}
