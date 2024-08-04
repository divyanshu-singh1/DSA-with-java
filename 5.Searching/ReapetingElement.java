/*
 * given array containing values from 0 to n -2 where all elements will occur only ones except one
 * element , you have to find that element  we are goint to use concept of slow and fast pointer
 */
public class ReapetingElement {
    static int findRepeating(int arr[]){
        int slow = arr[0]+1 , fast = arr[0]+1;
        do{
            slow arr[slow] +1;
            fast = arr[arr[fast] +1]+1; 
        }while(slow != fast)

        slow = arr[0]+1;
        while(slow != fast){
            fast  = arr[fast]+1;
            slow = arr[slow]+1;
        }
    }
    public static void main(String[] args) {
        
    }    
}
