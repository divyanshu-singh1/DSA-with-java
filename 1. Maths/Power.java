import java.util.Scanner;

/*
 * Effieceint solution works on the fact that 
 * power(x,n)  =
 *  if (n%2 == 0)
 *      power(x,n/2)*power(x,n/2);
 * else 
 *      power(x,n-1)*x;
 */

public class Power {

    static int findPower(int a , int n){
        if(n == 0)return 1;
        int res = a;
        boolean flag = false;
        if( n < 0 && n%2 == -1){
            n = 0 - n;
            System.out.println("changed value of n " + n);
            flag = true;
        }
        for(int i = 1 ; i <  n; i++){
            res = res*a;
        }
        if(flag)return (0-res);
        return res;
    }

    static int power(int x ,int n){
        if(n== 0)return 1;
        int temp = power(x,n/2);
        temp =temp*temp;
        if(n%2 == 0)
            return temp;
        else 
            return temp*x;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        // System.out.println(findPower(a,n));
        // System.out.println(a%2);
        System.out.println(power(a, n));
    }
}
