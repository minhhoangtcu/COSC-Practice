package datastructure.stacksAndQueuesPractice;

public class ComputeExpression {
	
	public static void main(String[] args) {
		ComputeExpression computing = new ComputeExpression();
		String result = String.format("%.2f", computing.compute("(((5 + 3) * 4) + (5 / 3))"));
		System.out.println(result);
		
		result = String.format("%.2f", computing.compute("(1 + 1)"));
		System.out.println(result);
		
		result = String.format("%.2f", computing.compute("(2 * 5)"));
		System.out.println(result);
		
		result = String.format("%.2f", computing.compute("(7 / 3)"));
		System.out.println(result);
		
		result = String.format("%.2f", computing.compute("((((5 + 3) * 4) + (5 / 3)) + (1 + 3))"));
		System.out.println(result);
		
		result = String.format("%.2f", computing.compute("(((5 + (3 - 3)) * 4) + (5 / 3))"));
		System.out.println(result);
	}
	
	/*
	 * Use two-stack algorithm to evaluate an expression. Assume that the input is in the right format
	 * @param a String expression of the form: (((5 + 3) * 4) + (5 / 3))
	 * @output a result of the expression.
	 */
	public float compute(String text) {
		FixedAutoResizeStack<Float> stackNum = new FixedAutoResizeStack<>();
		FixedAutoResizeStack<String> stackOper = new FixedAutoResizeStack<>();
		
		for (String character: text.split("")) {
			if (isFloat(character)) stackNum.push(Float.parseFloat(character));
			else if (isOperator(character)) stackOper.push(character);
			else if (character.equals(")")) {
				float numOne = stackNum.pop();
				float numTwo = stackNum.pop();
				String operator = stackOper.pop();
				switch (operator) {
				case "+":
					stackNum.push(numTwo + numOne);
					break;
				case "-":
					stackNum.push(numTwo - numOne);
					break;
				case "/":
					stackNum.push(numTwo / numOne);
					break;
				case "*":
					stackNum.push(numOne * numTwo);
					break;
				}
				System.out.println(String.format("%.2f %s %.2f", numTwo, operator, numOne));
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

	private boolean isFloat(String character) {
		try {
			Float.parseFloat(character);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
}
