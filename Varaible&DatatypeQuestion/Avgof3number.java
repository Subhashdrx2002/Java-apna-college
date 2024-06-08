
import java.util.Scanner;

public class Avgof3number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Float Avg = (a + b + c)/3f;
        System.out.println("Avg is"+ Avg);
    }
    
}
