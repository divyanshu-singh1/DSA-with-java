import java.util.*;

import javax.annotation.processing.SupportedOptions;




public class PrimeFactors {
    static boolean isPrime(int n){
        if(n == 1)return false ;
        if(n == 2 || n == 3 )return true;
        if(n%2 == 0 || n%3 == 0)return false;
    
        for(int i = 5 ; i*i <= n ; i = i+6){
            if(n%i == 0 || n%(i+2) == 0)return false;
        }
        return true;
    }
    
    //Naive
    // time O(NlogN)
    static void findPrimeFactor(int n){
        for(int i = 2 ; i<=n ;i++ ){
            int x = i;
            if(isPrime(i)){
                while(n%x == 0){
                    System.out.println(i+",");
                    x = x*i;
                    //iss we check ki ek i values kitne baar divisble hai i.e
                    // 2 se divide karenge , then 4 se then 8 se 
                    // so prime factors will be 2,2,2..
                }
            }
        }
    }

    //Efficient 


    static void findPrimeFactor2(int n){
        if(n<= 1)return;
        for(int i = 2 ;i*i <= n; i++){
            while(n%i == 0){
                System.out.print(i+",");
                n = n/i;
            }
        }
        if(n > 1)System.out.println(n);
    }
    /*
     * most optimal
     * time complexity O(root(n))
     * 
     */
    static void findPrimeFactor3(int n){
        if(n<= 1)return;
        while(n%2 == 0){
            System.out.print("2,");
            n = n/2;
        }
        while(n%3 == 0){
            System.out.print("3,");
            n = n/3;
        }

        for(int i = 5 ;i*i <= n; i += 6){
            while(n%i == 0){
                System.out.print(i+",");
                n = n/i;
            }
            while(n%(i+2) == 0){
                System.out.print((i+2)+",");
                n =n/(i+2);
            }
        }
        if(n > 3)System.out.println(n); // cause 2,3 are already handled explicitly

    }
    public static void main(String []rgs){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        findPrimeFactor3(num);
    }    
}
