import java.util.Arrays;

public class IntersectionOfArray {
    static int[] intersection(int arr1[] , int arr2[] ){
        int n1= arr1.length;
        int n2= arr2.length;

        int  i = 0, j = 0 , k = 0 , last = -1;
        int temp[] = new int [(n1 < n2) ? n1 :n2];
        while( i <n1 && j < n2){
            if(arr1[i] == arr2[j] && arr1[i] != last){
                temp[k++] = arr1[i];
                last = arr1[i++];
                j++;
            }else if(arr1[i] < arr2[j]){
                i++;
            }else
                j++;
        }
        return temp;

    }

    static public void main(String args[]){
        int arr[] = intersection(new int[]{3,5,10,10,10,15,15,20},new int[]{5,10,10,10,15,30});
        System.out.println(Arrays.toString(arr));
    }
}
