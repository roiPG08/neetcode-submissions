class Solution {
    private int minSpeed = Integer.MAX_VALUE;

    public int minEatingSpeed(int[] piles, int h) {
        int mostBananasAtPile = 0;
        for (int i : piles) {
            mostBananasAtPile = Math.max(i, mostBananasAtPile);
        }
        minSpeed = mostBananasAtPile;
        dfs(1, mostBananasAtPile, piles, h);
        return minSpeed;
    }

    private void dfs(int l, int r, int[] piles, int h) {
        if (l > r) {
            return;
        }

        // [1,2,3,4,5,6,... mostBananasAtPiles]
        int k = l + (r - l) / 2;
        System.out.println(k);

        if (canEatAll(k, h, piles)) {
            minSpeed = Math.min(minSpeed, k);
            dfs(1, k - 1, piles, h);
        } else {
            dfs(k + 1, r, piles, h);
        }
    }

    private boolean canEatAll(int k, int h, int[] piles) {
        // compute
        long totalHours = 0;
        for (int pile : piles) {
            // Equivalent to Math.ceil((double) pile / k) without precision loss
            totalHours += (pile + (long) k - 1) / k;
        }
        return totalHours <= h;
    }
}
