import java.util.Arrays;

public class MinConsecutiveFlips {

    /*
     * my code after knowing approach 
     * inverts bits and prints output
     */
    static void flipBits(int arr[]){
        int n = arr.length;
        int first = arr[0]; 
        int last = arr[n-1];
        boolean flag = true;
        for(int i = 1 ; i<n;i++){ 
            if(flag && arr[i] != first){
                System.out.print("From " + i+" ");
                arr[i] = first;
                flag = false;
            }else if(arr[i] != first){
                arr[i] = first;
            }else if(arr[i] == first && !(flag)){
                System.out.println("To "+ (i-1));
                flag = true;
            }
        }
        if(arr[n-1]  !=  first){
            System.out.println("To " + (n-1));
        }

    }

    /*
     * gfg code works in O(n) time complexity
     * it doesnot flips bit but only tells the groups which are needed to  be fliped
     * 
     */
    static void minGroupflips(int arr[]){
        int n = arr.length;
        for(int i = 1 ; i< n;i++){
            if(arr[i] != arr[i-1]){
                if(arr[i] != arr[0])
                    System.out.print("From " +i+" to ");
                else 
                    System.out.println("To "+(i-1));
            }
        }
        if(arr[0] != arr[n-1])System.out.println("To "+(n-1));
    }
    public static void main(String[] args) {
        int arr[] = {1,1,0,0,0,1,1,0,1};
        // flipBits(arr);
        minGroupflips(arr);
        System.out.println(Arrays.toString(arr));

    }
}
