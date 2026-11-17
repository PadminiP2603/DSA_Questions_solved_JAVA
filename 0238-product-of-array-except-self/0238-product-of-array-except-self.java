class Solution {
   public int[] productExceptSelf(int[] nums){
            //1. Create a result array of the same length as nums.
            int n = nums.length;
            int[] result = new int[n];
            //2. Initialize prefix = 1
            int prefix = 1;
            // 3. Traverse from left to right:
            for (int i = 0; i < n; i++) {
            //a. Store prefix in result[i].
                 result[i] = prefix;
            //b. Multiply prefix by nums[i].
                prefix *= nums[i];
            }
            //4. Initialize suffix = 1.
            int suffix = 1;
            //5. Traverse from right to left:
            for (int i = n-1; i >= 0; i--) {
                //a. Multiply result[i] by suffix.
                result[i] *= suffix;
                //multiply suffix by nums[i].
                suffix *= nums[i];
            }
            //6. Return result.
        return  result;
    }

}