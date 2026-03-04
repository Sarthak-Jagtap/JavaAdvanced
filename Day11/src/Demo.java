import java.util.*;

class Solution {
	
	public static boolean isBracketPair(char c1, char c2) {
		if(c1 == '{' && c2 == '}')
			return true;
		if(c1 == '[' && c2 == ']')
			return true;
		if(c1 == '(' && c2 == ')')
			return true;
		return false;
	}
	
    public static boolean isBalanced(String s) {
        // code here
        Stack<Character> stack = new Stack<Character>();
        
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }else{
                if(!stack.empty() && isBracketPair(stack.peek(),s.charAt(i))){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        
        return stack.empty();
    }
}

public class Demo {

	public static void main(String[] args) {
		
		System.out.println(Solution.isBalanced("{[()]}"));
	}
}
