public class BiggestContainer {
    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    static int maxArea(int[] height){
        int maxArea = -1, currArea = 0, left = 0, right = height.length - 1;
        while(left < right){
            if(height[left] < height[right]){
                currArea = (right - left) * height[left];
                left++;
            }else{
                currArea = (right - left) * height[right];
                right--;
            }

            maxArea = Math.max(currArea, maxArea);
        }

        return maxArea;
    }
}