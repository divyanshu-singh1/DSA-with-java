import java.util.HashSet;
import java.util.Set;
public class PairWithGivenSum {
    static boolean isPair(int []arr , int sum){
        Set<Integer> h = new HashSet<>();
        for(int x : arr){
            if(h.contains(sum - x))
                return true;
            else   
                h.add(x);
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {8,3,4,5};
        System.out.println(isPair(arr,7));
    }
}
