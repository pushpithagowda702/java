class InsertPosition {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[] a = {1, 5, 3, 6};
    int l = s.searchInsert(a, 5);
    System.out.println(l);
  }
}

class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target > nums[nums.length-1]){
        return nums.length;    
        }
        
        if(target < nums[0]) {
            return 0;
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]>=target) {
                return i;
            }
        }
        return -1;
    }
}