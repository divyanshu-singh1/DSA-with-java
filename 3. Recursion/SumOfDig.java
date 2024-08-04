import java.util.Scanner;
public class SumOfDig {
    static int getSumOfDigits(int n){
        if(n == 0)return 0;
        return n%10 + getSumOfDigits(n/10);
    }
    
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(getSumOfDigits(num));
    }
}
