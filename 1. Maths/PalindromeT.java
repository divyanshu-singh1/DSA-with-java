
import java.util.*;

public class PalindromeT {
    public static boolean palindrome(int n){
        int rev = 0;
        int num  =n;
        while(n > 0){
            int last = n%10;
            n =n/10;
            rev = (rev *10) + last;
            System.out.println(rev);
        }
        if(num==rev)return true;
        else return false;
    }
    public static void main(String argsp[ ]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        
        System.out.println(palindrome(num));
    }
}
