public class MajorityElement {

    //my naive approach 
    static int getMajorityElementIndex(int arr[]){
        int count = 0 , res = -1,max = 0,index = -1;;
        
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            for(int j =0 ; j<n ;j++){
                if(arr[i] == arr[j]){
                    count++;
                    index = i;
                }
            }
            if(count > max){
                max = count;
                res = index;
            }
            System.out.println("the value of count and max at " + i+ "  value of i is " +count+"  "+max);
            count = 0;
        }
        // System.out.println(n/2);
        if(max > n/2)
            return res;
        else
            return -1;
    }

    /*  gfg naive solution O(n^2)
     * it also returns first index 
     *  
     * 
     */
    static int getMajority(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n;i++){
            int count = 1;
            for(int j = i+1; j<n;j++)
                if(arr[j] == arr[i])
                count++;
            if(count > n/2)return i;
        }
        return -1;
    }

    /*
     * efficient solution with O(n) time
     * 
     */
    static int findMajority(int arr[]){
        int res = 0 , count = 1;
        int n = arr.length;
        for(int i = 1 ;i< n ;i++){
            if(arr[res] == arr[i])
                count++;
            else 
                count--;
            
            if(count == 0){res = i ; count = 1;}
        }

        count = 0; 
        for(int i =0 ; i< n;i++){
            if(arr[res] == arr[i])
                count++;
        }
        if(count <= n/2)res = -1;

        return res;
    }
    public static void main(String[] args) {
        int arr[] = {9,8,5,7,8,8,8,8};
        // System.out.println(getMajorityElementIndex(arr));
        // System.out.println(getMajority(arr));
        System.out.println(findMajority(arr));
    }
}
