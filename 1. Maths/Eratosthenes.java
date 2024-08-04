import java.util.Arrays;
import java.util.Scanner;

public class Eratosthenes {

    static boolean isPrime(int n){
        if(n==1)return false;
        if(n ==2 ||  n ==3 )return true;
        if(n%2 == 0  || n%3 == 0)return false;

        for(int i = 5 ; i*i <= n ; i += 6){
            if(n%i == 0 || n%(i+2) == 0)return false;
        }
        return true;
    }

    //O(N sqrt(N))
    static void printPrimes(int n){
        if(n==1) return;
        for(int i = 2; i <= n; i++){
            if(isPrime(i))System.out.print(i+ " ");
        }
    }


    //Seive of Eratothenes 
    static void printPrimes2(int n){
        boolean arr[] = new boolean[n+1];
        Arrays.fill(arr,true);

        //Time complexity O(loglogn) almost linear
        
        for(int i = 2 ; i<= n ;i++){
            if(arr[i]){
                System.out.print(i+" ");
                for(int j = i*i ; j <= n; j = j+i){
                    arr[j] = false;
                }
            }
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printPrimes2(num);

    }
}
