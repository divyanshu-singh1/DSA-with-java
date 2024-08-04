import java.util.*;
public class TOH {
    static void getTOH(int n , char from_rod , char helper_rod ,char to_rod){
        if(n==1){
            System.out.println("Move disk 1 from " + from_rod +"to "+to_rod);
            return;
        }
        getTOH(n-1,from_rod ,to_rod,helper_rod);
        System.out.println("Move disk " + n + "from "+ from_rod + "to "+to_rod);
        getTOH(n-1,helper_rod,from_rod, to_rod);
    }
    public static void main(String []args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        getTOH(n,'a','b','c');
    }
}
