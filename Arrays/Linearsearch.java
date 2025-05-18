public class Linearsearch {
    public static int findnumber(int numbers[],int key){
        for (int i = 0; i <numbers.length; i++) {
            if(numbers[i]==key){
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,5,3,8,6,9};
        int key = 8;
        int index= findnumber(numbers, key);
        if(index == -1){
            System.out.println("not found");
        }
        else{
            System.out.println("number found :"+index);
        }
    }
}
