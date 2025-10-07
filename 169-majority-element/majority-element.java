class Solution {
    public int majorityElement(int[] nums) {
//     if(nums.length==0)
//     return 0;
//        HashMap<Integer,Integer>map=new HashMap<>();
//        for(int n:nums){
//         map.put(n,map.getOrDefault(n,0)+1);
//        } 
//        for(int i:map.keySet()){
//         if(map.get(i)>nums.length/2){
//             return i;
//         }
//     }
//     return -1;
// }
// }

    int count=0;
    int candidate=0;
    for(int n:nums){
        if(count==0){
            candidate=n;
        }
        count=count+((n==candidate)?1:-1);
    }
    return candidate;
    }
}