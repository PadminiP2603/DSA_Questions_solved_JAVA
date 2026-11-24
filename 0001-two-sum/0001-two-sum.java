class Solution {
    //with two pointers
    // public int[] twoSum(int[] nums, int target) {
    //     //Initialize left = 0
    //     int left =0;
    //     //Initialize right = array.length - 1
    //     int right = nums.length -1 ;
    //     //WHILE left < right:
    //     while(left < right){
    //         //Calculate sum = array[left] + array[right]
    //         int sum = nums[left] + nums[right];
    //         //IF sum == target:
    //         if(sum == target){
    //             //RETURN left, right
    //             return new int[]{left, right};
    //         }
    //         //ELSE IF sum < target:
    //         else if (sum < target) {
    //             //left++
    //             left ++;
    //         }else{
    //             right--;
    //         }
    //         //RETURN no solution

    //     }
    //     return new int[0];
    // }
    // with hash map
    public int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return  new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}