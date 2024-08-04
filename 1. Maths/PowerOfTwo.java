import java.util.Scanner;

public class PowerOfTwo {
    static boolean isPowerOf2(int num){
        if(num == 0)return false;
        return (num &(num-1)) == 0;

        /*
         * we can also write 
         * return (n&&((num &(num-1)) == 0));
         *          ^ if n will be 0 it will return false and right side wont be evaluated
         * so it will do the job in single line of code
         */
    }
    public static void main(String []args){
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isPowerOf2(num));
    }
}
