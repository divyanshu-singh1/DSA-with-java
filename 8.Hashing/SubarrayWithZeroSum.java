import java.util.*;

public class SubarrayWithZeroSum {
    static boolean hasSubWithZeroSum(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        int preSum = 0;
        for(int i = 0 ; i < arr.length ;i++){
            preSum += arr[i];
            if(set.contains(preSum))
                return true;
            if(preSum == 0)
                return true;
            set.add(preSum);
        }
        return false;

    }
    public static void main(String[] args) {
        int arr[] = {-3,2,14};
        System.out.println(hasSubWithZeroSum(arr));
    }
}
