class Solution {
    public int majorityElement(int[] nums) {
    
       HashMap<Integer,Integer>map=new HashMap<>();
       for(int n:nums){
        map.put(n,map.getOrDefault(n,0)+1);
       } 
       for(int i:map.keySet()){
        if(map.get(i)>nums.length/2){
            return i;
        }
    }
    return -1;
}
}