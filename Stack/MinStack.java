
import java.util.Stack;

public class MinStack {
    public static void main(String[] args) {
        Solution minStack = new Solution();

        minStack.push(3);
        minStack.push(5);
        minStack.push(2);
        minStack.push(1);

        System.out.println(minStack.getMin()); // expected 1
        minStack.pop();
        System.out.println(minStack.getMin()); // expected 2
        System.out.println(minStack.top());    // expected 2

        minStack.pop();
        System.out.println(minStack.getMin()); // expected 3
    }
}

class Solution {
    // store all pushed values
    private Stack<Integer> values;
    // store the minimum value at each stack depth
    private Stack<Integer> mins;

    public Solution() {
        // initialize both stacks
        values = new Stack<>();
        mins = new Stack<>();
    }

    public void push(int x) {
        values.push(x);
        if(mins.isEmpty()){
            mins.push(x);
        }else{
            mins.push(Math.min(x, mins.peek()));
        }
        // 1. push x into values
        // 2. if mins is empty, push x into mins
        // 3. otherwise push min(x, mins.peek()) into mins
    }

    public void pop() {

        values.pop();
        mins.pop();
        // 1. pop from values
        // 2. pop from mins
    }

    public int top() {
        // return values.peek()
        return values.peek();
    }

    public int getMin() {
        // return mins.peek()
        return mins.peek();
    }
}
