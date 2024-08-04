public class CoinChange {
    static void solve(int []coins, int target , int currSum,int count[],int start){
        if(currSum > target)return;
        if(currSum == target){
            count[0]++;
            // System.out.printf("The curr sum is %d with count %d\n",currSum,count[0]);
            return;
        }
        for(int i = start ; i < coins.length ; i++){
            currSum += coins[i];
            solve(coins,target,currSum,count,i);
            currSum -= coins[i];
        }
    }
    public static void main(String []arg){
        int coins[] = {1,2,3};
        int count[] = {0};
        int target = 4;
        solve(coins,target,0,count,0);
        System.out.println(count[0]);
    }
}
