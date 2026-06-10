class Solution {
    public boolean hasDuplicate(int[] nums) 
    {
        int t;
        //sort the array and just compare the adjacent elemnets
        int n=nums.length;
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(nums[j]<nums[i])
                {
                    t=nums[j];
                    nums[j]=nums[i];
                    nums[i]=t;
                }
            }
        }
        for(int k=0; k<n-1; k++)
        {
            if(nums[k]==nums[k+1])
            {
                return true;
            }
        }
        return false;
    }
}