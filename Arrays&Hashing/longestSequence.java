import java.util.Arrays;

public class longestSequence {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,0,1};
        System.out.println(LongSeq(nums));
    }

    static int LongSeq(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int cnt = 1, longestCnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i != nums.length - 1){    
                if(nums[i+1] == nums[i] + 1){
                    cnt++;
                }else{
                    if(cnt > longestCnt){
                        longestCnt = cnt;
                    }
                    cnt = 1;
                }
            }
        }
        if(cnt > longestCnt){
            longestCnt = cnt;
        }
        return longestCnt;
    }
}