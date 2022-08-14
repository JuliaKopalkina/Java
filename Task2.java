
public class Task2 {
    public static void main(String[] args) {
        int[] numsOfArray = { 1, 2, 3, 2, 3 };
        int val = 3;
        System.out.println(removeElement(numsOfArray, val));
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0, len = nums.length;
        for (int i = 0; i < len; i++)
            if (nums[i] != val)
                nums[k++] = nums[i];
        return k;
    }
    
}
