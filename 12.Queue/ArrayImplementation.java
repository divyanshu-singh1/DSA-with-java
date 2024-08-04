public class ArrayImplementation {

    static int arr[] ;
    static int rear;
    ArrayImplementation(int x){
        arr = new int[x];
        rear = -1;
    }

    static boolean enque(int x){
        if(rear != arr.length){
            arr[rear] = x;
            rear++;
            return true;
        }else{
            return false;
        }
    }

    static int deque(){
        if(rear == -1){
            return -1;
        }else{
            int res = arr[0];
            for(int i = 0 ; i < rear ;i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return res;
        }
    }

    static int getFront(){
        return rear == -1 ? rear : arr[0];
    }

    static int getRear(){
        return rear == -1 ? -1 : arr[rear];
    }

    static boolean isFull(){
        return (rear == arr.length);
    }

    static boolean isEmpty(){
        return (rear == -1);
    }

    public static void main(String[] args) {
        
    }
}
