package hackerrank.medium;

/*
https://www.hackerrank.com/challenges/java-1d-array/problem
 */
public class Java1DArrayPart2 {
    public static void main(String[] args) {
        System.out.println(canWin(4, new int[]{0,1,1,0,0,1,1,0,1}));
    }

    public static boolean canWin(int leap, int[] game) {
        return isAvailableToSolve(leap, game, 0);
    }

    public static boolean isAvailableToSolve(int leap, int[]game, int index) {
        if (index < 0 || game[index] == 1) {
            return false;
        }

        if (index == game.length - 1 || index + leap >= game.length) {
            return true;
        }

        game[index] = 1;

        return isAvailableToSolve(leap, game, index - 1) ||
                isAvailableToSolve(leap, game, index + 1) ||
                isAvailableToSolve(leap, game, index + leap);
    }

}

// correct answer if it wouldn't be possible to go one index back
/*
    public static boolean canWin(int leap, int @NotNull [] game) {
        if (game.length == 1 || game.length <= leap) {
            return true;
        }

        if (game[1] == 0) {
            if (canWin(leap, subArray(1, game))) {
                return true;
            }
        }
        if (game[leap] == 0) {
            if (canWin(leap, subArray(leap, game))) {
                return true;
            }
        }

        return false;
    }

    public static int[] subArray(int indexFrom, int[] array) {
        int[] newArray = new int[array.length - indexFrom];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i + indexFrom];
        }

        return newArray;
    }
    */
