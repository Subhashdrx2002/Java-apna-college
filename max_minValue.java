public class max_minValue{
    public static int maxminValue(int numbers[]){
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(maximum <numbers[i]){
                maximum = numbers[i];

            }
            if(minimum > numbers[i]){
                minimum = numbers[i];
            }
        }
        System.out.println("minimum value :"+ minimum);
        return maximum;
    }

    public static void main(String[] args) {
        int numbers[] = {1,2,6,3,5};
        System.out.println("maximum value :"+ maxminValue(numbers));
        
    }
}