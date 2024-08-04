import java.util.*;
public class Factorial {
    
    static int   findFact(int n){
        if(n==0)return 1;
        return n * findFact(n-1);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(findFact(num));
    }
}
