import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class validParanthesis {

    public boolean isvalid(String s){
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}','{');
        map.put(']','[');

        for(char c: s.toCharArray()){
            if (map.containsValue(c)){  
                stack.push(c);
            }
            else if (map.containsKey(c)) {
                if(stack.isEmpty() || map.get(c)!=stack.pop()){
                    return false;
                }
            }
        }
        return  stack.isEmpty();
    }

    public static void main(String[] args) {
        validParanthesis solution = new validParanthesis();
        
        // Test case 1: Valid parentheses
        String test1 = "()";
        System.out.println("Test 1: \"" + test1 + "\" -> " + solution.isvalid(test1));
        
        // Test case 2: Valid with multiple types
        String test2 = "(){[]}";
        System.out.println("Test 2: \"" + test2 + "\" -> " + solution.isvalid(test2));
        
        // Test case 3: Invalid - unmatched
        String test3 = "(]";
        System.out.println("Test 3: \"" + test3 + "\" -> " + solution.isvalid(test3));
        
        // Test case 4: Invalid - closing before opening
        String test4 = "([)]";
        System.out.println("Test 4: \"" + test4 + "\" -> " + solution.isvalid(test4));
        
        // Test case 5: Valid - nested
        String test5 = "([{}])";
        System.out.println("Test 5: \"" + test5 + "\" -> " + solution.isvalid(test5));
        
        // Test case 6: Empty string
        String test6 = "";
        System.out.println("Test 6: \"" + test6 + "\" -> " + solution.isvalid(test6));
    }
}
