public class LeftMostNonRepeating {
    static char getElement(String str){
        int []count = new int[256];

        char res = '-';
        for(int i = str.length() - 1 ; i >= 0 ; i--){
            char x = str.charAt(i);
            if(count[x] == 0){
                res = x;
                count[x]++;
            }
        }

        return (res == '-' || count[res] == 0) ? '-': res;
    }
    public static void main(String args[]){
        System.out.println(getElement("geeksfgeeks"));
    }
}
