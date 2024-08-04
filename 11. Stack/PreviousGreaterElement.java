import java.util.ArrayDeque;

public class PreviousGreaterElement {
    static void method(int []arr){
        ArrayDeque<Integer> s = new ArrayDeque<>();
        s.push(0);
        System.out.print("-1 ");
        for(int i = 1; i< arr.length ;i ++){
            while(s.isEmpty() == false && arr[s.peek()] <= arr[i]){
                s.pop();
            }

            System.out.print((s.isEmpty()) ? "-1 ": arr[s.peek()]+" ");
            
            s.push(i);
        }
    }
    public static void main(String[] args) {
        method(new int[]{15,10,18,12,4,6,2,8});
        System.out.println();
        method(new int[]{8,10,12});
        System.out.println();
        method(new int[]{12,10,8});
    }
}
