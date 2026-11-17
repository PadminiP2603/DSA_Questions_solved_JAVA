class Solution {
    public int subarraySum(int[] nums, int k) {
    // 1. Create a HashMap.
    //Key   = Prefix sum
    //Value = Frequency of prefix sum
        HashMap<Integer,Integer> map = new HashMap();
    //Initialize map.put(0, 1)
        map.put(0,1);
    //currentSum = 0
        int currentSum = 0;
    //count = 0
        int count =0;
    //3. Traverse the array from left to right:
        for (int i = 0; i < nums.length; i++) {
            //Add current element to currentSum.
            currentSum += nums[i];
            //Calculate required prefix sum.
            int required  = currentSum - k;
            //c. Check whether required exists in HashMap.
            if(map.containsKey(required)){
                //count = count + map.get(required)
                count += map.get(required);
                //d. Update the frequency of currentSum.
            }
            map.put(currentSum,map.getOrDefault(currentSum,0) +1);
        }
        return  count;
    }
}