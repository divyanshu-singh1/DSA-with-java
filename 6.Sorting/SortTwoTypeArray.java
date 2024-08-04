import java.util.Arrays;

public class SortTwoTypeArray {
    static void funcMagnitude(int arr[]){
        int low = -1 , high = arr.length;
        while(true){
            do{
                low++;
            }while(arr[low] > 0);

            do{
                high--;
            }while(arr[high] < 0);

            System.out.println("Value fo lwo and high : "+ low +"  "+high);
            if(low <= high){
                int temp = arr[low];
                arr[low] = arr[high] ;
                arr[high] = temp;
            }else
                break;

            System.out.println(Arrays.toString(arr));
        }
    }
    static void funcBinary (int arr[]){
        int low = -1 , high = arr.length;
        while(true){
            do{
                low++;
            }while(arr[low] == 0);

            do{
                high--;
            }while(arr[high] != 0);

            System.out.println("Value fo lwo and high : "+ low +"  "+high);
            if(low <= high){
                int temp = arr[low];
                arr[low] = arr[high] ;
                arr[high] = temp;
            }else
                break;

            System.out.println(Arrays.toString(arr));
        }
    }
    static void funcEvenOdd (int arr[]){
        int low = -1 , high = arr.length;
        while(true){
            do{
                low++;
            }while(arr[low]%2 == 0);

            do{
                high--;
            }while(arr[high]%2 != 0);

            System.out.println("Value fo lwo and high : "+ low +"  "+high);
            if(low <= high){
                int temp = arr[low];
                arr[low] = arr[high] ;
                arr[high] = temp;
            }else
                break;

            System.out.println(Arrays.toString(arr));
        }
    }
    public static void main(String[] args) {
        int arr[] = {15,14,13,12};
        funcEvenOdd(arr);
        System.out.println(Arrays.toString(arr));
    }
}
