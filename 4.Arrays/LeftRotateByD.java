import java.util.Arrays;

public class LeftRotateByD {
    /*
     * my approach ,not efficient 
     */
    static void roateByD(int []arr , int d){
        int temp_arr[] = new int[d]; // shifting d elements to temp array
        for(int i = 0 ; i< d ;i++){
            temp_arr[i] = arr[i];
        }
        int  n = arr.length;            //rotate d elements in mainn array 
        for(int i = d ; i < n ;i++){
            arr[i-d] = arr[i];
        }
        for(int i = n-d, j = 0; j < d;i++ ,j++){      //putback d elements form temp_arr to main_arr
            arr[i] = temp_arr[j];
        }
    }

    /*
     * three more solutions from gfg 
     * 1st is that we call rotate array bt 1 function d times 
     * time complexity : O(nd)
     * 
     * 2nd :same as my naive approach but clearer and bettwe implementation fo third loop
     * (n) time complexity with (d) Auxillary space
     * 
     * static void rotateByD2(int arr[],int d){
     *  int temp[] = new int[d]; 
        for(int i = 0 ; i< d ;i++){
            temp[i] = arr[i];
        }
        int  n = arr.length;           
        for(int i = d ; i < n ;i++){
            arr[i-d] = arr[i];
        }
        for(int i = 0; i < d;i++){      
            arr[n-d+i] = temp[i];
        }
     * }
     * 
     * 
     */

     /*
      * 3rd and most efficient approach is that we use "reverse" funct three times 
      * whole array get roated automatically
      * initially [1,2,3,4,5] 
        : reverse 0 to d -> [2,1,3,4,5] 
        : reverse d to n-1 -> [2,1,5,4,3]
        : reverse 0 to n-1 -> [3,4,5,1,2]
        TIme complexity 
        Theta(d+n-d+n)
        =>theta(2n)
        =>theta(n) , space (1)
      */
    
    static void roateByD2(int []arr,int d){
        int n = arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    static void reverse(int []arr,int i,int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int d = 2;
        roateByD2(arr,d);
        System.out.println(Arrays.toString(arr));
    }
}
