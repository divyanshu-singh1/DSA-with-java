public class KStacks {

    int arr[] , top[] , size[] ,cap;

    KStacks(int n , int k){
        cap = k;
        arr = new int[n*k];
        top = new int[k];
        size = new int[k];
        for(int i = 0 ; i< k ; i++){
            top[i] = i*k;
        }

    }

    void push(int sn , int x){
        if(size[sn] == cap){
            System.out.println("stack full");
            return;
        }


        arr[top[sn]++] = x;
        size[sn]++;
    }

    int pop(int sn){
        if(size[sn] == 0)
            return -1;

        size[sn]--;
        return arr[--top[sn]];
    }
    boolean isEmpty(int sn){
        return (size[sn] == 0);
    }

    void dis(){
        for(int x : top){
            System.out.println(x+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        KStacks s = new KStacks(3, 3);
        s.dis();
        s.push(0, 1);
        s.push(1, 2);
        s.push(2, 3);
        s.push(0, 4);
        s.push(1, 5);
        s.push(2, 6);
        s.push(0, 7);
        s.push(1, 8);
        s.push(2, 9);

        System.out.println(s.isEmpty(0));
        System.out.println(s.isEmpty(1));
        System.out.println(s.isEmpty(2));

        System.out.println(s.pop(0));
        System.out.println(s.pop(1));
        System.out.println(s.pop(2));
        System.out.println(s.pop(0));
        System.out.println(s.pop(1));
        System.out.println(s.pop(2));
        System.out.println(s.pop(0));
        System.out.println(s.pop(1));
        System.out.println(s.pop(2));

        System.out.println(s.isEmpty(0));
        System.out.println(s.isEmpty(1));
        System.out.println(s.isEmpty(2));

        

    }
}
