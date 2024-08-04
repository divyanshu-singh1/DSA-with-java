
import java.util.*;

public class LeftmostRepeating {
    /*
     * gut approach but requires two traversal
     * time O(n)
     */
    static int getAns(String str){
        int count[] = new int[256];
        for(int i = 0 ;i < str.length() ;i++){
            count[str.charAt(i)]++;
        }
        // System.out.println(Arrays.toString(count));
        for(int i = 0 ; i < str.length() ;i++){
            if(count[str.charAt(i)] > 1)
                return i;
        }
        return -1;
    }
    
    /*
     * efficient approach 1 
     * takes one traveral only O(n)
     */

    static int effcientOne(String str){
        int fIndex[] = new int[256];
        Arrays.fill(fIndex,-1);
        int res = Integer.MAX_VALUE;
        for(int i = 0 ; i< str.length() ; i++){
            int fi = fIndex[str.charAt(i)];
            if(fi == -1)
                fIndex[str.charAt(i)] = i;
            else
                res = Math.min(res,fi);
        }

        return (res == Integer.MAX_VALUE) ? -1 : res;
    }
    public static void main(String[] args) {
        System.out.println(getAns("zbhcc"));
    }
}
