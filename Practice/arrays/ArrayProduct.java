package arrays;
public class ArrayProduct {

    public static int[] multiplyExceptSelf(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];

        //Calculate left products
        int leftProduct = 1;
        for (int i = 0; i < length; i++) {
            result[i] = leftProduct;
            leftProduct *= nums[i];
        }

        // Calculate right products and multiply with left products
        int rightProduct = 1;
        for (int i = length - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = multiplyExceptSelf(nums);
        for (int num : result) {
            System.out.print(num + " "); 
        }
    }
}
    

