public class kadanesalgorithm {
   public static int kadanes(int numbers[]){ // Fixed method parameter
    int ms = Integer.MIN_VALUE;
    int cs = 0;
    for(int i = 0; i < numbers.length; i++){ // Fixed typo: 'lenght' to 'length'
        cs = cs + numbers[i]; // Removed extra int declaration
        if(cs < 0){
            cs = 0;
        }
        ms = Math.max(ms, cs); // Fixed: 'math.max' to 'Math.max'
    }
    System.out.println("the maximum sub array is: " + ms); // Added semicolon
    return ms; // Added return statement to match method signature
   }
   
    public static void main(String[] args) {
        int numbers[] = {1, 2, 4, 6, 7, 9, 13};
        kadanes(numbers);
    }
}
