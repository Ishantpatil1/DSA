public class largestnumber {
    public static int largestnumber(int numbers[]){
        int largest= Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>largest){
                largest=numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]={2,5,3,7,9,11};
System.out.println("largest number in the given array is "+largestnumber(numbers));
    }
}
