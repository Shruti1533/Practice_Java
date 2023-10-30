public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char b = s.charAt(i);
            if (b == '{' || b == '[' || b == '(') {
                stack.push(b);
            } else {
                if (stack.isEmpty()) {
                    return false; // There is no corresponding opening bracket.
                }
                char c = stack.pop();
                if (b == '}' && c != '{' || b == ')' && c != '(' || b == ']' && c != '[') {
                    return false; // Mismatched brackets.
                }
            }
        }
        return stack.isEmpty(); // Return true if the stack is empty (all brackets are matched).
    }
}



/*public class Solution{
public boolean isValid(String s) {
    
	Stack<Character> stack = new Stack<Character>();
	for(int i=0;i<s.length();i++){
        char b=s.charAt(i);
            if(b=='{'){
                stack.push(b);
           }
           else if(b=='['){
               stack.push(b);
           }
           else if(b=='('){
               stack.push(b);
           }
           else{
               if (stack.isEmpty()) {
                    return false; // There is no corresponding opening bracket.
                }
        char c=stack.pop();
        if(b=='}' && c=='{' || (b==')' && c=='(') || (b==']' && c=='['))
            {   
                return false;
            }
        }
    }
        return stack.isEmpty();
    }
}
*/