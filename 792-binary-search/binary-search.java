class Solution {
    public int search(int[] nums, int target) {
        int start=0,end=nums.length-1;
        while(start<=end){
        int mid=end-start/2;
        if(nums[mid]==target){
            return mid;
        }else if(nums[mid]<target){
              start++;
        }else{
        end--;}
        }
        return -1;
    }
  }




