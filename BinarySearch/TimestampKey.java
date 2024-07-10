import java.util.ArrayList;
import java.util.HashMap;

public class TimestampKey {
    public static void main(String[] args) {
        
    }

        class Pair{
            String value;
            int timestamp;

            Pair(String value, int timestamp){
                this.value = value;
                this.timestamp = timestamp;
            }
        }

    static HashMap<String, ArrayList<Pair>> map = new HashMap<>();

    static void set(String key, String value, int timestamp){
        if(map.containsKey(key)){
            map.get(key).add(new Pair(value, timestamp));
        }else{
            ArrayList<Pair> arr = new ArrayList<>();
            arr.add(new Pair(value, timestamp));
            map.put(key, arr); 
        }
    }

    static String get(String key, int timestamp){
        String ans = "";

        if(map.containsKey(key)){
            int left = 0, right = map.get(key).size() - 1;
            ArrayList<Pair> arr = map.get(key);
            
            while(left <= right){
                int mid = (left + right) / 2;
                int timeVal = arr.get(mid).timestamp;

                if(timeVal == timestamp){
                    return arr.get(mid).value;
                }else if(timeVal < timestamp){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }

        return ans;
    }
}
