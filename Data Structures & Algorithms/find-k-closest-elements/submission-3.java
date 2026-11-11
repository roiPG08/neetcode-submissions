class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l = 0;
        int r = arr.length - 1;

        while (r - l >= k) {
            if (Math.abs(x - arr[l]) <= Math.abs(x - arr[r])) {
                r--;
            } else {
                l++;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            result.add(arr[i]);
        }
        return result;
    }

    // Time Complexity not ideal  O(N log k)
    //
    // PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> {
    //     int distanceA = Math.abs(a - x);
    //     int distanceB = Math.abs(b - x);

    //     if(distanceA == distanceB){
    //         return Integer.compare(b, a);
    //     }

    //     return Integer.compare(distanceB, distanceA);
    // });

    // for(int num : arr){
    //     maxHeap.offer(num);
    //     if(maxHeap.size() > k){
    //         maxHeap.poll();
    //     }
    // }
    // List<Integer> result = new ArrayList(maxHeap);
    // Collections.sort(result);
    // return result;
}