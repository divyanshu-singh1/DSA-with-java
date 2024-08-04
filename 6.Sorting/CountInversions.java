public class CountInversions {
    static void countInversion(int arr[]){
        int i = 0 , j= 1 , count = 0;

        while(i < arr.length){
            if (i< j){
                if(arr[i] > arr[j]){
                    j++;
                    System.out.print(arr[i]+" ");
                    count++;
                }else
                i++;
            }else
                i++;
        }
    }
    public static void main(String[] args) {
        countInversion(new int[]{2,4,1,3,5});
        
    }
}
