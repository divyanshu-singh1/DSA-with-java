import java.util.*;
public class LargestElement {
    static void  findLargest(int arr[]){
        int largest = arr[0];
        for(int i = 1 ; i< arr.length;i++){
            largest = (arr[i] > largest) ? arr[i] : largest ;
        }
        System.out.println("The largest element is "+ largest);

    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {10,-3,5,3,2,86,4,22};
        findLargest(arr);
    }
    
    
}
