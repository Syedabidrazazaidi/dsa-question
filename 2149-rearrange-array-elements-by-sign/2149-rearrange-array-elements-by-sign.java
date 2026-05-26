class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> l=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        for(int x:nums){
           if(x>0) l.add(x);
           else l2.add(x);
        }
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
           if(i%2==0) arr[i]=l.get(i/2);
           else arr[i]=l2.get(i/2);
        }
        return arr;
    }
}