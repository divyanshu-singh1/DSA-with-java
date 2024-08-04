import java.util.*;
public class Permutations {

    static void findPermutations(char []arr,int i){
        if(i == arr.length -1){
            System.out.println(arr);
            return;
        }
        for(int j = i ; j < arr.length ; j++){
            char temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            
            findPermutations(arr, i +1);
            char temp2 = arr[j];
            arr[j] = arr[i];
            arr[i] = temp2;
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        char arr[] = str.toCharArray();
        // System.out.println(arr);
        findPermutations(arr,0);


    }
}
