public class FindMin {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2};
        System.out.println(findMin(nums));
    } 

    static int findMin(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
    
        int left = 0, right = nums.length - 1;
    
        // If the array is not rotated, the first element is the minimum.
        if (nums[right] > nums[0]) {
            return nums[0];
        }
    
        while (left <= right) {
            int mid = (left + right) / 2;
    
            // Check if the mid element is the pivot (the maximum element).
            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }
    
            // Check if the mid-1 element is the pivot.
            if (nums[mid - 1] > nums[mid]) {
                return nums[mid];
            }
    
            // Adjust the search range based on the middle element.
            if (nums[mid] > nums[0]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    
        return -1;    
    }
}