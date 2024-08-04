import java.util.ArrayList;

public class LCS {
    /*
     * 
     THIS IS THE SOLUTION I WROTE, BRUTE FORCE

    static void getSubsequence(String s,String curr,int i,ArrayList<String> res){
        if(i >= s.length()){
            res.add(curr);
            return;
        }

        getSubsequence(s, curr, i+1, res);
        curr = curr + s.charAt(i);
        getSubsequence(s, curr, i+1, res);
    }
    static int getLCS(String s1, String s2){

        ArrayList<String> firstLCS = new ArrayList<>();
        getSubsequence(s1, "", 0, firstLCS);
        ArrayList<String> secondLCS = new ArrayList<>();
        getSubsequence(s2, "", 0, secondLCS);

        int maxLength = 0;
        String result = "";
        for(String s : firstLCS){
            if(secondLCS.contains(s)){
                if(s.length() > maxLength){
                    maxLength = s.length();
                    result = s;
                }
            }
        }
        System.out.println(result);
        return maxLength;
    }
    */

    //GFG LCS SOLUTION WITHOUT DP
    // static int getLCS(String s1, String s2, int n1, int n2){
    //     if(n1 == 0 || n2 ==0 ) 
    //         return 0;
    //     if(s1.charAt(n1-1) == s2.charAt(n2-1)){
    //         return 1+ getLCS(s1, s2, n1-1, n2-1);
    //     }else{
    //         return Math.max((getLCS(s1, s2, n1-1, n2)),getLCS(s1, s2, n1, n2-1));
    //     }

    // }

    static int getLCS(String s1, String s2, int n1, int n2, int[][]arr){
        if(arr[n1][n2] == -1){
            if(n1 == 0 || n2 ==0 ) 
                arr[n1][n2] = 0;
            else if(s1.charAt(n1-1) == s2.charAt(n2-1)){
                arr[n1][n2] =  1+ getLCS(s1, s2, n1-1, n2-1,arr);
            }else{
                arr[n1][n2]=  Math.max((getLCS(s1, s2, n1-1, n2,arr)),getLCS(s1, s2, n1, n2-1,arr));
            }
        }
        return arr[n1][n2];
    }
    public static void main(String[]args){  
        // ArrayList<String> result = new ArrayList<>() ;

        String s1 = "AXYZ";
        String s2 = "BAZ";
    
        //createing and filling the memo array with -1;
        int arr[][] = new int[s1.length()+1][s2.length()+1];
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                arr[i][j] = -1;
            }
        }


        System.out.println(getLCS(s1, s2,s1.length(),s2.length(),arr));
    }
}
