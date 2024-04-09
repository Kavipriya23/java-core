package com.learning.core.day5session1;
import java.util.Stack;
public class D05P0903 { 	    
	    // Method to evaluate infix expression
	    public static int evaluateExpression(String expression) {
	        Stack<Integer> operands = new Stack<>();
	        Stack<Character> operators = new Stack<>();
	        
	        for (int i = 0; i < expression.length(); i++) {
	            char ch = expression.charAt(i);
	            
	            // Skip whitespace characters
	            if (ch == ' ')
	                continue;
	            
	            // If the character is a digit, parse the entire number
	            if (Character.isDigit(ch)) {
	                int num = 0;
	                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
	                    num = num * 10 + (expression.charAt(i) - '0');
	                    i++;
	                }
	                i--;
	                operands.push(num);
	            }
	            
	            // If the character is an opening parenthesis, push onto operators stack
	            else if (ch == '(')
	                operators.push(ch);
	            
	            // If the character is a closing parenthesis, solve the expression within the parentheses
	            else if (ch == ')') {
	                while (operators.peek() != '(')
	                    operands.push(applyOperation(operators.pop(), operands.pop(), operands.pop()));
	                operators.pop(); // pop '('
	            }
	            
	            // If the character is an operator
	            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
	                while (!operators.isEmpty() && precedence(ch) <= precedence(operators.peek()))
	                    operands.push(applyOperation(operators.pop(), operands.pop(), operands.pop()));
	                operators.push(ch);
	            }
	        }
	        
	        // Perform remaining operations
	        while (!operators.isEmpty())
	            operands.push(applyOperation(operators.pop(), operands.pop(), operands.pop()));
	        
	        // Top of 'operands' stack will contain the final result
	        return operands.pop();
	    }
	    
	    // Method to apply operator to operands
	    private static int applyOperation(char operator, int b, int a) {
	        switch (operator) {
	            case '+':
	                return a + b;
	            case '-':
	                return a - b;
	            case '*':
	                return a * b;
	            case '/':
	                if (b == 0) throw new ArithmeticException("Division by zero!");
	                return a / b;
	        }
	        return 0;
	    }
	    
	    // Method to get precedence of operators
	    private static int precedence(char operator) {
	        switch (operator) {
	            case '+':
	            case '-':
	                return 1;
	            case '*':
	            case '/':
	                return 2;
	        }
	        return -1;
	    }
	    
	    public static void main(String[] args) {
	        String expression = "10 + 2 * 6";
	        int result = evaluateExpression(expression);
	        System.out.println("Output: " + result);
	    }
	}