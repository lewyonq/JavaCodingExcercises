package hackerrank.medium;

public class PrimeChecker {
    public static void main(String[] args) {
        Prime p = new Prime();
        p.checkPrime(1,2,3,4,5);
        p.checkPrime(6,7,8,9,10);
        p.checkPrime(1,2,3,4,5,6,7,8,9,10);
    }


}

class Prime {
    public void checkPrime(int... inputValues) {
        for (int num : inputValues) {
            if (num == 1) {
                continue;
            } else if (num == 2 || num == 3) {
                System.out.print(num + " ");
                continue;
            }

            boolean isPrime = true;

            for (int i = 2; i < num/2 + 1; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        System.out.println("");
    }
}