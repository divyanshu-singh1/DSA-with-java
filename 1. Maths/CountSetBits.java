import java.util.Scanner;

import javax.sql.StatementEventListener;
public class CountSetBits {;

    //Naive
    static void countSetBits(int n){
        int count = 0;
        while(n>0){
            if(n%2 != 0)count++;
            n=n>>1;
            System.out.println("HEEEEEyaaa");
        }
        System.out.println("Number of Set bits is : "+ count);
    }

    //Brian Kerningam's Algo 
    static void countSetBits2(int n){
        int count  = 0;
        while(n>0){
            n = n&(n-1);
            count++;
            System.out.println("HEEEEEyaaa");
        }
        System.out.println("Number of Set bits in 2nd Func is : "+ count);
    }

    //Table Lookup problem 

    static int tbl[] = new int[256];
    //static table declaration

    //Method for pre processing 
    static void intialize(){
        tbl[0] = 0;
        for(int i = 1 ; i< 256 ; i++){
            tbl[i] = tbl[i&(i-1)] + 1;
        } 
    }

    static int countSetBits3(int n){
        return (tbl[n&255]+ tbl[(n>>8)&255] + tbl[(n>>16)&255] + tbl[(n>>24)]);
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        // countSetBits(num);
        // countSetBits2(num);
        intialize();
        System.out.println(countSetBits3(num));
    }
}
