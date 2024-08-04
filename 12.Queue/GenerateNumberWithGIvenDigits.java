import java.util.ArrayDeque;
import java.util.Queue;

public class GenerateNumberWithGIvenDigits {
    /*
     * print first n numbers in increasing order that asuch 
     * that all the numbers have digit in set {5,6}
     */
    static void method(int n){
        if(n < 2)
            return;
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(5);
        q.offer(6);

        for(int i = 0 ; i < n ; i ++){
            int x = q.poll();
            System.out.print(x+" ");
            q.offer(x*10 + 5);
            q.offer(x*10 + 6);
        }

    }
    public static void main(String[] args) {
        method(10);
    }
}
