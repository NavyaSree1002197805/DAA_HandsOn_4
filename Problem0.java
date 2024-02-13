public class Problem0 {
    public static void main(String[] args) {
        int result = fib(5);
        System.out.println(result);

        /*Output: 
         * 5
         */
    }

    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
