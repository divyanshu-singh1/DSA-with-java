import java.util.*;
public class Josephus {
    /* in this problem there are n people 0 to n-1 
     * 0 has gun at first , and he kills kth person counting him as first person 
     * then he passes the gun to the person next to who got killed 
     * this keeps happeing , we have to return the last survivor  number
      */
    static int jos(int n , int k){
        if(n==1)return 0;
        return (jos(n-1,k)+k)%n;
    }
    /*
     * there is modified version of this problem where first person number starts from 1 instead of 0
     * this is 1 to n , in such case we find answer in same way but 
     * add 1 to the answer after calculation 
     */

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(jos(n,k));
    }
}
