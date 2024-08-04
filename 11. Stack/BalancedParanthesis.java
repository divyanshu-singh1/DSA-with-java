import java.util.ArrayDeque;

public class BalancedParanthesis {
    static boolean isBalanced(String str){
        if(str.length() == 0)return true;
        ArrayDeque<Character> s  = new ArrayDeque<>();
        // s.push(str.charAt(0));
        int i = 0;
        for(; i < str.length() ; i++){
            char c = str.charAt(i);
            if(c == '{' || c == '[' || c == '('){
                s.push(c);
            }else{
                if(s.isEmpty()){
                    return false;
                }else if((s.peek() == '(' && c == ')') || (s.peek() == '[' && c == ']') || (s.peek() == '{' && c == '}') ){
                    s.pop();
                }else{
                    return false;
                }
            }
        }

        return s.isEmpty();
        
    }
    public static void main(String[] args) {
        System.out.println(isBalanced("(()))"));
    }
}
