/**
 * MaxConsecutive1
 */
public class MaxConsecutive1 {
    static int maxOnes(int []arr){
        int res = 0;
        int max = 0;
        for(int i=0 ; i<arr.length;i++){
            if(arr[i] == 0)max = 0;
            else{
               
                max++;
                res = Math.max(res,max);
            }
        }
        return Math.max(res,max);

    }
    public static void main(String[] args) {
        int arr[] = {1,0,1,1,1,};
        System.out.println(maxOnes(arr));
    }
    
}