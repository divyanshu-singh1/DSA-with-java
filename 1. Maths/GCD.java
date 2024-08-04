import java.util.*;
public class GCD {

    //Naive O(min(a,b))
    static void findGCD(int a, int b){
        int smaller = a < b ? a : b;
        for(int i = smaller ; i > 0 ; i--){
            if((a%i== 0) && (b%i == 0)){
                System.out.println("GCD is : " + i);
                break;
            }
        }
    }

    //this is extended euclid algo 
    static int findEuclidGCD(int a, int b){

        if( a == 0){
            return b;
        }
        return findEuclidGCD(b%a, a);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // findGCD(a, b);
        int res = findEuclidGCD(a, b);
        System.out.println("GCD with Euclid Algo is : " + res);

    }
}
