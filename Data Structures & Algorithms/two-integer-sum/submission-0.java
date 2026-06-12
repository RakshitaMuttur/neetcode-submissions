class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int n=nums.length;

        int[] ans=new int [2];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                    continue;
                else
                {
                    if(nums[i]+nums[j]==target)
                    {
                        ans[0]=(i<j)?i:j;
                        ans[1]=(i>j)?i:j;
                    }
                }
            }
        }
        return ans;
    }
}
