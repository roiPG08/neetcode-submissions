class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l = 0;
        int r = arr.length - 1;

        while (l < r) {
            int mid = (l + r) / 2;
            if (arr[mid] < x) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        l = l - 1;
        r = l + 1;
        while (r - l - 1 < k) {
            if (l < 0) {
                r++;
            } else if (r >= arr.length) {
                l--;
            } else if (Math.abs(arr[l] - x) <= Math.abs(arr[r] - x)) {
                l--;
            } else {
                r++;
            }
        }

                List<Integer> result = new ArrayList<>();
        for (int i = l+1; i < r; i++) {
            result.add(arr[i]);
        }
        return result;
    }

    // Time complexity better  O(n−k)
    //
    // int l = 0;
    // int r = arr.length - 1;

    // while (r - l >= k) {
    //     if (Math.abs(x - arr[l]) <= Math.abs(x - arr[r])) {
    //         r--;
    //     } else {
    //         l++;
    //     }
    // }

    // List<Integer> result = new ArrayList<>();
    // for (int i = l; i <= r; i++) {
    //     result.add(arr[i]);
    // }
    // return result;

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