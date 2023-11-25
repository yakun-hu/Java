package in_class;

import java.util.Stack;

public class Reversed_polish {
	
	public static int Polish (String[] tokens) {
        Stack<Integer> abacus = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int operand1 = abacus.pop();
                int operand2 = abacus.pop();

                if (token.equals("+")) {
                    abacus.push(operand2 + operand1);
                } else if (token.equals("-")) {
                    abacus.push(operand2 - operand1);
                } else if (token.equals("*")) {
                    abacus.push(operand2 * operand1);
                } else {
                    abacus.push(operand2 / operand1);
                }
            } else {
                abacus.push(Integer.parseInt(token));
            }
        }

        return abacus.pop();
    }
}

	public static void main(String[] args) {
		String[] test_1 = {"2","1","+","3","*"};
		System.out.println(Polish(test_1)); 
		String[] test_2 = {"4","13","5","/","+"};
		System.out.println(Polish(test_2)); 
		String[] test_3 = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
		System.out.println(Polish(test_3)); 

	}

}

/* Create a Stack<Integer> to store operands.
Iterate through each token in the input array.
For each token:
a. If the token is not an operator (+, -, *, /), convert it to an integer and push it onto the stack.
b. If the token is an operator:
- Pop the top two elements from the stack (considering them as operands).
- Perform the corresponding operation based on the operator.
- Push the result back onto the stack.
After processing all tokens, the final result should be at the top of the stack.
Pop and return the result. */