class Solution {
    public int[] twoSum(int[] nums, int target) {
        // {0 : 4, 1 : 3, 2 : 2, 3 : 1}
        HashMap<Integer, Integer> t = new HashMap();

        for(int i = 0; i< nums.length ; i++) {
            for(int j = 0; j < nums.length; j++) {

                if(i != j && nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }else {
                    continue;
                }
            }
        }
return new int[]{0, 0};
}
}

