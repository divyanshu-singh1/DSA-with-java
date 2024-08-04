import java.util.Scanner;

public class TrailingZeroes {
    //naive
    // this leads to overflow issues 
    public static void findFactAndTrail(int num){
        int res =1;
        for(int i = 1 ; i <= num ;i++){
            res = i*res;
        }
        System.out.println("This is iterative factorial "+res);

        int trails = 0;
        while((res%10)==0){
            res = res/10 ;
            trails++;
        }
        System.out.println("With trailing zeros " + trails);
    }
    
    //effeiceint 
    /*
     * so the fact that pair of (2,5) forms a trailing zero and the 
     * fact that in factorial this  is 
     * 1x2x3x4x5x6x7x8x9x10x....n
     * 
     * number of 5's are less than number of 2's so we use that idea
     * But imp is that : for greater numbers there are more that one
     * 5 as prime factor( ex 25 has two ) 
     * 
     * 
     * so formula 
     *  trailing zeros = [n/5] + [n/25] + n[n/125] ...
     * 
     * 
     * Time Complexity : O(logn)
     * 
     * 
     * 
     */
    public static void findTrail(int num){
        int trails = 0;
        for(int i = 5; i<num ; i *= 5){
            trails += num/i;
        }
        System.out.println("With trailing zeros " + trails);
    }



    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // findFactAndTrail(num);
        findTrail(num);
    }
}
