public class TrapRain {
    /*
     * this is  the naive solution
     */
    static int maxRain(int arr[]){
        int res =0;
        int n = arr.length;
        for(int i =1 ; i< n-1; i++){

            //Getting leftmost high bar for element i
            int Lmax = arr[i];
            for(int j = 0 ; j<i;j++){
                Lmax = Math.max(Lmax,arr[j]);
            }

            //Getting rightmost high bar for element i
            int Rmax = arr[i];
            for(int j = i+1; j<n;j++){
                Rmax = Math.max(Rmax,arr[j]);
            }

            res = res + (Math.min(Lmax,Rmax) - arr[i]);
        }
        return res;
    }
    /*
     * So in naive solution we were computing Lmax and Rmax for each element 
     * to get efficient solution we will precompute Lmax adn Rmax for every element  wiht help of 2 aux. arrays
     * 
     * and then finaly we get max rain as done in naive solution
     * in Theta(n) Auxilary space and time compexity
     */
    static int maxRain2(int []arr){
        int n = arr.length;
        int []Rmax = new int[n];
        int []Lmax = new int[n];

        Lmax[0]  = arr[0];
        for(int i = 1 ; i< n; i++)
            Lmax[i] = Math.max(Lmax[i-1],arr[i]);
        
        Rmax[n-1] = arr[n-1];
        for(int i = n-2; i>= 0 ; i--){
            Rmax[i] = Math.max(Rmax[i+1],arr[i]);
        }
        int res = 0;
        for(int i = 1 ; i<n-1; i++){
            res = res + (Math.min(Lmax[i],Rmax[i]) - arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]  = {5,0,6,2,3};
        System.out.println(maxRain2(arr));


    }
}
