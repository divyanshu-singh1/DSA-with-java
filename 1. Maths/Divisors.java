import java.util.Scanner;


/*
 * Uses concept that facotrs are in pairs like for 
 * 65 : (1,65) , (5,13)
 * so we only traverse till root n cause lower element of pair will exist before root of n;
 * after that to get divisor after root n we divde n with first element of pairs to get 2nd element 
 * 
 */
public class Divisors {

    //Time : O(sqrt(n))
    static void printDivisor(int n){
        int i;
        // prints all divisors  from 1 to root n
        //Note: we use loop (<n) not (<= n) because for numbers like 25 which are perfect squares 
        // they would be printed twice once in both loops because there pair are themselves 25 : (5,5)
        for(i = 1 ; i*i < n ; i++){
           if(n%i == 0){
            System.out.print(i+ " ");
           }
        }

        //then from root n to n 
        for( ; i >= 1 ;i--){
            if(n%i == 0){
                System.out.print(n/i+" ");
            }
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printDivisor(num);
    }
}
