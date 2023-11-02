import java.util.Stack;

//You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.
//Evaluate the expression. Return an integer that represents the value of the expression.
//        Note that:
//        The valid operators are '+', '-', '*', and '/'.
//        Each operand may be an integer or another expression.
//        The division between two integers always truncates toward zero.
//        There will not be any division by zero.
//        The input represents a valid arithmetic expression in a reverse polish notation.
//        The answer and all the intermediate calculations can be represented in a 32-bit integer.
public class ReversePolishNotation {
    public static void main(String[] args) {
//        Example 1:
//        Input: tokens = ["2","1","+","3","*"]
//        Output: 9
//        Explanation: ((2 + 1) * 3) = 9
        String[] exampleOne = {"2","1","+","3","*"};
        int answer = evaluateRPN(exampleOne);
        System.out.println("answer for example One:"+answer);

//        Example 2:
//        Input: tokens = ["4","13","5","/","+"]
//        Output: 6
//        Explanation: (4 + (13 / 5)) = 6
//        Example 3:
        String[] exampleTwo = {"4","13","5","/","+"};
        int answerTwo = evaluateRPN(exampleTwo);
        System.out.println("answer for example two:"+answerTwo);

//        Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
//        Output: 22
//        Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
//        = ((10 * (6 / (12 * -11))) + 17) + 5
//        = ((10 * (6 / -132)) + 17) + 5
//        = ((10 * 0) + 17) + 5
//        = (0 + 17) + 5
//        = 17 + 5
//        = 22
        String[] exampleThree = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        int answerThree = evaluateRPN(exampleThree);
        System.out.println("answer for example Three:"+answerThree);
    }
    //Function to Evaluate Reverse Polish Notation
    //Time Complexity =O(N)
    //Space Complexity= O(N^2)
    public static int evaluateRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();
        for (String values : tokens) {
            if (values.equals("+")) {
                int n1 = stack.pop();
                int n2 = stack.pop();
                int res = n2 + n1;
                stack.push(res);
            } else if (values.equals("-")) {
                int n1 = stack.pop();
                int n2 = stack.pop();
                int res = n2 - n1;
                stack.push(res);
            } else if (values.equals("*")) {
                int n1 = stack.pop();
                int n2 = stack.pop();
                int res = n2 * n1;
                stack.push(res);
            } else if (values.equals("/")) {
                int n1 = stack.pop();
                int n2 = stack.pop();
                int res = n2 / n1;
                stack.push(res);
            } else {
                stack.push(Integer.parseInt(values));
            }
        }
        return stack.pop();
    }
}
