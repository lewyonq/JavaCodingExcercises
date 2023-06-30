package hackerrank.medium;

public class CanYouAccess {
    public static void main(String[] args) {
        int num = 33;
        Object o = new Inner().new Private();
        String result = ((Inner.Private)o).powerof2(num);
        System.out.println(num + " is " + result);
    }

    static class Inner{
        private class Private{
            private String powerof2(int num){
                return ((num&num-1)==0)?"power of 2":"not a power of 2";
            }
        }
    }
}
