

public class Fibo {
    static int  getNFibo(int n){

        if(n <= 2)
            return 1;
        return getNFibo(n-1) + getNFibo(n-2);
        
    }
    public static void main(String[] args) {
        System.out.println(getNFibo(7));
    }
}
