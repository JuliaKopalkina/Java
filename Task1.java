import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] numsOfArray = { 1, 2, 0, 3, 5 };
        duplicateZeros(numsOfArray);
    }

    public static void duplicateZeros(int[] arr) {
        int i = 0;
        int n = arr.length;
        while (i < n) {
            if (arr[i] == 0 && i + 1 < n) {
                shift(arr, i + 1, n - 1);
                i = i + 2;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void shift(int[] arr, int i, int j) {
        while (j > i) {
            arr[j] = arr[j - 1];
            j--;
        }
        arr[i] = 0;
    }

}