import java.util.Scanner;

public class CountDigit{
    public static int coundDigit(long num){
        int count  =0 ;
        while(num > 0){
            num = num/10;
            count++;
        }
        return count;
    }
    
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int count  = coundDigit(n);
        System.out.println(count);
    }
}