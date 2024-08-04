import java.util.Scanner;


public class PowerItertive {

    static void findPower(int x ,int n){
        int res = 1;
        while(n>0){
           
            if(n%2 != 0){
                //bit is 1
                res = res*x;
            }
            n = n/2;
            x = x*x;
        }
        System.out.println(res);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        findPower(x, n);
    }
}
