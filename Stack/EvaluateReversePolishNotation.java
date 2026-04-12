
import java.util.Stack;

public class EvaluateReversePolishNotation {

    public int value(String[] tokens){
        Stack<Integer> stack = new Stack<>();

        for(String c : tokens){
            if(c.equals("+")){
                stack.push(stack.pop() + stack.pop());
            }else if(c.equals("-")){
                int s= stack.pop();
                int f = stack.pop();
                stack.push(f-s);
            }else if (c.equals("*")) {
                stack.push(stack.pop()*stack.pop());
            }else if(c.equals("/")){
                int s= stack.pop();
                int f= stack.pop();
                stack.push(f/s);
            }
            else{
                stack.push(Integer.parseInt(c));
            }
        }
        return stack.peek();
    }
    public static void main(String[] args) {
        EvaluateReversePolishNotation solver = new EvaluateReversePolishNotation();

        String[] tokens1 = {"2", "1", "+", "3", "*"};
        System.out.println(solver.value(tokens1)); // expected 9

        String[] tokens2 = {"4", "13", "5", "/", "+"};
        System.out.println(solver.value(tokens2)); // expected 6

        String[] tokens3 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(solver.value(tokens3)); // expected 22
    }
    
}
