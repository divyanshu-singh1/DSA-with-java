public class MedianOfArray {
    static double getMedian(int a[] ,int b[]){
        int n1 = a.length;
        int n2 = b.length;
        int low = 0 , high = n1;
        while(low <= high){
            int i = (low + high)/2;
            int j = ((n1+n2+1)/2)-i;        //formula to calculate n2;


            int min1 = (i == n1) ? Integer.MAX_VALUE : a[i];
            int max1 = (i == 0) ? Integer.MIN_VALUE : a[i-1];

            int min2 = (j == n2) ? Integer.MAX_VALUE : b[j];
            int max2 = (j == 0) ? Integer.MIN_VALUE : b[j-1];

            if(max2 <= min1 && max1 <= min2){
                if((n1+n2)%2  == 0){
                    System.out.println("IN if");
                    return (double)(Math.max(max1,max2) + Math.min(min1,min2))/2;
                }else{
                    System.out.println("IN else");
                    return (double)Math.max(max1,max2);
                }
                    
            }else if(max2 > min1)
                low = i+1;
            else
                high = i-1;
        }
        return -1;
    }
    static public void main(String []args){

        System.out.println(getMedian(new int[]{10,20,30,40,50} , new int[]{5,15,25,30,35,55,65,75,85f}));

    }
}
