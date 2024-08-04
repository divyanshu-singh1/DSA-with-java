import java.util.*;
public class ArrayOperations  {
    static Scanner sc = new Scanner(System.in);
    static void insertAt(int []arr,int index,int x){
        for(int i = arr.length-1 ;i>index ;i--){
            arr[i] = arr[i-1];
        }
        arr[index] = x;
    }
    static void enterElement(int []arr,int num){
        System.out.println("Enter "+num+" Elements \n");
        for(int i = 0 ; i< num ; i++){
            arr[i] = sc.nextInt();
        }
    }
    static void display(int []arr){
        System.out.println("The array is : " + Arrays.toString(arr));
    }

    static void deleteByIndex(int []arr,int x){
        for(int i = x ; i < arr.length-1;i++){
            arr[i] = arr[i+1];
        }

    }
    public static void main(String []args){
        int arr[]  = new int[10];
        enterElement(arr, 9);
        display(arr);
        // System.out.println("Enter Index and value to be inserted");
        // int index = sc.nextInt();
        // int val = sc.nextInt();
        // insertAt(arr,index,val);

        System.out.println("Enter index to be deleted");
        int index = sc.nextInt();
        deleteByIndex(arr, index);
        display(arr);



    }
}
