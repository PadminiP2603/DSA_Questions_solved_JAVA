class Solution {
    public int maxSubArray(int[] nums) {
//        1. Get the length of the array.
            int n = nums.length;
//        2. Initialize currSum = nums[0].
            int currSum = nums[0];
//        3. Initialize maxSum = nums[0].
            int maxSum = nums[0];
//        4. Traverse the array from index 1:
            for (int i = 1; i <n ; i++) {
                //currSum = maximum of (nums[i], currSum + nums[i])
                currSum = Math.max(nums[i],currSum + nums[i]);
                //maxSum = maximum of (maxSum, currSum)
                maxSum = Math.max(maxSum,currSum);
            }
        //5. Return maxSum.
        return maxSum;
    }
}