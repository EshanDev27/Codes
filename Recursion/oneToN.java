public class oneToN {
    public static void main(String[] args) {
        nToOne(5);
    }

    static void oneToN_withoutLoop(int n){
        if(n > 0){
            oneToN_withoutLoop(n - 1);
            System.out.println(n + " ");
        }

        return;
    }

    static void nToOne(int n){
        if(n == 0){
            return;
        }

        System.out.print(n + " ");
        nToOne(n - 1);

        return;
    }
}