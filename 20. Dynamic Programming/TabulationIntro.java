public class TabulationIntro {
    static int fib(int n){
        int tab [] = new int[n+1];
        tab[0] = 0; 
        tab[1] = 1;
        for(int i = 2 ; i <= n ; i++){
            tab[i] = tab[i-1] + tab[i-2];
        }
        return tab[n];
    }
    public static void main(String ...raj){
        System.out.println(fib(6));
    }
}
