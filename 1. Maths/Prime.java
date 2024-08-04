import java.util.*;

public class Prime {

    //O(n)

    static boolean isPrime(int n){
       //corner case is 1
        if(n == 1)return false;
        for(int i = 2 ; i < n ;i++){
            if(n%i == 0) return false;
        }
        return true;
    }

    //Time O(rootn)
    static boolean isPrime2(int n){
        //corner case is 1
         if(n == 1)return false;
         for(int i = 2 ; i*i < n ;i++){
             if(n%i == 0) return false;
         }
         return true;
    }

    //Optimized
    // its three times faster than efficient oneN
    static boolean isPrime3(int n){
        //corner case is 1
         if(n == 1)return false;
         if(n == 2 || n == 3) return true;
         if(n%2 == 0 || n%3 == 0)return false;
         for(int i = 5 ; i*i <= n ;i += 6){
            if(n%i == 0 || n%(i+2) == 0)return  false;
         }
         return true;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num =  sc.nextInt();
        System.out.println(isPrime(num));
    }
}
