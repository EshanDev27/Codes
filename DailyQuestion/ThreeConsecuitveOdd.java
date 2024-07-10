public class ThreeConsecuitveOdd {
    public static void main(String[] args) {
        int[] arr = new int[]{2,6,4,1};
        System.out.println(threeConsecutiveOdds(arr));
    }

    static boolean threeConsecutiveOdds(int[] arr) {
        int cnt = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%2 == 1){
                cnt++;
                if(cnt == 3){
                    return true;
                }
            }else{
                cnt = 0;
            }
        }

        return false;

    }
}
