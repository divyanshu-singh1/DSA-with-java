import java.util.Arrays;
public class RemoveDuplicates {
    static int removeDup(int arr[]){
        int n = arr.length ;
        int res = 1;
        for(int i = 1 ;i< n;i++){
            if(arr[i-1] != arr[i]){
                arr[res++] = arr[i];
            }
        }
        
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,20,30,30,40};
        System.out.println(removeDup(arr));
        System.out.println(Arrays.toString(arr));

    }
}
