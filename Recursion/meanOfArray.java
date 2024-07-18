public class meanOfArray {
    public static void main(String[] args) {
        
    }

    static int mean(int[] A,int N)    { 
        if (N == 1) 
            return (float)A[N-1]; 
        else
            return ((float)(findMean(A, N-1)*(N-1) + 
                                        A[N-1]) / N); 
    } 
}
