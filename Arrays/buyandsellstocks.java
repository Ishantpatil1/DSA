public class buyandsellstocks {
    static int maxprofit(int a[]){
        int minsofar=a[0];
        int maxprofit= 0;

        for (int i = 0; i < a.length; i++) {
            minsofar = Math.min(minsofar,a[i]);
            int profit= a[i]-minsofar;
            maxprofit= Math.max(maxprofit,profit);
        }

return  maxprofit;
    }
    public static void main(String[] args) {
        int a[]={7,1,5,3,6,4};
        System.out.println("maximum profit is:"+maxprofit(a));
    }
}
