package hackerrank.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaLambdaExpressionsTest {

    @Test
    void is200odd() {
        assertEquals(false, JavaLambdaExpressions.isOdd().apply(200));
    }
    @Test
    void is1000001odd() {
        assertEquals(true, JavaLambdaExpressions.isOdd().apply(1000001));
    }

    @Test
    void is104759Prime() {
        assertEquals(true, JavaLambdaExpressions.isPrime().apply(104759));
    }

    @Test
    void is1456795999Prime() {
        assertEquals(false, JavaLambdaExpressions.isPrime().apply(1456795999));
    }


    @Test
    void isPalindrome() {
        assertEquals(true, JavaLambdaExpressions.isPalindrome().apply("abcdedcba"));
    }

    @Test
    void isPalindrome2() {
        assertEquals(false, JavaLambdaExpressions.isPalindrome().apply("abcdba"));
    }
}