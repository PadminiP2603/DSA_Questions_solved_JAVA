class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Initialize left = 0
        int left =0;
        //Initialize right = array.length - 1
        int right = nums.length -1 ;
        //WHILE left < right:
        while(left < right){
            //Calculate sum = array[left] + array[right]
            int sum = nums[left] + nums[right];
            //IF sum == target:
            if(sum == target){
                //RETURN left, right
                return new int[]{left + 1, right + 1};
            }
            //ELSE IF sum < target:
            else if (sum < target) {
                //left++
                left ++;
            }else{
                right--;
            }
            //RETURN no solution

        }
        return new int[0];
    }
}