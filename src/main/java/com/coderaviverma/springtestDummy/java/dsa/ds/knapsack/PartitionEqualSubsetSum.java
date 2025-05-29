package com.coderaviverma.springtestDummy.java.dsa.ds.knapsack;

class PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {
        int totalsum=0;
        for(int i=0;i<nums.length;i++){
            totalsum=totalsum+nums[i];
        }

        if(totalsum % 2 == 0){
            int divide=totalsum/2;
            return subSet(nums,divide);
        }else{
            return false;
        }
    }

    boolean subSet(int[] arr, int sum){
        int n=arr.length;

        boolean[][] t=new boolean[sum+1][n+1];

        for(int i=0;i<=n;i++){
            t[0][i]=true;
        }

        for(int i=0;i<=sum;i++){
            t[i][0]=false;
        }

        for(int i=1;i<=sum;i++){
            for(int j=1;j<=n;j++){
                if(arr[j-1]<=i){
                    t[i][j]=t[i][j-1] || t[i-arr[j-1]][j-1];
                }else{
                    t[i][j]=t[i][j-1];
                }

            }
        }

        return t[sum][n];
    }
}