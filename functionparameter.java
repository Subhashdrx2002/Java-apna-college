
import java.util.Scanner;

public class functionparameter {
    public static void calculatesum(int a ,int b) { // parameter or formal parameter
        int sum = a + b;
        System.out.println("sum is "+ sum);
       
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculatesum(a ,b); // argument
    }

    
}
