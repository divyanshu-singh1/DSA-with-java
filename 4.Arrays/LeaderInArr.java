import java.util.Arrays;

public class LeaderInArr {
    /*
     * this is my solutions with theta(n) time and space 
     * and it can print leaders from left to right
     * 
     * However , same can ne done in constant space by maintaing a current leader variable
     * but in that way we can only print from right to left
     * and that approach is : that we don't store them in array instead
     * maintain a variable max , and keep traversing from right side ,update it and print it
     */
    static void findLeaders(int arr[]){
        int n = arr.length;
        int Rmax[]  = new int[n];
        Rmax[n-1] = arr[n-1];
        for(int i = n-2 ; i >= 0;i-- ){
            if(arr[i] > Rmax[i+1]){
                Rmax[i] = arr[i];
            }else{
                Rmax[i] = Rmax[i+1];
            }
        }

        for(int i = 1 ; i <n ;i++){
            if(Rmax[i-1] != Rmax[i])System.out.print(Rmax[i-1]+" ");
        }
        System.out.print(Rmax[n-1]);
        // System.out.println(Arrays.toString(Rmax));
    }


    public static void main (String []args){
        int arr[] = {7,10,4,10,6,5,2};

        findLeaders(arr);
        // System.out.println(Arrays.toString(arr));
    }
}
