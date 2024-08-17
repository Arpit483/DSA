package arrays;

import java.util.Scanner;

class Search{

    public void sort(int arr[] , int key){
    
    int start = 0; int end = arr.length-1;
    while(start<=end){
        
        int mid = (start + end )/2;
        if(arr[mid] == key){
            System.out.println("Element is present at index " + (mid+1));
        }
        if (arr[mid]< key ) {
            start = mid+1;
            
        } else {
            end = mid -1;
        }
    }
    
}
}


public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int arrays[] = {2,4,6,8,10,12};
        for (int i = 0; i < arrays.length; i++) {
           System.out.print(arrays[i]+" "); 
        }
        System.out.println();
        int key = sc.nextInt();
        Search se= new Search();
        se.sort(arrays, key);
        
    }
    
}
