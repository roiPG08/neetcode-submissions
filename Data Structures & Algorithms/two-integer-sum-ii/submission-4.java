class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // HashMap<Integer, Integer> seen = new HashMap<>();

        // for(int i = 0; i < numbers.length; i++){
        //     int diff = target - numbers[i];
        //     seen.put(numbers[i], i);
        //     if(seen.containsKey(numbers[i]) && seen.containsKey(diff) && seen.get(numbers[i]) !=
        //     seen.get(diff)){
        //         int[] res = new int[]{++i, seen.get(diff) + 1};
        //         Arrays.sort(res);
        //         return res;
        //     }
        // }
        if (numbers.length == 2) {
            return new int[] {1, 2};
        }

        int l = 0;
        int r = numbers.length - 1;

        while (l < r) {
            if (numbers[r] + numbers[l] == target) {
                return new int[] {++l, ++r};
            }
            while (numbers[r] + numbers[l] < target) {
                l++;
            }
            while (numbers[r] + numbers[l] > target) {
                r--;
            }
        }

        return new int[] {};
    }
}


        // while (l < r) {
        //     if (numbers[r] + numbers[l] == target) {
        //         return new int[] {++l, ++r};
        //     }
        //     while (numbers[l] >= target || (numbers[l] < 0 && target > 0)) {
        //         l++;
        //     }
        //     while (numbers[r] >= target) {
        //         r--;
        //     }
        //     // if (numbers[r] < target && Math.abs(target - numbers[r]) > numbers[l]) {
        //     //     l++;
        //     // }
        // }
