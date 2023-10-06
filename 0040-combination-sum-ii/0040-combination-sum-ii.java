class Solution {

    private void findCombinations(int ind,int[] arr, int target, List<List<Integer>> ans,List<Integer>ds){

        //base case 
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }

        //start from ind
        for(int i = ind; i < arr.length;i++){

            
            //check if two consecutive element are same then we will not take that combination
            if(i > ind && arr[i-1] == arr[i]){
                continue;
            }
            
            //if arr[i] is greater than target means if this element is grater than target then we can not the element present further 
            if(arr[i] > target){
                break;
            }


            //add that element in ds
            ds.add(arr[i]);

            //make a recursive call on the next element
            findCombinations(i+1,arr,target-arr[i],ans,ds);

            //after recursive call has completed then remove that element from ds
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
}