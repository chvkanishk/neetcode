
import java.util.Stack;

public class DailyTemperatures {

    public int[] solution(int[] temp){
        int[] r = new int[temp.length];
        Stack<Integer> s = new Stack<>();

        for(int i=0;i<temp.length;i++){
            while(!s.isEmpty() && temp[s.peek()]<temp[i]){
                r[s.peek()] = i-s.pop();
            }
            s.push(i);
        }
        return r;
    }

    public static void main(String[] args) {
        DailyTemperatures dt = new DailyTemperatures();
        
        // Test case 1: Standard example
        int[] test1 = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] expected1 = {1, 1, 4, 2, 1, 1, 0, 0};
        int[] result1 = dt.solution(test1);
        System.out.println("Test 1: " + (arrayEquals(result1, expected1) ? "PASS" : "FAIL"));
        printResult(test1, result1, expected1);
        
        // Test case 2: Decreasing array
        int[] test2 = {89, 62, 70, 78, 85};
        int[] expected2 = {0, 1, 1, 1, 0};
        int[] result2 = dt.solution(test2);
        System.out.println("Test 2: " + (arrayEquals(result2, expected2) ? "PASS" : "FAIL"));
        printResult(test2, result2, expected2);
        
        // Test case 3: All same temperatures
        int[] test3 = {1, 1, 1, 1};
        int[] expected3 = {0, 0, 0, 0};
        int[] result3 = dt.solution(test3);
        System.out.println("Test 3: " + (arrayEquals(result3, expected3) ? "PASS" : "FAIL"));
        printResult(test3, result3, expected3);
        
        // Test case 4: Single element
        int[] test4 = {5};
        int[] expected4 = {0};
        int[] result4 = dt.solution(test4);
        System.out.println("Test 4: " + (arrayEquals(result4, expected4) ? "PASS" : "FAIL"));
        printResult(test4, result4, expected4);
        
        // Test case 5: Increasing array
        int[] test5 = {1, 2, 3, 4, 5};
        int[] expected5 = {1, 1, 1, 1, 0};
        int[] result5 = dt.solution(test5);
        System.out.println("Test 5: " + (arrayEquals(result5, expected5) ? "PASS" : "FAIL"));
        printResult(test5, result5, expected5);
    }
    
    public static boolean arrayEquals(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
    
    public static void printResult(int[] input, int[] result, int[] expected) {
        System.out.print("  Input: ");
        printArray(input);
        System.out.print("  Output: ");
        printArray(result);
        System.out.print("  Expected: ");
        printArray(expected);
        System.out.println();
    }
    
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
