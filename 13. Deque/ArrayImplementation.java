

public class ArrayImplementation {
    int arr[];
    int front = -1 ; 
    int rear = -1;
    int size;

    ArrayImplementation(int x){
        size = x;
        arr = new int[x];
    }

    void insertFront(int x){
        if(isFull()){
            return;
        }
        if(front == -1){
            arr[++front] = x;
            rear++;
        }else{
            for(int i = rear; i >= 0 ; i--){
                arr[i+1]  = arr[i];
            }
            arr[front] = x;
            rear++;
        }
        size++;
    }

    void insertRear(int x){
        if(isFull()){
            return;
        }

        if(rear == -1){
            arr[++rear] = x;
            front++;
        }else{
            arr[++rear] = x;
        }

        size++;

    }

    boolean deleteRear(){
        if(isEmpty()){
            return false;
        }else{
            rear--;
            size--;
            return true;
        }

    }
    boolean deleteFront(){
        if(isEmpty()){
            return false;
        }else{
            for(int i = 0 ; i < rear ; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            if(rear == -1){
                front = -1;
            }
            size--;
            return true;
        }
    }

    int getFront(){
        return isEmpty() ? -1 : arr[front];
    }
    int getRear(){
        return isEmpty() ? -1 : arr[rear];

    }

    int size(){
        return size;
    }

    boolean isEmpty(){
        return size == 0;
    }
    boolean isFull(){
        return size == arr.length;
    }
    public static void main(String[] args) {
        
    }
}
