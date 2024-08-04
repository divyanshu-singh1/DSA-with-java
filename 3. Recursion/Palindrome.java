import java.util.*;
public class Palindrome {
    //my logic with hint 
    // static boolean isPalindrome(String str){
    //     int n = str.length();
    //     if(n == 0 || n == 1)return true;
    //     if(str.charAt(0) !=str.charAt(n-1))return false;
    //     return isPalindrome(str.substring(1,n-1));
    // }


    //right logic 
    static boolean isPalindrome(String  str , int start ,int end){
        if(start >= end)return true;
        return(str.charAt(start) == str.charAt(end)) && isPalindrome(str, start+1, end-1);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String  str = sc.next();
        System.out.println(isPalindrome(str,0,str.length()-1));

    }
}
