public class Arraycc2 {
    public static void update(int marks[] , int nonchangeble) {
        nonchangeble = 10;
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i]+1;
        }
        
    }
    public static void main(String[] args) {
        int marks[] = {97, 98, 99};
        int nonchangeble = 5;
        update(marks ,nonchangeble);
        System.out.println(nonchangeble);

        // print our marks
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i] +" ");
        }
       
    }
    
    }
