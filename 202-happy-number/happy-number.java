class Solution {
    public boolean isHappy(int n) {
     HashSet<Integer> set=new HashSet<>();
     while(n!=1&&!set.contains(n)){
        set.add(n);
        n=getNext(n);
     }  
     return n==1;
    }
    private static int getNext(int n){
        int sum=0;
        while(n>0){
            int ld=n%10;
            sum+=ld*ld;
            n/=10;
        }
        return sum;
    }
}