

public class LLImplementation {

    class Node {
        int data;
        Node next;
        Node(int x){
            data = x;
            next = null;
        }
    }

    Node head;
    int size;

    LLImplementation(){
        head = null;
        size = 0;

    }
    
    boolean push(int x){
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;
        return true;
    }

    int peek(){
        return (head == null ) ? Integer.MIN_VALUE : head.data;
    }

    int pop(){
        if(head == null)
            return Integer.MAX_VALUE;
        
        int res = head.data;
        head = head.next;
        size--;
        return res;
    }
    int size(){
        return size;
    }
    public static void main(String[] args) {
        LLImplementation s = new LLImplementation();

        s.push(5);
        s.push(4);
        s.push(3);
        System.out.println(s.size());
        s.push(2);
        s.push(1);
        System.out.println(s.size());


        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
