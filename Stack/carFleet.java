import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class carFleet {
    public static void main(String[] args) {
        System.out.println(carfleet(12, new int[]{10,8,0,5,3}, new int[]{2,4,1,1,3}));
    }

    static int carfleet(int target, int[] position, int[] speed){
        TreeMap<Integer, Integer> map = new TreeMap<>(Comparator.reverseOrder());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < speed.length; i++) {   
            map.put(position[i], speed[i]);
        }

        for (Map.Entry<Integer, Integer> entryKey : map.entrySet()) {
            int pos = entryKey.getKey();
            int spd = entryKey.getValue();
            int time = (double  ) (target - pos) / spd;

            if(stack.empty() || time > stack.peek() ){ //greater because you can't overtake the car in front so if the speed becomes greater then still it will have to drive with the same equal speed as the car in front
                stack.push(time);
            }
        }

        return stack.size();
    }
}


// Better solution
// int res = 0;
// double[] timeArr = new double[target];
// for (int i = 0; i < position.length; i++)
//  {
//      timeArr[position[i]]= (double)(target - position[i]) / speed[i];
//  }
//  double prev = 0.0;
//  for (int i = target-1; i >=0 ; i--)
//  {
//      double cur = timeArr[i];
//      if (cur > prev)
//      {
//          prev = cur;
//          res++;
//      }
//  }
//  return res;   