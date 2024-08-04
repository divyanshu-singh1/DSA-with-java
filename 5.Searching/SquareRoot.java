public class SquareRoot {
    static int getSqrt(int num){
        int low = 1 , high = num;
        int ans = -1;
        while(low <= high){
            int mid = (high + low)/2;
            int msq = mid*mid;
            if(msq == num)return mid;
            else if(msq > num){
                high = mid-1;
            }else{
                low = mid+1;
                ans = mid;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(getSqrt(16));
    }
}
