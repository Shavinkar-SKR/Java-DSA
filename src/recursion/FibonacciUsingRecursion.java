package recursion;

public class FibonacciUsingRecursion {
    public static void main(String[] args) {
        int ans = fibonacci(4);
        System.out.println(ans);
    }

    static int fibonacci(int n){

        if(n<2){
            return n; //If n=0 or n=1, then it return 0 or 1 respectively
        }

        return fibonacci(n-1) + fibonacci(n-2); //fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
    }

}
