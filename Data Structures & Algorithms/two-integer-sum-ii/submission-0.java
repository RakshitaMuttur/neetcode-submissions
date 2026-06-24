class Solution {
    public int[] twoSum(int[] numbers, int target) 
    {
        int n=numbers.length;
        int[] index=new int[2];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)continue;
                else
                {
                    if(numbers[i]+numbers[j]==target)
                    {
                        index[1]=i+1;
                        index[0]=j+1;
                    }
                }
            }
        }
        return index;
    }
}
