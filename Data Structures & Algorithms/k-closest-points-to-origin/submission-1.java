class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> Double.compare(calculateDistance(b), calculateDistance(a)));

        for(int i = 0; i < points.length; i++){
            minHeap.offer(points[i]);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }

        int[][] result = new int[k][2];

        for(int i = 0; i < k; i++){
            result[i] = minHeap.poll();
        }

        return result;
    }

    public double calculateDistance(int[] cords){
        return Math.sqrt(cords[0]*cords[0] + cords[1]*cords[1]);
    }
}
