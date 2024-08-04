import java.util.ArrayDeque;

public class NextGreaterElement {
    static void method(int arr[]){
        ArrayDeque<Integer> s = new ArrayDeque<>();
        int i = arr.length-1;
        System.out.print("-1 ");
        s.push(arr[i--]);

        for(; i >= 0 ; i--){
            while(s.isEmpty() == false && s.peek() <= arr[i])
                s.pop();

            System.out.print((s.isEmpty()) ? "-1 " : s.peek()+" ");
            s.push(arr[i]);
        }
    }
    public static void main(String[] args) {
        method(new int[]{5,15,10,8,6,12,9,18});
    }
}
