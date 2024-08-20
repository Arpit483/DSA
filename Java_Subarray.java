
import java.util.Scanner;

public class Java_Subarray{

    public static void arays(int num[]){
        int index = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                int a = 0;
                for (int k = i; k <j ; k++) {
                    
                    a += k;
                    if (a>0){
                        
                    }
                    else{
                        ++index;
                    }


                }
                    
                }

            
        }
        System.out.println(index);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int num[] = {a,b,c,d,e};
        arays(num);
        


        
    }
}