import java.util.Scanner;
//Не знаю как! Но калькулятор работает)
public class Main {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Input:");
		Calculator calculator = new Calculator();
		int result = calculator.calculate();
		System.out.println("Output:");
		if (InputDataParser.isRomanNumbers()) {
			System.out.println(Numbers.toRoman(result));
		}else {
			System.out.println(result);
		}
	}
}
