package datastructure.stacksAndQueuesPractice;

import java.util.StringTokenizer;

public class ComputeExpression {
	
	public static void main(String[] args) {
		ComputeExpression computing = new ComputeExpression();
		System.out.println(computing.compute("(((5 + 3) * 4) + (5 / 3))"));
	}
	
	/*
	 * Use two-stack algorithm to evaluate an expression. Assume that the input is in the right format
	 * @param a String expression of the form: (((5 + 3) * 4) + (5 / 3))
	 * @output a result of the expression.
	 */
	public int compute(String text) {
		FixedAutoResizeStack<Integer> stackNum = new FixedAutoResizeStack<>();
		FixedAutoResizeStack<String> stackOper = new FixedAutoResizeStack<>();
		
		for (String character: text.split("")) {
			if (isInteger(character)) stackNum.push(Integer.parseInt(character));
			else if (isOperator(character)) stackOper.push(character);
			else if (character.equals(")")) {
				int numOne = stackNum.pop();
				int numTwo = stackNum.pop();
				String operator = stackOper.pop();
				switch (operator) {
				case "+":
					stackNum.push(numOne + numTwo);
					break;
				case "-":
					stackNum.push(numOne - numTwo);
					break;
				case "/":
					stackNum.push(numOne / numTwo);
					break;
				case "*":
					stackNum.push(numOne * numTwo);
					break;
				}
			}
		}
		return stackNum.pop();
	}

	private boolean isOperator(String character) {
		switch (character) {
		case "+":
		case "-":
		case "/":
		case "*":
			return true;
		}
		return false;
	}

	private boolean isInteger(String character) {
		try {
			Integer.parseInt(character);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
}
