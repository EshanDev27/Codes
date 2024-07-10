public class fib {
    public static void main(String[] args) {
        // fib(10);
        fib series = new fib();
        int n = 10;
        System.out.print(series.fib_rec(n) + " ");
    }

    static void fib(int n){
        int a = 0, b = 1, c;
        System.out.print(a + " " + b + " ");
        for (int i = 0; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }

    int fib_rec(int n){
        if(n <= 1){
            return n;
        }
        return fib_rec(n - 1) + fib_rec(n - 2);
    }
}
