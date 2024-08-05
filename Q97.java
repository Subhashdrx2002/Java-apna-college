public class Q97 {
    public static void main(String[] args) {
        // pattern question
        for (int line = 0; line <= 4; line++) {
            for(int star = 1; star<=4-line+1; star++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    
}
