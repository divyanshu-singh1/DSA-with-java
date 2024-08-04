import java.util.*;
public class GetMinWithOneTime {
    static ArrayDeque<Integer> s = new ArrayDeque<>();
    static ArrayDeque<Integer> min = new ArrayDeque<>();

    /* this bs was done by my it didnt required that much code */
    // static void pushx(int x){
    //     s.push(x);
    //     while(min.isEmpty() == false && min.peek() < x){
    //         s.push(min.pop());
    //     }
    //     // if(min.isEmpty() || min.peek() < x)
    //         min.push(x);
    //     while(s.isEmpty() == false && s.peek() != x)
    //         min.push(s.pop());

    // }

    // static int pop(){
    //     int x = s.peek();

    //     while(min.isEmpty() == false && min.peek() != x){
    //         s.push(min.pop());

    //     }
    //     if(min.isEmpty() == false)min.pop();

    //     while(s.isEmpty() == false && s.peek() != x)
    //         min.push(s.pop());
        
    //     return s.pop();
    // }

    /* gfg
     * but this wont work since its needed to resolve null pointer exceptions which will takes few more lines of code
     */

    // static void pushx(int x){
    //     s.push(x);
    //     if(min.peek() >= s.peek())
    //         min.push(x);
    // }

    // static int pop(){
    //     if(min.peek() == s.peek())
    //         min.pop();
    //     return s.pop();
    // }

    static int getMin(){
        return (min.isEmpty()) ? -1 : min.peek();
    }

    public static void main(String[] args) {
        //test case one
        // pushx(20);
        // pushx(10);
        // System.out.println(getMin());
        // pushx(5);
        // System.out.println(getMin());
        // pop();
        // System.out.println(getMin());
        // pop();
        // System.out.println(getMin());
        // pushx(20);


        //test case two

        pushx(5);
        pushx(4);
        pushx(3);
        System.out.println(getMin());
        pop();
        System.out.println(getMin());
        pushx(2);
        System.out.println(getMin());
    }
}
