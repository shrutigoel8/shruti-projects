public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        ArrayList<List<Integer>> result= new ArrayList<List<Integer>>();
        
        if(nums.length<3 || nums==null)
            return result;
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            if(i==0|| nums[i]>nums[i-1]){
                int j=i+1;
                int k=nums.length-1;
            while(j<k){
                if(nums[i]+nums[j]+nums[k]==0){
                    ArrayList<Integer> list=new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    result.add(list);
                    j++;
                    k--;
                    
                while(j<k && nums[j]==nums[j-1])
                    j++;
                while(j<k&& nums[k]==nums[k+1])    
                    k--;
                }
                else if(nums[i]+nums[j]+nums[k]<0)
                    j++;
                else
                    k--;
                
                
            }    
     
                
            }
      
        }return result;
  
    }
}