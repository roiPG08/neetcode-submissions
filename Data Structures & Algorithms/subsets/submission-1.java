class Solution {
    private List<List<Integer>> result = new ArrayList<>();
    private int[] nums;

    public List<List<Integer>> subsets(int[] nums) {
        this.nums = nums;

        List<Integer> currentPath = new ArrayList<>();
        backtracking(0, currentPath);

        return result;
    }

    public void backtracking(int index, List<Integer> path) {
        // 1. Base Case: Kiedy indeks wyjdzie poza długość tablicy (nie ma więcej elementów do rozpatrzenia)
        if (index == nums.length) {
            // finalised all paths: zapisujemy kopię obecnego stanu ścieżki do wyniku
            result.add(new ArrayList<>(path));
            return;
        }

        // --- PICK ---
        
        // 2. Choice (Pick): Dodajemy obecny element do ścieżki
        path.add(nums[index]);
        
        // 3. Constraint (Ruch do przodu): Przechodzimy głębiej, aby zdecydować o KOLEJNYM elemencie (index + 1)
        backtracking(index + 1, path);
        
        // 4. Backtrack Step: Wycofujemy decyzję z Opcji A. Czyścimy ścieżkę z ostatniego elementu, 
        // aby w Opcji B mieć dokładnie taki sam stan początkowy (bez tego elementu).
        path.remove(path.size() - 1);


        // --- SKIP ---
        
        // 2. Choice (Skip): Świadomie omijamy nums[index]. Nic nie dodajemy do ścieżki.
        
        // 3. Constraint (Ruch do przodu): Skoro pominęliśmy obecny, przechodzimy do KOLEJNEGO (index + 1)
        backtracking(index + 1, path);
    }
}