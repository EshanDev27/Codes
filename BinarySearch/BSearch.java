public class BSearch {
    public static void main(String[] args) {
        int[] ans = new int[]{-1,0,3,5,9,12};
        System.out.println(search(ans, 9));
    }

    static int search(int[] nums, int target){
        if(nums.length == 0){
            return -1;
        }
        int left, right;
        left = 0;
        right = nums.length - 1;

        while (left <= right) {
            int ans = (left + right) / 2;
            if(nums[ans] == target){
                return ans;
            }else if(nums[ans] < target){
                left = ans + 1;
            }else{
                right = ans - 1;
            }
        }

        return -1;
    }
}
