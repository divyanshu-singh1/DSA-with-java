public class NaivePattern {
    static void patSearch(String txt , String pat){
        int n = txt.length();
        int m = pat.length();
        for(int i = 0 ; i <= n-m ; i++){
            int j;
            for(j = 0; j < m ;j++)
                if(pat.charAt(j) != txt.charAt(i+j))
                    break;
            if(j == m)
                System.out.println(i+" ");
        }
    }

    /*
     * this is improved naive algo for pattern with distinct elements
     */
    static void patDistinct(String txt , String pat){
        int n = txt.length();
        int m = pat.length();
        for(int i = 0 ; i <= n-m ;){
            int j;
            for(j = 0; j < m ;j++)
                if(pat.charAt(j) != txt.charAt(i+j))
                    break;


            if(j == m)
                System.out.println(i+" ");
            if(j == 0)
                i++;
            else    
                i = (i+j);
        } 
    }
    public static void main(String[] args) {
        
    }
    
}
