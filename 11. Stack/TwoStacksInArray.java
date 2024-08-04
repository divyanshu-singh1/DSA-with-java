public class TwoStacksInArray {
    int i , j , cap ;
    int arr[];
    TwoStacksInArray(int cap){
        this.cap = cap;
        arr = new int[cap];
        j = cap-1;
    }

    boolean push1(int x){
        if(i > j){
            return false;
        }
        arr[i] = x;
        i++;
        return true;
    }
    boolean push2(int x){
        if(i > j)
            return false;
        
        arr[j] = x ;
        j--;
        return true;
    }

    int pop1(){
        if(i == 0)
        return -1;
        int res = arr[i-1];
        i--;
        return res;
    }
    int pop2(){
        if(j == cap-1)
            return -1;

        int res = arr[j+1];
        j++;
        return res;
    }

    int peek1(){
        if(i == 0)
            return -1;
        return arr[i-1];
    }
    int peek2(){
        if(j == cap-1)
            return -1;

        return arr[j+1];

    }
    int size1(){
        return i;
    }
    int size2(){
        return cap - j -1;
    }

    public static void main(String[] args) {
        TwoStacksInArray s = new TwoStacksInArray(6);
        s.push1(10);
        s.push1(20);

        s.push2(60);
        s.push2(50);

        System.out.println(s.size1());
        System.out.println(s.size2());

        System.out.println(s.peek1());
        System.out.println(s.peek2());
        System.out.println(s.size1());
        System.out.println(s.size2());


        System.out.println("Partially done");


        System.out.println(s.push1(30));
        System.out.println(s.push2(40));
        System.out.println(s.push1(50));
        System.out.println(s.push2(50));


        System.out.println(s.size1());
        System.out.println(s.size2());





        System.out.println(s.pop1());
        System.out.println(s.pop2());
        System.out.println(s.pop1());
        System.out.println(s.pop2());
        System.out.println(s.pop1());
        System.out.println(s.pop2());
        System.out.println(s.pop1());
        System.out.println(s.pop2());
        

    }
}
