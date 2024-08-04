import java.util.HashMap;

public class MemoizationIntro {
    static HashMap<Integer,Integer> map;
    static int getFibo(int n){
        if(map.containsKey(n))
            return map.get(n);
        else{
            int ans =  getFibo(n-1)+getFibo(n-2);
            map.put(n,ans);
            return ans;
        }
    }
    public static void main(String args[]){
        map = new HashMap<>();
        map.put(0,0 );
        map.put(1,1 );
        System.out.println(getFibo(5));
        System.out.println(getFibo(6));
        System.out.println(getFibo(7));
    }
}
