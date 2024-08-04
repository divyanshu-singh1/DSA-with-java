public class ArrayImplementation {
    int stack[];
    int cap;
    int size = 0;

    ArrayImplementation(int cap){
        stack = new int[cap];
        this.cap = cap;
    }

    boolean push(int x){
        if(cap != size){
            stack[size] = x;
            size++;
            return true;
        }else
            return false;
    }

    int peek(){
        return (size == 0) ? -1 : stack[size-1];
    }
    int pop(){
        if(size != 0){
            int res = stack[size-1];
            size--;
            return res;
        }else   
            return -1;
        
    }
    public static void main(String[] args) {
        ArrayImplementation s = new ArrayImplementation(5);

        s.push(4);
        s.push(3);
        System.out.println(s.peek());
        s.push(2);
        s.push(1);
        System.out.println(s.peek());


        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

    }
}
