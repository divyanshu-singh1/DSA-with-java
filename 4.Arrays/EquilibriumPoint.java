public class EquilibriumPoint {
    /*
     * my approach with O(n^2) 
     */
    static int getEquilibruimPoint(int arr[]){
        
        int n = arr.length;
        for(int i = 0; i< n;i++){
            int lsum = 0,rsum = 0;
            for(int j = 0;j<n;j++){
                if(j<i){lsum += arr[j];
                System.out.println("lsum  is "+lsum);
                }
                if(j>i){rsum += arr[j];
                System.out.println("rsum is " + rsum);
                }
            }
            if(lsum == rsum)return i;
        }
        return -1;

    }
    /*
     * this is gfg efficient solution theta(n)
     * it first calc total sum and then 
     * calculates lsum and rsum while traversing array 
     * at each element and if (lsum == rsum) it returns true;
     */
    static boolean getPoint(int arr[]){
        int  n = arr.length;
        int rs = 0;
        for(int i = 0; i<n;i++)  //getting total sum value in right sum
            rs+= arr[i];

        int ls = 0;

        for(int i = 0; i< n;i++){ // calulating and comparing left sum and right sum
            rs -= arr[i];          //withing iterations and camparing them
            if(ls == rs){
                System.out.println("YEs at "+ i);
                return true;
            }
            ls+= arr[i];
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,8,-9,9,7};
        // int arr[]  = {4,2,2};
        System.out.println(getPoint(arr));
        
    }
}
