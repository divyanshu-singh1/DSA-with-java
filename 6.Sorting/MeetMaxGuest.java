import java.util.Arrays;

public class MeetMaxGuest {
    static int maxGuest(int dep[] ,int arr[]){
        int n = dep.length;
        Arrays.sort(arr);
        Arrays.sort(dep);

        int i = 1 , j = 0 , res = 1 ,curr = 1;
        while( i < n && j < n){
            if(arr[i] <= dep[j]){
                curr++;
                i++;
            }else{
                curr -- ;
                j++;
            }
            res = Math.max(res, curr);
        }
        return res;
    }

    static public void main(String []args){
        int arr[] = {900,600,700};
        int dep[] = {1000,850,700};

        System.out.println(maxGuest(dep, arr));
    }
}
