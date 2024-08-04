import java.util.*;
public class ReverseWords {
    
    static void reverse(char arr[] , int low , int high){
        while(low < high){
            char temp = arr[low];
            arr[low ] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    static void reverseWords(char []arr){
        int n = arr.length;
        int p = -1;
        for(int i = 0 ; i < n;i++){
            if(i != 0 && arr[i] ==  ' '){
                reverse(arr,p+1,i-1);
                p = i;
            }
        }
        reverse(arr,p+1,n-1);
        reverse(arr, 0, n-1);

    }
    public static void main(String[] args) {
        char arr[] = "I love coding".toCharArray();
        reverseWords(arr);
        System.out.println(arr);

    }
}
