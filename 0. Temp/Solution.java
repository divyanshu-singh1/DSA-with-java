

public class Solution {
    static int minSubArrayLen(int target, int[] nums) {
        int i = 0 , j = 0 ;
        int result = Integer.MAX_VALUE, currSum = 0;
        while(j < nums.length){
            currSum += nums[j];
            if(currSum >= target){
                System.out.printf("Here at i= %d and j= %d abnd currSum as %d \n",i,j,currSum);
                result = Math.min(result,j-i+1);
                currSum -= nums[i];
                if(i == j)j++;
                i++;
            }else{
                j++;
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
    public static void main(String []args){
        System.out.println(minSubArrayLen(7,new int[]{2,3,1,2,4,3}));
    }
}
