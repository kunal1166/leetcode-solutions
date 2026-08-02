class BestTimeToBuyAndSellStock {
    public int bruteForce(int[] prices){
        int maxProfit=0; 
        for (int i=0; i<prices.length; i++){
            for (int j=i+1; j<prices.length; j++){
                if ( prices[j]-prices[i] > maxProfit){
                    maxProfit = prices[j]-prices[i];
                }
            }
        }
        return maxProfit;
    }
    public int optimal(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i=0; i<prices.length; i++){
            if (prices[i] < minPrice){
                minPrice=prices[i];
            }else if (prices[i]-minPrice > maxProfit){
                maxProfit = prices[i]-minPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
        int[] prices = {7,1,5,3,6,4};
        int maxProfit = solution.bruteForce(prices);
        System.out.println("Max Profit: " + maxProfit);
        maxProfit = solution.optimal(prices);
        System.out.println("Max Profit (optimal approach): " + maxProfit);
    }
}