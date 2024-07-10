public class SortedBSearch {
    public static void main(String[] args) {
        int[] nums = new int[]{4,5,6,7,0,1,2};
        System.out.println(search(nums, 0));
    }

    static int search(int[] nums, int target){
        int left = 0, right = nums.length - 1, mid = 0;

        while (left <= right) {
            mid = (left + right) / 2;

            if(target == nums[mid]){
                return mid;
            }
            //Left portion
            if(nums[left] <= nums[mid]){
                if(target > nums[mid] || target < nums[left]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            //Right portion
            }else{
                if(target < nums[mid] || target > nums[right]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }
        }

        return -1;
    }
}
