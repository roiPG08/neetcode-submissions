class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> {
            int distanceA = Math.abs(a - x);
            int distanceB = Math.abs(b - x);

            if(distanceA == distanceB){
                System.out.println("A = " + a);
                System.out.println("B = " + b);
                System.out.println("Integer.compare(b, a) " + Integer.compare(b, a));
                return Integer.compare(b, a);
            }

            return Integer.compare(distanceB, distanceA);
        });
        
        for(int num : arr){
            maxHeap.offer(num);
            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        List<Integer> result = new ArrayList(maxHeap);
        Collections.sort(result);
        return result;
    }

}