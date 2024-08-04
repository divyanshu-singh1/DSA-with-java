import javafx.scene.chart.BubbleChart;

public class Chaining {
    //chaining class was my implementation for hashin
    Node []table ;
    final int mod = 7;
    Chaining(int n){
        table = new Node[n];
    }

    void insert(int val){
        int index = val%mod;
        if(table[index] == null){
            table[index] = new Node(val);
        }else{
            Node curr = table[index];
            while(curr.next != null)
                curr = curr.next;
            curr.next = new Node(val);
        }
    }

    boolean search(int val){
        int index = val%mod;
        if(table[index] == null)
            return false;
        else if(table[index].data == val)
            return true;
        else{
            Node curr = table[index].next;
            while(curr != null){
                if(curr.data == val)
                    return true;
                curr = curr.next;
            }
        }
        return false;
    }

    //nested class below is gfg implementation 
    class MyHash{
        int BUCKET;
        ArrayList<LinkedList<Integer>> table;
        MyHash(int b){
            BUCKET = b;
            table = new ArrayList<LinkedList<Integer>>();
            for(int i = 0 ; i < b ; i++)
                table.add(new LinkedList<Integer>());
        }
        void insert(int key){
            int i = key % BUCKET;
            table.get(i).add(key);
        }
        void remove(int key){
            int i = key % BUCKET;
            /*
             * if we don't type cast to Integer below
             * this function will treat input as index
             * and will lead to IndexOutOfBound
             */
            table.get(i).remove((Integer(i)));

        }
        
        boolean search(int key){
            int i = key % BUCKET;
            return table.get(i).contains(key);
        }
    }
    public static void main(String[] args) {
        Chaining hash = new Chaining(7);

    }
}
