public class LexicographicalOrder {
    static int getFact(int n){
        int fact = 1;
        for(int i = 1 ; i <= n; i++){
            fact *= i;
        }
        return fact;
    }

    static int getRank(String str){
        int n = str.length();
        int res = 0;
        for(int i = 0 ; i< nf;i++){
            char c = str.charAt(i);
            int tempCount = 0;
            for(int j = i+1; j < n;j++){
                if(str.charAt(j) <  c)tempCount++;
            }
            System.out.println("At i = "+i+" tempCount and n-i-1 are " +tempCount + "  "+(n-i-1));
            res += (tempCount * getFact(n-i-1));
            System.out.println("and the res is " +res);
        }
        return res+1;
    }
    public static void main(String[] args) {
        System.out.println(getRank("STRING"));
        // System.out.println(getFact(6));
    }
}
