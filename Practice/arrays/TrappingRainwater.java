package arrays;

public class TrappingRainwater {

    public static void water(int bars[]) {
        int left[] = new int[bars.length];
        for (int i = 0 ; i < bars.length ; i++) {
            if(i == 0){
                left[i] = bars[i];
            }else{
                left[i] = Math.max(left[i-1] , bars[i]);

            }
        }
        int right[] = new int[bars.length];
        for (int j = bars.length - 1 ; j >= 0; j--) {
            if(j == bars.length - 1){
                right[j] = bars[j];
        }
        else{
            right[j] = Math.max(right[j+1] , bars[j]);
        }        
    }
    int sum = 0;
    for (int i = 0; i < bars.length ; i++) {
        int water = Math.min(left[i] , right[i]);
        int level = (water - bars[i]);
        sum += level;       
    }
    System.out.println(sum);
}

    public static void main(String[] args) {

        int height[] = {4,2,0,6,3,2,5};
        water(height);
        
    }
    
}
