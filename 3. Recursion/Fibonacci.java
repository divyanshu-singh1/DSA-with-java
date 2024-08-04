import java.util.Scanner;

public class Fibonacci {
    static int findNthFib(int n){
        if(n==0)return 0;
        if(n==1)return 1;
        return findNthFib(n-2) + findNthFib(n-1);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(findNthFib(num));
    } 
}
