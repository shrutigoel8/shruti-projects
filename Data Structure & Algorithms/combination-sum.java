public class Solution {
    
    public void combinationSum(int[] candidates, int target, int j, ArrayList<Integer> curr, ArrayList<List<Integer>> result){
        
        if(target==0){
            ArrayList<Integer> temp=new ArrayList<Integer>(curr);
            result.add(temp);
            return;
        }
        for(int i=j; i<candidates.length; i++){
            if(target<candidates[i]){
                return;
            }
            curr.add(candidates[i]);
            combinationSum(candidates, target-candidates[i], i, curr, result );
            curr.remove(curr.size()-1);
            
        }
    }
    
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<List<Integer>> result=new ArrayList<List<Integer>>();
        if(candidates.length==0 || candidates==null)
            return result;
        Arrays.sort(candidates);
        ArrayList<Integer> curr=new ArrayList<Integer>();
        combinationSum(candidates, target, 0, curr, result);
        return result;
    }
}