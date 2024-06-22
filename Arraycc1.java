
import java.util.Scanner;

public class Arraycc1 {
    public static void main(String[] args) {
       // int marks[] = new int[3];
        
       int marks [] =  new int[100];

       Scanner sc = new Scanner(System.in);
       // Array input
       marks[0] = sc.nextInt(); // math
       marks[1] = sc.nextInt(); // physics
       marks[2] = sc.nextInt(); // chemistry

       System.out.println("math :" + marks[0]);
       System.out.println("physics :" + marks[1]);
       System.out.println("chemistry :" + marks[2]);

      // marks[2]= marks[2]+2;
      // System.out.println("chemistry :"+ marks[2]);

      int percentage = (marks[0] + marks[1] + marks[3])/3;
      System.out.println("percentage :"+ percentage + "%");

       

    }
    
}
