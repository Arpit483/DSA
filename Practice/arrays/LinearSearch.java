package arrays;

import java.util.Scanner;

public class LinearSearch {

    public static int Search(int arr[] , int key){
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] == key){
                System.out.println("Key is at :" + i+1 );
            }
          
        
        }
        return 0;
    }


    
    public static int foodString(String f[] , String name) {
        for (String f1 : f) {
            if (f1.equals(name)  ) {
                return 1;
            }
        }
    

        return 0;
        
    }

    public static int LargestNumber(int arr[] ){
       int max = arr[0];
       //OR use
        //int largest = Integer.MIN_VALUE;  -infinity
       for (int i = 0; i < arr.length; i++) {
        if (max < arr[i]) {
            max = arr[i];
            
            
        }   
       }
       
        return max;
    }

    public static int SmalletNumber(int arr[] ){
        //int smallest = Integer.MAX_VALUE;  -infinity
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
         if (max > arr[i]) {
             max = arr[i];
             
             
         }   
        }
        
         return max;
     }





    public static void main(String[] args) {
        int marks[] = {2,6,8,7,1,6,9,3,4};


        String food[] = {"Samosa", "Dosa" , "Idli" , "Vada" , "Sandwhich"} ;

        int num = LargestNumber(marks);
        System.out.println("Largest number is :" +num);

        int small = SmalletNumber(marks);
        System.out.println("Smallest number is : "+small);

        for (String food1 : food) {
            System.out.print(food1 + " ");
        }

        System.out.println();
        
        // Search(marks, 8);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of food you want to search :");

        String name = sc.nextLine();

        int n = (foodString(food, name));

        if(n == 1){
            System.out.println("Food is available");
    
        }
        else{
            System.out.println("Food is not available");
        }

     }
    
    
}