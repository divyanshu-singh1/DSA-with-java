import java.util.ArrayDeque;
import java.util.*;

public class LargestRectWithAllOnes {
    static int largestRectangleinHistogram(int arr[],int n){
        ArrayDeque<Integer> s = new ArrayDeque<>();
        int res = 0 , curr = 0 , tp = 0;

        for(int i = 0  ; i < n ; i++){
            while(s.isEmpty() == false && arr[s.peek()] >= arr[i]){
                tp = s.pop();
                curr = arr[tp]*((s.isEmpty() ? i : (i - s.peek() -1)));
                res = Math.max(res,curr);
            }
            s.push(i);
        }

        while (s.isEmpty() == false) {
            tp = s.pop();
            curr = arr[tp]*((s.isEmpty() ? n : (n - 1 - s.peek())));
            res = Math.max(res,curr);
        }
        return res;
    }

    static int largestRectWithAllOnes(int [][]arr){
        int res = 0;
        int bar[] = new int[arr[0].length];

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                if(arr[i][j] == 1)
                    bar[j] +=  arr[i][j];
                else{
                    bar[j] = 0;
                }
            }
            System.out.println(Arrays.toString(bar));
            int val = largestRectangleinHistogram(bar, bar.length);
            System.out.println(val);
            res = Math.max(res, val);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[][] = new int[][]{{0,1,1,0},
                            {1,1,1,1},
                            {1,1,1,1},
                            {1,1,0,0}};

        System.out.println(largestRectWithAllOnes(arr));
        
    }
}
