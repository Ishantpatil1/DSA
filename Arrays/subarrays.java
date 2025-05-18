

public class subarrays {
    public static void subarraysprint(int numbers[]){
        int totalsum = 0;
        for (int i = 0; i <numbers.length; i++) {
            int start=i;
            for (int j = i; j <numbers.length; j++) {
                int end = j;
                for (int k = start; k <=end; k++){
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();

                totalsum++;
            }
            System.out.println();


        }
        System.out.println("total sum:"+totalsum);
    }
    public static void main(String[] args) {
        int numbers[]={1,2,4,6,7,9,11};
       subarraysprint(numbers);
    }
}
