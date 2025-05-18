public class Twosum {
    public static void twosums(int numbers[],int target){
        for (int i = 0; i <numbers.length; i++) {
            for (int j = i+1; j <numbers.length; j++) {
                if(numbers[i]+numbers[j]==target){
                    System.out.println("output is:"+numbers[i]+","+numbers[j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6,7};
        int target=4;
        twosums(numbers, target);
    }
}
