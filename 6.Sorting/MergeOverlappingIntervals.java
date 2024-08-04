public class MergeOverlappingIntervals {

    class Intervals{
        int start ;
        int end;
        Intervals(int st , int e){
            start = st;
            end = e;
        }
    }
    static void mergeIntervals(Intervals arr[]){
        int n = arr.length;

        /* code below is using comparator to sort array
         *  in increasing order of start value
         */
        //sort(arr,mycomp);

        int res = 0;
        for(int i = 1; i <n;i++){
            if(arr[res].end >= arr[i].start){
                arr[res].end = Math.max(arr[res].end , arr[i].end);
            }
            else{
                res++;
                arr[res] = arr[i];
            }
        }

        // code below prints new intervals
        for(Intervals x : arr){
            System.out.println(x.start+"\t"+x.end);
        }
    }
    public static void main(String[] args) {
        
    }
}
