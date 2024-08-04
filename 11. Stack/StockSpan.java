import java.util.*;
public class StockSpan {
    // my implementation
    static void getSpan(int arr[]){
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        outer:
        for(int i = 0 ;i < arr.length ;i++){
            // System.out.println(stack.toString());
        
            while(stack.isEmpty() == false){
                if(arr[stack.peek()] >= arr[i]){
                    System.out.print(i-stack.peek()+" ");
                    stack.push(i);
                    continue outer;
                }else{
                    stack.pop();
                }

            }
            System.out.print(i+1+" ");
            stack.push(i);
        }


    }

    /*
     * actuall gfg implementation
     */
    static void getSpan2(int []arr){
        ArrayDeque<Integer> s = new ArrayDeque<>();
        s.push(0);
        System.out.print(1+" ");

        for(int i = 0 ; i< arr.length ;i++){
            while(s.isEmpty() == false && arr[s.peek()] <= arr[i])
                s.pop();

            int span = s.isEmpty() ? i + 1 : i - s.peek();
            System.out.print(span +  " ");
            s.push(i);
        }

    }
    public static void main(String []args){
        getSpan2(new int[]{13,15,12,14,16,8,6,4,10,30});
    }
}
