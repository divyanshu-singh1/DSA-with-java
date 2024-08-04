public class ThreeEqualPartion {
    /*
     * this soultion is not yet verified
     * 
     */
    static boolean have3EqualParts(int arr[]){
        int n = arr.length;
        int sum = 0;
        for(int  i = 0 ;i<n ;i++){
            sum+= arr[i];
        }

        int ls = arr[0] , rs =arr[n-1];
        for(int i = 0, j = n-1; i<j;){
            System.out.println("Value of ls and rs in begining of loop is "+ls+" "+rs);
            if(ls < rs){
                ls+= arr[++i];
                System.out.println("The value of ls at i="+i+" is "+ls);
            }else if( rs < ls){
                rs += arr[--j];
                System.out.println("The value of rs at  j= " +j+" is "+rs);
            }else{
                if(sum - (ls+rs) == ls)return true;
                else {
        
                    ls += arr[++i];
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {3,2,5,1,1,5};
        System.out.println(have3EqualParts(arr));
    }
}
