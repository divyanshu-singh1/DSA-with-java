import java.util.Scanner;

public class OneOddOccuring {
    static void findOddOne(int []arr){
        int x =arr[0];
        //here we wil XOR all elments and all even occuring elements will cancel out
        /*
         * since x ^ x = 0  // this is for even number XOR is zero
         *       x ^ 0 = x  // for add , that itself is sol
         */
        for(int i = 1 ; i< arr.length; i++){
            x =  x ^ arr[i];
        }
        System.out.println(x);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i = 0;i<num; i++){
            arr[i]= sc.nextInt();
        }
        findOddOne(arr);
    }
}
