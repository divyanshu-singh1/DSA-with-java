import java.util.*;
public class SumOfNatural {
    static int  findSum(int n){
        if(n==0)return 0;
        return n + findSum(n-1);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(findSum(num));

    }
}
