import java.util.*;
public class OneToN {
    static void findOne2n(int n){
        if(n==0)return;
        findOne2n(n-1);
        System.out.print(n);
    }

    static void findN2One(int n){
        if(n == 0) return;
        System.out.print(n);
        findN2One(n-1);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // findOne2n(n);
        findN2One(n);
    }
}
