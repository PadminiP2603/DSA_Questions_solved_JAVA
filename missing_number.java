package Basics;

public class missing_number {

    public int missingNumber(int[] nums) {
        int n = nums.length;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int i = 0; i < n; i++) {
            actualSum += nums[i];
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {

        int[] nums = {3, 0, 1};

        missing_number obj = new missing_number();

        int result = obj.missingNumber(nums);

        System.out.println("Missing number is: " + result);
    }
}
