import java.util.Scanner;

public class StringSubset {
    
    static void getSubsets(String str , String curr,int i ){
        if(str.length() == i){
            System.out.println(curr);
            return;
        }

        getSubsets(str,curr,i+1);
        getSubsets(str,curr + str.charAt(i),i+1);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        getSubsets(str,"" ,0);
    }
}
