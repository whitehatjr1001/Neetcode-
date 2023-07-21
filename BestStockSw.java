public class BestStockSw {
        public static int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int result=0;
        while(r<prices.length){
            if(prices[l]<prices[r]){
                result = Math.max(result,prices[r]-prices[l]);
                r++;
            }
            else{
                l=r;
                r++;
            }
        }
        return result;

    }
    public static void main(String[] args) {
        int [] prices = {5,1,4,5,7,8,9};
        System.out.println(maxProfit(prices));
        
    }
}
