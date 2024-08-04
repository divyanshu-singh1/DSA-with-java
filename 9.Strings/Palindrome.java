public class Palindrome {

    /*
     * seems constant but take theta(n) time and space
     */
    static boolean isPal(String str){
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        return str.equals(rev.toString());
    }
    /*
     * my approach , also the efficient approach
     * time O(n) and constant space
     */
    static boolean isPalindrome(String str){
        int i = 0 , j = str.length() -1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j))
                return false;
            i++ ;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("aa"));
    }
}
