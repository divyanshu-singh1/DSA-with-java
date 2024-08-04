import java.util.Arrays;
public class MaxAppearingElement {

    /*this is naive approach i couldn't even think about that 
     *works in O(n*MAX)
     *   wher max = 100;
     */
    static int maxAppearing(int  []left , int []right){
        int freq[]  = new int[100];
        int n = left.length;
        for(int i = 0; i<n;i++){
            for(int j = left[i]; j <= right[i] ;j++ ){
                freq[j] += 1;
            }
        }
        ///
        int res=0;
        for(int i = 0; i< 100;i++){
           if(freq[i] > res){
                res = i;
                System.out.println("value of res updated " + res);
           } 
        }
        return res;
    }

    /*
     * efficient solution 
     * 
     */
    static int maxAppearing2(int l[] ,int r[]){
        int n = l.length;
        int freq[] = new int[101];   
        /*
         * we mark point were range is starting and point affter range ends
         * this will help us to create freq array in O(n + max) time instead of O(n*max)
         */
        for(int i = 0 ; i<n;i++){
            freq[l[i]] = 1;
            freq[r[i]+1] = -1;
        }
        // System.out.println(Arrays.toString(freq));

        /*freq
         * now we create arrays of freq using prefix sum from left to right
         */
        int res = 0;
        for(int i = 1; i < freq.length;i++){
            freq[i] += freq[i-1];
            if(freq[i] > res )res = i;
        }
        // System.out.println(Arrays.toString(freq));
        return res;

        

    }

    public static void main(String[] args) {
        // int []l = {1,2,5,15 };
        // int []r = {5,8,7,18};
        int []l = {1,2,4};
        int r[] ={4,5,7};

        System.out.println(maxAppearing2(l, r));
        
    }
}
