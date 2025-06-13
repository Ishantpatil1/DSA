public class bubblesort{
    static  void bubblesort(int a[]){
        int n =a.length;
         for (int i = 0; i <n-1; i++) {
             for (int j = 0; j <n-i-1; j++) {
                 if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]= a[j+1];
                    a[j+1]= temp;
                 }
             }
            }
            for (int z = 0; z <n; z++) {
                System.out.print(a[z]);
            }
    }
    public static void main(String[] args) {
        int a[]= {2,1,5,4,3};
        bubblesort(a);
    }
}