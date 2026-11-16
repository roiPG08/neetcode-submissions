class Solution {
    // Złożoność czasowa: O(M + log N) lub O(M * log N) w zależności od zapisu (M - wiersze, N - kolumny)
    // Złożoność pamięciowa: O(log N) ze względu na stos wywołań rekurencyjnych w binary_search
    public boolean searchMatrix(int[][] matrix, int target) {
        // Iterujemy po kolejnych wierszach macierzy (każdy wiersz jest posortowany rosnąco)
        for (int i = 0; i < matrix.length; i++) {
            int lastIndexOfList = matrix[i].length - 1;

            // Sprawdzamy, czy target mieści się w przedziale [pierwszy_element, ostatni_element] tego wiersza.
            // Ponieważ wiersze są ściśle rosnące, target może znajdować się TYLKO w tym jednym konkretnym wierszu.
            if (matrix[i][0] <= target && matrix[i][lastIndexOfList] >= target) {
                // Przeszukujemy wybrany wiersz wyszukiwaniem binarnym i od razu zwracamy wynik
                return binary_search(0, lastIndexOfList, matrix[i], target);
            }
        }
        // Żaden wiersz nie zawiera przedziału obejmującego target
        return false;
    }

    // Rekurencyjne wyszukiwanie binarne w jednowymiarowej posortowanej tablicy
    public boolean binary_search(int l, int r, int[] nums, int target) {
        // Warunek bazowy (base case): wskaźniki się minęły, elementu nie ma w tablicy
        if (l > r)
            return false;

        // Obliczamy środkowy indeks w bezpieczny sposób (unikamy przepełnienia int przy dużych l i r)
        int mid = l + (r - l) / 2;

        // Znaleźliśmy szukany element
        if (nums[mid] == target)
            return true;

        // Jeśli środkowy element jest mniejszy od targetu -> odrzucamy lewą połowę i szukamy w prawej (mid + 1 .. r)
        // W przeciwnym razie -> odrzucamy prawą połowę i szukamy w lewej (l .. mid - 1)
        return (nums[mid] < target) ? binary_search(mid + 1, r, nums, target)
                                    : binary_search(l, mid - 1, nums, target);
    }
}