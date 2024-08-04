public class ReverseString {

    static void reverse(char []arr, int i , int j){
        if(i>j)return;
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        reverse(arr,i+1,j-1);
    }
    public static void main(String []args){
        String str = "Banana";
        char []arr = str.toCharArray();

        reverse(arr,0,str.length()-1);
        System.out.println(arr);
    }
}
