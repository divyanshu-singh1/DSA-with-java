import java.util.Scanner;
public class DecToBin {
    //recursive way to print binar code
    static void findBinary(int n){
        if(n == 0)return ;
        findBinary(n/2);
        System.out.print(n%2);
    }

    //it prints in reverse order , we can make a string and reverse it tp get actial code
    
    static void findBin(int n){
        while(n > 0){
            System.out.print(n%2);
            n= n/2;
            
        }
    }
    public static void main (String [] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        // findBinary(n);
        findBin(n);
        
    } 

}
