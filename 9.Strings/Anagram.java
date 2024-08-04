import java.util.Arrays;

class Anagram {
    /*
     * naive approach , we sort both string and then compare
     * time O(nlogn)
     */
    static boolean isAna(String s1, String s2){
        if(s1.length() != s2.length())
            return false;
        

        char a1[] = s1.toCharArray();
        Arrays.sort(a1);
        s1 = new String(a1);

        char a2[] = s2.toCharArray();
        Arrays.sort(a2);
        s2 = new String(a2);

        return s1.equals(s2);

    }
    /*
     * myapproach not most efficient
     */
    static boolean isAnagram(String s1 ,String s2){
        int temp1[] = new int[26];
        int temp2[] = new int[26];

        for(int i = 0 ; i < s1.length() ;i++){
            temp1[s1.charAt(i) - 'a']++;
        }
        for(int i = 0 ; i < s2.length() ;i++){
            temp2[s2.charAt(i) - 'a']++;
        }

        for(int i = 0 ; i< 26 ; i++){
            if(temp1[i] != temp2[i])
                return false;
        }
        return true;
    }

    /*
     * efficinet approach  o(n)
     * idea is to use just one array and for each character in first string increments 
     * its respective index and for string two decrement it 
     * if in the end all the element in array are 0 then true else false;
     */
    static boolean isAnaEfficient(String s1 , String s2){
        if(s1.length() != s2.length())
            return false;
        
        int count[] = new int[256];

        for(int i = 0 ; i < s2.length() ; i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }

        for(int x : count){
            if(x != 0)
                return false;
        }
        return  true;
    }
    public static void main (String[] args) {
        
        // System.out.println(isAnagram("aaacb","cabaa"));
        System.out.println(isAnaEfficient("aaacb","fabaa"));
    }
}