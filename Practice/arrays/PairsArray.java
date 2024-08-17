package arrays;

class Pair{
    public static void p(int arr[]){
        for (int i = 0 ; i <arr.length ; i++){
           
            for (int j = i+1; j <arr.length  ; j++) {

                System.out.print( "( "+  arr[i]+ "  " +arr[j] + " )");
                
            }
        }

    }
}


public class PairsArray {
    public static void main(String[] args) {
    Pair p = new Pair();
    int arr[] = {1,2,3,4,5};
    p.p(arr);
        
    }
    
}
