package arrays;



public class Insert {
    public static void Update(int marks[] ,int non){
        non =15;
        for(int i = 0 ; i<marks.length ; i++){
            marks[i] = 1 + marks[i];
        }
    }
    public static void main(String[] args) {
        System.out.println("wfa");
        int marks[] = {62,64,15,86};
        int non = 5;
        Update(marks , non);
        for (int i = 0 ; i<marks.length ; i++){
            System.out.print(marks[i] + " " +non );
        }


    }
    
}
