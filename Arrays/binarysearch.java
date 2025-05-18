public class binarysearch {
   public static int binarynumberssearch(int numbers[],int target){
        int start=0;
        int end=numbers.length-1;
      while(start<=end){
        int mid=(start+end)/2;

        if(numbers[mid]==target){
            return mid;
        }
        if(numbers[mid]<target){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
      }
      return -1;
    }
    public static void main(String[] args) {
        int numbers[]={1,4,6,8,9,11,13,17};
        int target=11;

        System.out.println("number found at:"+binarynumberssearch(numbers, target));
        }
    }

