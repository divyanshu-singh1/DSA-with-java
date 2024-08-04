public class LPSArray {
    /*
     * this is naive method to create lps array 
     * work in O(n^3) time complexity
     */
    static int naiveLPS(String str, int n){
        for(int len= n-1 ; len > 0 ; len--){
            boolean flag = true;
            for(int i = 0 ; i< len ; i++)
                if(str.charAt(i) != str.charAt(n-len+i))
                    flag = false;
            if(flag)
                return len;
        }
        return 0;
    }

    void fillLps(String str, int lps[]){
        for(int i = 0 ; i < str.length() ;i++)
            lps[i] = naiveLPS(str,i+1);
    }


    /*
     * this is efficient lps func works 
     * in O(N) time use already calculated lps values to calculate current lps value
     * 
     */
    static void effLPS(String str , int lps[]){
        int n = str.length() , len = 0;
        lps[0] = 0;
        int i = 1;
        while(i < n){
            if(str.charAt(i) == str.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }else{
                if(len == 0 ){
                    lps[i] = 0 ;
                    i++;
                }else{
                    len = lps[len-1];
                }
            }
        }
    }
    public static void main(String[] args) {
        

    }
}
