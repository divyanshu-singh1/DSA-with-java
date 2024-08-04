import java.util.*;
public class LCM {
    //Naive O(a*b - max(a,b)) time 
    static void findLCM(int a , int b){
        int max  = Math.max(a,b);
        boolean flag = true ;
        while(flag){
            if((max%a == 0) && (max%b == 0)){
                System.out.println(max + " is LCm");
                flag = false;
            }
            max++;
        }
    }


    static int findHCF(int a,int b){
        if(a == 0){
            return b;
        }
        return findHCF(b%a, a);
    }


    //Efficient 
    /*
     * we know that 
     *  a*b = HCF(a,b)*LCM(a,b);
     * so we will find hcf then use this formula 
     * time = O(log(min(a,b)))
     */


    static int findEffLCM(int a , int b ){
        return (a*b)/findHCF(a,b);
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // findLCM(a, b);
        System.out.println("LCM is : " +findEffLCM(a, b));
    }
}
