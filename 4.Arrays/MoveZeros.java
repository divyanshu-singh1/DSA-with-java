import java.util.Arrays;

public class MoveZeros {

    //this is my naive approach 
    /*
     * O(n) time complexity but does more than n iteration
     */
    static void moveZeros(int arr[]){
        int i = 0 ,j =0  , n = arr.length;
        int count  = 0;
        while(j<n){
            if(arr[i] != 0){
                i++;
                j++;
            }
            else if (j<=i || arr[j] == 0)j++; // if i use if instead of "else if" 
            else{                               //there will be ArrayIndexOOB excpetion bcoz of double update of j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            count++;
        }
        System.out.println(count);

    }

    /*
     * Efficient solution
     * this is gfg solution works in O(n) and does n interations
     */
    static void moveZeros1(int arr[]){
        int count = 0; //this variable counts no. of non zeros and stops at first zero
        int n= arr.length;
        for(int i = 0 ;i<n;i++){
            if(arr[i] != 0 ){           //until count is at 0 , it increments both i and count
                int temp = arr[i];      //once they both at 0 , then only i is incremented till it 
                arr[i] = arr[count];    // is at another non zero ,then they swap
                arr[count] = temp;
                count++;
            }
        }
    }
    public static void main(String []args){
        int arr[] = {8,10,0,0,6,0,5,0,1};
        moveZeros1(arr);
        System.out.println(Arrays.toString(arr));
    }  
}
