public class equilibrium {
    public static void main(String[] args) {
        int[] arr = new int[]{2,6,2,5,2,6,2};
        System.out.println(equilibrium(arr));
    }

    static int equilibrium(int[] arr){
        int sumLeft = arr[0], sumRight = arr[arr.length - 1], left = 1, right = arr.length - 2;
        while (left <= right) {
            if(sumLeft == sumRight && left == right){
                return arr[left];
            }

            if (sumLeft < sumRight) {
                sumLeft += arr[left];
                left++;
            }else{
                sumRight += arr[right];
                right--;
            }
        }

        return 0;
    }
}