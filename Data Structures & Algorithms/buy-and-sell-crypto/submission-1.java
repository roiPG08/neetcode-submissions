class Solution {
    public int maxProfit(int[] prices) {
        int atl = 0;
        int ath = 1;
        int maxProfit = 0;
        while (ath < prices.length) {
            if (prices[atl] > prices[ath]) {
                atl = ath;
            } else {
                System.out.println("ATH = " + prices[ath] + ". ATL = " + prices[atl]);
                int diff = Math.abs(prices[atl] - prices[ath]);
                maxProfit = Math.max(maxProfit, diff);
            }
            ath++;
        }
        return maxProfit;
    }
}

// if (i + 1 != prices.length) { // last run
//     maxProfit = Math.abs(prices[atl] - prices[ath]) > maxProfit
//         ? Math.abs(prices[atl] - prices[ath])
//         : +0;
// }

// int atl = 0; // given per day
// int atlVal = prices[0];

// for (int i = 0; i < prices.length; i++) {
//     if (atlVal > prices[i]) {
//         atl = i;
//         atlVal = prices[i];
//     }
// }

// int athVal = prices[atl];
// System.out.println("ATL: " + atlVal);
// for (int i = atl; i < prices.length; i++) {
//     System.out.println("ATH: " + athVal);
//     if (prices[i] > athVal) {
//         athVal = prices[i];
//     }
// }

// return Math.abs(atlVal - athVal);
