public class Recursion {
    public static int factorial(int n) {
        if (n == 1) return 1;          // base case
        return n * factorial(n - 1);   // recursive case
    }
    public static void countdown(int n){
        if (n == 0){ // base case
            System.out.println("Go!");
            return;
        }
        System.out.println(n);
        countdown(n - 1); //recursive case

    }
    public static void main(String[] args) {
        countdown(5);
        System.out.println(factorial(5));  // 120
    }
}
