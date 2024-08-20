package arrays;

public class SumOfSubArrays{

    public static void BruteForce(int array[])
    {
        int currentSum = 0;
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            int start  = i  ;
            for(int j = i+1 ; j<array.length ; j++){
                int end = j ;
                for (int k = start; k < end ; k++) {
                    currentSum+=array[k];
                    
                }
                if(sum <  currentSum){
                    sum = currentSum ;
                }
               System.out.println(currentSum);
            }
        }
        System.out.println(sum);   
    }

    public static void PrefixSum ( int array[]) {
        int currentSum = 0;
        int sum = Integer.MIN_VALUE;
        int prefixSum[] = new int[array.length];
        prefixSum[0] = array[0];
        //calculte prefix sum
        for (int i = 1; i < prefixSum.length ; i++) {
            prefixSum[i] = prefixSum[i-1] + array[i];
        }
      

        for (int i = 0; i < array.length; i++) {
            int start  = i  ;
            for(int j = i+1 ; j<array.length ; j++){
                int end = j ;
                
                currentSum = start == 0 ? prefixSum[end] :  prefixSum[end] - prefixSum[start-1];
                if(sum <  currentSum){
                    sum = currentSum ;
                }
            }

        }
        System.out.println(sum);
    }

    public static void KadansAlgo(int arr[]) {
        int currentSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        int MIN_VALUE = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            currentSum += arr[i];
            if (currentSum < 0) {
                currentSum = 0;
            }
            MaxSum = Math.max(currentSum , MaxSum);    
        }
        for (int j = 0; j < arr.length ; j++) {
            int cs = 0;
            cs +=arr[j];
            if (cs<0) {
                MIN_VALUE = Math.max(MIN_VALUE , cs);
            }            
        }
        if (MaxSum == 0) {
            System.out.println(MIN_VALUE);    
        }else{
            System.out.println(MaxSum);
        }    
    }

    public static void main(String[] args) {
    int[] arr = {-2 , -3 , 4,-1,-2,1,5,-3};
    int [] num = {-1,-2,-5,-3};
    //BruteForce(arr);
    //PrefixSum(arr);
    KadansAlgo(num);
    }


}