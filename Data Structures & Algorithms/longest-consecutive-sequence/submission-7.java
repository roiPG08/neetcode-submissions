class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        HashSet<Integer> seen = new HashSet<>();

        for(int num : nums){
            seen.add(num); //Does not add duplicates
        }
        
        int longestSequence = 1;

        for(int num : seen){
            System.out.println(num);
            if(!seen.contains(num - 1)){
                int length = 1;
                while(seen.contains(num + length)){
                    length++;
                }
                longestSequence = Math.max(length, longestSequence);
            }
        }

        return longestSequence;
    }
}




    // public int longestConsecutive(int[] nums) {
    //     if (nums.length == 0) return 0;

    //     Arrays.sort(nums);

    //     int longestSequence = 1;
    //     int currentSequence = 1;

    //     for (int i = 1; i < nums.length; i++) {
    //         // If it's a duplicate, just skip to the next number
    //         if (nums[i] == nums[i - 1]) {
    //             continue;
    //         }
            
    //         // If it's consecutive, increase the sequence
    //         if (nums[i] == nums[i - 1] + 1) {
    //             currentSequence++;
    //         } 
    //         // If the sequence breaks, save the max and reset
    //         else {
    //             longestSequence = Math.max(longestSequence, currentSequence);
    //             currentSequence = 1;
    //         }
    //     }

    //     return Math.max(longestSequence, currentSequence);
    // }