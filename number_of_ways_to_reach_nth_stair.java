class Solution
{
    public int nthPoint(int n)
    {
        int dp[] = new int[n+1];
        
        solve(dp,0,n);
        
        return dp[0]%1000000007;
    }
    
    int solve(int dp[],int i,int n)
    {
        if(i==n)
        {
            return 1;
        }
        else if(i>n)
        {
            return 0;
        }
        if(dp[i]>0)
        {
            return  dp[i]%1000000007;
        }
        return dp[i] = solve(dp,i+1,n)%1000000007 + solve(dp,i+2,n)%1000000007;
    }
    
    
}
