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
               // System.out.println(currentSum);
            }
        }
        System.out.println(sum);
        
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        BruteForce(arr);
    }


}