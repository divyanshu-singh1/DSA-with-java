public class FrequencyInSorted {
    /*
     * my approach not sure if works for all test cases
     * 
     */
    static void getFreq(int arr[]){
        int freq = 1;
        int n = arr.length;
        if(n==1){
            System.out.println("Frequency of " +arr[0] + " is 1");
            return;
        }
        for(int i = 0 ; i< n-1 ;i++){
            if(arr[i] == arr[i+1]){
                freq++;
            }else {
                System.out.println("Frequency of " +arr[i] + " is " + freq);
                freq = 1;
            }
        }
        
        if(arr[n-1] != arr[n-2])System.out.println("Frequency of " +arr[n-1] + " is 1");
        else System.out.println("Frequency of " +arr[n-1] + " is "+ freq);
    }

    /*
     * gfg approach 
     * 
     */
    static void getFreq2(int []arr){
        int i = 1,freq = 1;
        int n = arr.length;
        while(i < n){

            while(i < n && arr[i] == arr[i-1]){
                freq++; i++;
            }
            System.out.println(arr[i-1] + "  "+freq);
            i++;
            freq =1;
        }
        if( n==1 || arr[n-1] != arr[n-2])System.out.println(arr[n-1]+"  1");
    }
    public static void main(String[] args) {
        int arr[] = {10,20,34};
        getFreq2(arr);
    }
}
