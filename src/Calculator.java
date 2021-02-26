public class Calculator {
	
	InputDataParser parser = new InputDataParser();
	int calculate() {
		if (parser.isAddition()) {
			int a = parser.getLeftOperand();
			int b = parser.getRightOperand();
			if (isRange(a, b)) {
				int result = a + b;
				return result;
			}
		}
		else if (parser.isSubtraction()) {
			int a = parser.getLeftOperand();
			int b = parser.getRightOperand();
			if (isRange(a, b)) {
				int result = a - b;
				return result;
			}
		}
		else if (parser.isMultiplication()) {
			int a = parser.getLeftOperand();
			int b = parser.getRightOperand();
			if (isRange(a, b)) {
				int result = a * b;
				return result;
			}
		}
		else if (parser.isDivision()) {
			int a = parser.getLeftOperand();
			int b = parser.getRightOperand();
			if (isRange(a, b)) {
				int result = a / b;
				return result;
			}
		}
		return -1;
	}
	boolean isRange(int a, int b) {
		if (a > 10 || b > 10) {
			try {
				throw new CalculatorException("Выход за пределы диапозона!");
			}catch (Exception e) {
				System.out.println(e.toString());
				System.exit(-1);
			}
		}
		return true;
		}
}
