public class Stockp1{

    //this is my approach it does the job but 
    /*
     * it is very complicated and unneccesory
     */
    static int stockVal(int arr[]){
        int res = 0;
        int n = arr.length;
        int cp = 0 , sp = 0 ;
        boolean can_buy_stock = true;

        for(int i = 1 ; i< n; i++){
            if(can_buy_stock){
                if(arr[i-1] < arr[i]){
                    cp = arr[i-1];
                    can_buy_stock = false;
                    System.out.println("Bought stock at index " + (i-1)+"  for "+ arr[i-1]);
                }
                if(!(can_buy_stock) && i == (n-1)) {
                    sp = arr[i];
                    System.out.println("Sold stock at index " + (i)+"  for "+ arr[i]);
                    res += sp-cp;
                    System.out.println("With total profit "+res);
                    can_buy_stock = true;
                }
            }else{
                if(arr[i-1] > arr[i] ){
                    sp = arr[i-1];
                    System.out.println("Sold stock at index " + (i-1)+"  for "+ arr[i-1]);
                    res += sp-cp;
                    System.out.println("With total profit "+res);
                    can_buy_stock = true;


                }else if(i == (n-1)){
                    sp = arr[i];
                    System.out.println("Sold stock at index " + (i)+"  for "+ arr[i]);
                    res += sp-cp;
                    System.out.println("With total profit "+res);
                    can_buy_stock = true;
                }
            }
            // if(i == (n-1)){
            //         sp = arr[i];
            //         System.out.println("Sold stock at index " + (i)+"  for "+ arr[i]);
            //         res += sp-cp;
            //         System.out.println("With total profit "+res);
            //         can_buy_stock = true;
            // }
        }
        return res;
    }
    //simple efficient solution
    static int  getProfit(int arr[]){
        int profit = 0;
        for(int i = 1 ;i<arr.length;i++) 
            if(arr[i] > arr[i-1])
                profit += arr[i] - arr[i-1];
        return profit;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,3,8,12};
        System.out.println(getProfit(arr));

    }
}