import java.util.Arrays;

public class KokoEats {
    public static void main(String[] args) {
        int[] ans = new int[]{30,11,23,4,20};
        System.out.println(minEatingSpeed(ans, 5));
    }

    static int minEatingSpeed(int[] piles, int h){
        int minSpeed = 1;
        Arrays.sort(piles);
        int maxSpeed = piles[piles.length - 1];

        while (minSpeed < maxSpeed) {
            int mid = (minSpeed + maxSpeed) / 2;
            if(canEatInTime(piles, h, mid)){
                maxSpeed = mid;
            }else{
                minSpeed = mid + 1;
            }
        }

        return minSpeed;
    }

    static boolean canEatInTime(int[] piles, int h, int speed){
        int hrs = 0;
        for (int i : piles) {
            hrs += (int)Math.ceil((double) i / speed );
        }

        return hrs <= h;
    }
}