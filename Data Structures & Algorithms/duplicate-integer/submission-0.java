class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> uniqueSet = new HashSet<>();


        for(int i : nums) {
           if(uniqueSet.contains(i)) {
            return true;
           }else {
            uniqueSet.add(i) ;
           }
        }

        return false;
    }
}