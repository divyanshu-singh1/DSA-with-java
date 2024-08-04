import java.util.*;
public class Implementation{
    static class Node{
        int data;
        Node next;
        Node(int x){
            data = x;
            next = null;
        }

        void display(){
            Node curr = this;
            while(curr != null){
                System.out.println(curr.data);
                curr = curr.next;
            }
        }
        void displayRecursive(){
            if(this == null)return;
            System.out.println(this.data);
            if(this.next != null)
            this.next.displayRecursive();
            
        }
    }
    
    static public void main(String args[]){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.displayRecursive();
        

    }
}