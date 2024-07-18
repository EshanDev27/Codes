public class Sum {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(sum(arr, 5));
    }

    static int sum(int[] arr, int n){
        if(n == 1){
            return arr[n - 1];
        }

        return sum(arr, n - 1) + arr[n - 1];
    }
}
