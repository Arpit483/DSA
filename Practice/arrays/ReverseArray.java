package arrays;


class reverse{
public static void rev(int arr[]){
int first = 0 ; int last = arr.length-1;

while (first < last) {
    int temp;
    temp = arr[first];
    arr[first] = arr[last];
    arr[last]= temp;
    first++;
    last--;    
    
}

for (int i = 0; i < arr.length; i++) {
System.out.print(arr[i] + " ");    
}




}

}


public class ReverseArray {
public static void main(String[] args) {
    reverse re = new reverse();
    int arr[] = {1, 2, 3, 4, 5};
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");    
    }
    System.out.println();
    
    re.rev(arr);
}

    
}
