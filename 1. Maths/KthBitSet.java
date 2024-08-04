import java.util.*;

public class KthBitSet {
    static void findKthBit(int n, int k ){
        n = n>>(k-1);
        if(n%2 != 0)System.out.println("Set");
        else System.out.println("Clear");
    }
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        findKthBit(num,k);
    }
}
