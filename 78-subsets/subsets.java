class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> output=new ArrayList<>();
        solve(nums,0,output,ans);
        return ans;
    }
    public void solve(int []nums,int i,ArrayList<Integer> output,List<List<Integer>> ans){
        if(i>=nums.length){
            ans.add(new ArrayList<>(output));
            return;
        }

        output.add(nums[i]);
        solve(nums,i+1,output,ans);
        output.remove(output.size()-1);
        solve(nums,i+1,output,ans);
    }
    }



        
