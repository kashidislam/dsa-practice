/**
 *              Find the average of each subarrays of K-contiguous elements
 *                      arr = [1,3,2,6,-1,4,1,8,2] and K = 5
 *                      OutPut = [2.2,2.8,2.4,3.6,2.8]
 */

public class AverageOfSubarrayOfSizeK{

    public static void main(String[] args){

        int [] arr = {1,3,2,6,-1,4,1,8,2};  // input array
        int K = 5;      // K ---> size of subarray
        double[] result = getAverageOfKElements(arr, K);

        for(double val : result){
            System.out.println(val);
        }

    }

                            // Sliding Window Technique 
    public static double[] getAverageOfKElements(int[] a, int K){
        int size = a.length;    // size of input array 'a'
        double[] result = new double[size-K+1]; // size of 'result' array is equals to (size of input array - K + 1)

        int windowStart = 0;
        double windowSum = 0.0;

        for(int windowEnd = 0; windowEnd < size; windowEnd++){
            windowSum += a[windowEnd];
            // if window size is equals to K take the average into result array 
            // and slide the window ..
             if(windowEnd-windowStart+1 >= K){
                result[windowStart] = windowSum/K;
                windowSum -= a[windowStart];
                windowStart++; 
             }
        }
        return result;
    }
                //    Time Complexity is O(n) and Space Complexity is O(1)

}