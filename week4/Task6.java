import java.util.Scanner;
class Task6 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            int j = 0;
            for (int i = 0; i < n; i++) {
                if (nums[i] != 0) {
                    nums[j++] = nums[i];
                }
            }
            while (j < n) {
                nums[j++] = 0;
            }
            for (int i = 0; i < n; i++) {
                System.out.print(nums[i] + " ");
            }
        }
    }
}