import java.util.Scanner;

public class InputDataParser {
	static Scanner scanner = new Scanner(System.in);
	int a;
	int b;
	
	static boolean isRoman = false;
	String string = scanner.nextLine();
	
	boolean isAddition() {
		String[] list = string.split("[+]");
		if (list.length == 2) {
			try {
				if (Numbers.isArabic(Integer.parseInt(list[0])) & Numbers.isArabic(Integer.parseInt(list[1]))){
					a = Integer.parseInt(list[0]);
					b = Integer.parseInt(list[1]);
					return true;
				}
			}catch (NumberFormatException error) {
				if (Numbers.isRoman(list[0]) & Numbers.isRoman(list[1])) {
					a = Numbers.toArabic(list[0]);
					b = Numbers.toArabic(list[1]);
					isRoman = true;
					return true;
				}
			}
		}
		return false;
		
	}
	
	boolean isSubtraction() {
		String[] list = string.split("[-]");
		if (list.length == 2) {
			try {
				if (Numbers.isArabic(Integer.parseInt(list[0])) & Numbers.isArabic(Integer.parseInt(list[1]))){
					a = Integer.parseInt(list[0]);
					b = Integer.parseInt(list[1]);
					return true;
				}
			}catch (NumberFormatException error) {
				if (Numbers.isRoman(list[0]) & Numbers.isRoman(list[1])) {
					a = Numbers.toArabic(list[0]);
					b = Numbers.toArabic(list[1]);
					isRoman = true;
					return true;
		
				}
			}
		}
		return false;
		
	}
	
	boolean isMultiplication() {
		String[] list = string.split("[*]");
		if (list.length == 2) {
			try {
				if (Numbers.isArabic(Integer.parseInt(list[0])) & Numbers.isArabic(Integer.parseInt(list[1]))){
					a = Integer.parseInt(list[0]);
					b = Integer.parseInt(list[1]);
					return true;
				}
			}catch (NumberFormatException error) {
				if (Numbers.isRoman(list[0]) & Numbers.isRoman(list[1])) {
					a = Numbers.toArabic(list[0]);
					b = Numbers.toArabic(list[1]);
					isRoman = true;
					return true;
				}
			}
		}
		return false;
	}
		
	boolean isDivision() {
		String[] list = string.split("[/]");
		if (list.length == 2) {
			try {
				if (Numbers.isArabic(Integer.parseInt(list[0])) & Numbers.isArabic(Integer.parseInt(list[1]))){
					a = Integer.parseInt(list[0]);
					b = Integer.parseInt(list[1]);
					return true;
				}
			}catch (NumberFormatException error) {
				if (Numbers.isRoman(list[0]) & Numbers.isRoman(list[1])) {
					a = Numbers.toArabic(list[0]);
					b = Numbers.toArabic(list[1]);
					isRoman = true;
					return true;
				}
			}
		}
		return false;
		
	}
	int getLeftOperand() {
		return a;
	}
	int getRightOperand() {
		return b;
	}
	
	static boolean isRomanNumbers() {
		return isRoman;
	}
}
