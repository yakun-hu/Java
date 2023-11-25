package in_class;

import java.util.Stack;

public class Valid_Paren_Test { // my solution
	
	public static boolean is_Valid(String input) {
		char[] input_char = input.toCharArray();
		Stack<Character> stack = new Stack<>();
		for (int i=0; i<input.length(); i++) {
			if (input_char[i]=='(' || input_char[i]=='[' || input_char[i]=='{') {
				stack.push(input_char[i]);
			} else if (!stack.empty() && input_char[i]==')'){
				if (stack.peek() == '(') {
					stack.pop();
				} else {
					return false;
				}
			} else if (!stack.empty() && input_char[i]==']'){
				if (stack.peek() == '[') {
					stack.pop();
				} else {
					return false;
				}
			} else if (!stack.empty() && input_char[i]=='}'){
				if (stack.peek() == '{') {
					stack.pop();
				} else {
					return false;
				}
			} else {
				return false;
			}
		} if (stack.isEmpty()) {
			return true;
		}
		System.out.println(stack);
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(is_Valid("{}"));
		System.out.println(is_Valid("[{}]"));
		System.out.println(is_Valid("({})"));
		System.out.println(is_Valid("({)})"));
		System.out.println(is_Valid("}{"));
		System.out.println(is_Valid("["));
	}

}
