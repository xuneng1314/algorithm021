public class Test122 {
    public static void main(String[] args) {
        int[] a = new int[]{7,1,5,3,6,4};
        maxProfit2(a);
    }

    public static int maxProfit(int[] prices) {
        int max = 0;
        //贪心算法
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i-1]){
                max += prices[i];
            }
        }
        return max;
    }

    public static int maxProfit2(int[] prices) {
        int crash = 0;//当前最大获取的利润
        int hold = -prices[0];//手持股票,有股票，说明我拿钱买的。
        int precrash = crash;//前一天拥有的现金
        int prehold = hold;//前一天所拥有的股票
        //状态分为两种，持有股票，未持有股票
        //第二天的状态只和第一天相关
        //如果第二天不持有股票，只有两种情况，前一天未持有股票，今天也没买股票。 前一天持有股票，今天卖出股票，计算一下这两个值的最大值，就能获取当前天拥有最多的钱的数量
        //当前持有股票
        for (int i = 1; i < prices.length; i++) {
            crash = Math.max(precrash,prehold+prices[i]);//如果当前天持有钱，就算出昨天有多少钱，昨天有多少股票。并且卖出股票之后所持有的钱，最大值
            hold = Math.max(prehold,precrash-prices[i]);//如果当前持有股票，就算出昨天持有股票，和昨天没有股票今天买了股票之后所拥有的最大值。
            precrash = crash;
            prehold = hold;
        }
        return crash;
    }
}
