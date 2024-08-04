public class Subsequence {
    /*
     * iterative solution
     * O(n+m) : time
     * O(1) : space
     */
    static boolean isSubseq(String s1 , String s2){
        int  n1 = s1.length();
        int n2 = s2.length();

        int i = 0 , j = 0;
        while (j < n2 && i < n1){
            if(s1.charAt(i) == s2.charAt(j)){
                i++;
                j++;
            }else
                i++;

        }
        return j == n2;
    }

    /*
     * recursive solution
     * O(n+m) space and time
     * 
     */
    static boolean isSubseqRec(String s1 ,String s2 , int i , int j){
        
        if(j == s2.length())return true;
        if(i == s1.length())return false;

        if(s1.charAt(i) != s2.charAt(j))
            return isSubseqRec(s1, s2, i+1, j);
        else 
            return isSubseqRec(s1, s2, i+1, j+1);
    }
    public static void main(String[] args) {
        // System.out.println(isSubseq("ABCDE", "AED"));
        System.out.println(isSubseqRec("ABCDE", "AED",0,0));
    }
}
