package hackerrank.medium;

import java.util.function.Function;

/*
https://www.hackerrank.com/challenges/java-lambda-expressions/problem
 */
class JavaLambdaExpressions {

    public static Function<Integer, Boolean> isOdd(){
        return number -> number % 2 == 1;
    }

    public static Function<Integer, Boolean> isPrime() {
        return number -> {
            if (number < 2) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        };
    }

    public static Function<String, Boolean> isPalindrome() {
        return sentence -> sentence
                .equals(new StringBuilder(sentence).reverse().toString());
    }
}