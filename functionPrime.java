public class functionPrime {
    public static boolean  isPrime(int n) {
      //  boolean isPrime = true;
        // for loop
        for(int i = 2; i<=n-1; i++){
            if(n % i==0){
              // isPrime = false;
              //  break;
              return false;
            }
        }
       // return isPrime;
       return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(12));
    }
    
}
