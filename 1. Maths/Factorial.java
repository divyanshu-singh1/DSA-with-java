import java.util.*;
public class Factorial{
    public static void findFact(int num){
        int res =1;
        for(int i = 1 ; i <= num ;i++){
            res = i*res;
        }
        System.out.println("This is iterative factorial "+res);
    }

    static int findFactRecursive(int num){
        if(num==0)return 1;
        return num*findFactRecursive(num -1);
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        findFact(n);
        System.out.println("This is recurive factorial " + findFactRecursive(n));
        
    }
}
