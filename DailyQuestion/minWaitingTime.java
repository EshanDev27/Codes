public class minWaitingTime {
    public static void main(String[] args) {
        int[][] customers = new int[][]{{1,2},{2,5},{4,3}};
        System.out.println(averageWaitingTime(customers));
    }

    static double averageWaitingTime(int[][] customers){
        int current = 0;
        int[] arr = new int[customers.length];
        for(int i = 0; i < customers.length; i++){
            for(int j = 0; j < customers[0].length; j++){
                if( j == 0 && current < customers[i][0]){
                    current = customers[i][0];
                }
                if(j != 0){
                    current += customers[i][j];
                }
            }
            arr[i] = current - customers[i][0];
        }
        current = 0;
        for(int k = 0; k < arr.length; k++){
            current += arr[k];
        }

        return (double) current / arr.length;
    }
}

// Better code
// class Solution {
//     public double averageWaitingTime(int[][] customers) {
//         int current = 0;  // current time when the chef is available
//         long totalWaitingTime = 0;  // use long to avoid overflow for large inputs

//         for (int[] customer : customers) {
//             int arrival = customer[0];
//             int cooking = customer[1];

//             // If the chef is idle, they start cooking as soon as the customer arrives.
//             if (current < arrival) {
//                 current = arrival;
//             }
//             current += cooking;  // Update the current time to when the chef finishes this order

//             totalWaitingTime += (current - arrival);  // Calculate waiting time for this customer
//         }

//         return (double) totalWaitingTime / customers.length;  // Calculate average waiting time
//     }
// }
