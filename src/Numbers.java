import java.util.TreeMap;

public class Numbers {
    private final static TreeMap<Integer, String> roman = new TreeMap<Integer, String>();
    private final static TreeMap<String, Integer> arabic = new TreeMap<String, Integer>();
    
    static {
    	roman.put(0, "-1");
    	roman.put(1, "I");
    	roman.put(2, "II");
    	roman.put(3, "III");
    	roman.put(4, "IV");
    	roman.put(5, "V");
    	roman.put(6, "VI");
    	roman.put(7, "VII");
    	roman.put(8, "VIII");
    	roman.put(9, "IX");
    	roman.put(10, "X");
    	roman.put(11, "XI");
    	roman.put(12, "XII");
    	roman.put(13, "XIII");
    	roman.put(14, "XIV");
    	roman.put(15, "XV");
    	roman.put(16, "XVI");
    	roman.put(17, "XVII");
    	roman.put(18, "XVIII");
    	roman.put(19, "XIX");
    	roman.put(20, "XX");
    	roman.put(21, "XXI");
    	roman.put(22, "XXII");
    	roman.put(23, "XXIII");
    	roman.put(24, "XXIV");
    	roman.put(25, "XXV");
    	roman.put(26, "XXVI");
    	roman.put(27, "XXVII");
    	roman.put(28, "XXVIII");
    	roman.put(29, "XXIX");
    	roman.put(30, "XXX");
    	roman.put(31, "XXXI");
    	roman.put(32, "XXXII");
    	roman.put(33, "XXXIII");
    	roman.put(34, "XXXIV");
    	roman.put(35, "XXXV");
    	roman.put(36, "XXXVI");
    	roman.put(37, "XXXVII");
    	roman.put(38, "XXXVIII");
    	roman.put(39, "XXXIX");
    	roman.put(40, "XL");
    	roman.put(41, "XLI");
    	roman.put(42, "XLII");
    	roman.put(43, "XLIII");
    	roman.put(44, "XLIV");
    	roman.put(45, "XLV");
    	roman.put(46, "XLVI");
    	roman.put(47, "XLVII");
    	roman.put(48, "XLVIII");
    	roman.put(49, "XLIX");
    	roman.put(50, "L");
    	roman.put(51, "LI");
    	roman.put(52, "LII");
    	roman.put(53, "LIII");
    	roman.put(54, "LIV");
    	roman.put(55, "LV");
    	roman.put(56, "LVI");
    	roman.put(57, "LVII");
    	roman.put(58, "LVIII");
    	roman.put(59, "LVIX");
    	roman.put(60, "LX");
    	roman.put(61, "LXI");
    	roman.put(62, "LXII");
    	roman.put(63, "LXIII");
    	roman.put(64, "LXIV");
    	roman.put(65, "LXV");
    	roman.put(66, "LXVI");
    	roman.put(67, "LXVII");
    	roman.put(68, "LXVIII");
    	roman.put(69, "LXIX");
    	roman.put(70, "LXX");
    	roman.put(71, "LXXI");
    	roman.put(72, "LXXII");
    	roman.put(73, "LXXIII");
    	roman.put(74, "LXXIV");
    	roman.put(75, "LXXV");
    	roman.put(76, "LXXVI");
    	roman.put(77, "LXXVII");
    	roman.put(78, "LXXVIII");
    	roman.put(79, "LXXIX");
    	roman.put(80, "LXXX");
    	roman.put(81, "LXXXI");
    	roman.put(82, "LXXXII");
    	roman.put(83, "LXXXIII");
    	roman.put(84, "LXXXIV");
    	roman.put(85, "LXXXV");
    	roman.put(86, "LXXXVI");
    	roman.put(87, "LXXXVII");
    	roman.put(88, "LXXXVIII");
    	roman.put(89, "LXXXIX");
    	roman.put(90, "XC");
    	roman.put(91, "XCI");
    	roman.put(92, "XCII");
    	roman.put(93, "XCIII");
    	roman.put(94, "XCIV");
    	roman.put(95, "XCV");
    	roman.put(96, "XCVI");
    	roman.put(97, "XCVII");
    	roman.put(98, "XCVIII");
    	roman.put(99, "XCIX");
    	roman.put(100, "C");
    }
    static {
    	arabic.put("I", 1);
    	arabic.put("II", 2);
    	arabic.put("III", 3);
    	arabic.put("IV", 4);
    	arabic.put("V", 5);
    	arabic.put("VI", 6);
    	arabic.put("VII", 7);
    	arabic.put("VIII", 8);
    	arabic.put("IX", 9);
    	arabic.put("X", 10);
    	arabic.put("XI", 11);
    	arabic.put("XII", 12);
    	arabic.put("XIII", 13);
    	arabic.put("XIV", 14);
    	arabic.put("XV", 15);
    	arabic.put("XVI", 16);
    	arabic.put("XVII", 17);
    	arabic.put("XVIII", 18);
    	arabic.put("XIX", 19);
    	arabic.put("XX", 20);
    	arabic.put("XXI", 21);
    	arabic.put("XXII", 22);
    	arabic.put("XXIII", 23);
    	arabic.put("XXIV", 24);
    	arabic.put("XXV", 25);
    	arabic.put("XXVI", 26);
    	arabic.put("XXVII", 27);
    	arabic.put("XXVIII", 28);
    	arabic.put("XXIX", 29);
    	arabic.put("XXX", 30);
    	arabic.put("XXXI", 31);
    	arabic.put("XXXII", 32);
    	arabic.put("XXXIII", 33);
    	arabic.put("XXXIV", 34);
    	arabic.put("XXXV", 35);
    	arabic.put("XXXVI", 36);
    	arabic.put("XXXVII", 37);
    	arabic.put("XXXVIII", 38);
    	arabic.put("XXXIX", 39);
    	arabic.put("XL", 40);
    	arabic.put("XLI", 41);
    	arabic.put("XLII", 42);
    	arabic.put("XLIII", 43);
    	arabic.put("XLIV", 44);
    	arabic.put("XLV", 45);
    	arabic.put("XLVI", 46);
    	arabic.put("XLVII", 47);
    	arabic.put("XLVIII", 48);
    	arabic.put("XLIX", 49);
    	arabic.put("L", 50);
    	arabic.put("LI", 51);
    	arabic.put("LII", 52);
    	arabic.put("LIII", 53);
    	arabic.put("LIV", 54);
    	arabic.put("LV", 55);
    	arabic.put("LVI", 56);
    	arabic.put("LVII", 57);
    	arabic.put("LVIII", 58);
    	arabic.put("LVIX", 59);
    	arabic.put("LX", 60);
    	arabic.put("LXI", 61);
    	arabic.put("LXII", 62);
    	arabic.put("LXIII", 63);
    	arabic.put("LXIV", 64);
    	arabic.put("LXV", 65);
    	arabic.put("LXVI", 66);
    	arabic.put("LXVII", 67);
    	arabic.put("LXVIII", 68);
    	arabic.put("LXIX", 69);
    	arabic.put("LXX", 70);
    	arabic.put("LXXI", 71);
    	arabic.put("LXXII", 72);
    	arabic.put("LXXIII", 73);
    	arabic.put("LXXIV", 74);
    	arabic.put("LXXV", 75);
    	arabic.put("LXXVI", 76);
    	arabic.put("LXXVII", 77);
    	arabic.put("LXXVIII", 78);
    	arabic.put("LXXIX", 79);
    	arabic.put("LXXX", 80);
    	arabic.put("LXXXI", 81);
    	arabic.put("LXXXII", 82);
    	arabic.put("LXXXIII", 83);
    	arabic.put("LXXXIV", 84);
    	arabic.put("LXXXV", 85);
    	arabic.put("LXXXVI", 86);
    	arabic.put("LXXXVII", 87);
    	arabic.put("LXXXVIII", 88);
    	arabic.put("LXXXIX", 89);
    	arabic.put("XC", 90);
    	arabic.put("XCI", 91);
    	arabic.put("XCII", 92);
    	arabic.put("XCIII", 93);
    	arabic.put("XCIV", 94);
    	arabic.put("XCV", 95);
    	arabic.put("XCVI", 96);
    	arabic.put("XCVII", 97);
    	arabic.put("XCVIII", 98);
    	arabic.put("XCIX", 99);
    	arabic.put("C", 100);
    }
   
    public final static String toRoman(int number) {
        int value =  roman.floorKey(number);
        if ( number == value ) {
            return roman.get(number);
            }
        return "-1";
        }

	public final static int toArabic(String number) {
		String value =  arabic.floorKey(number);
		if ( number.equals(value) ) {
			return arabic.get(number);
        	}
		return -1;
    	}
	public final static boolean isRoman(String number) {
		if (arabic.floorKey(number).equals(number)) {
			return true;
			}
		return false;
		}
	public final static boolean isArabic(int number) {
		if (roman.floorKey(number).equals(number)) {
			return true;
			}
		return false;
		}
}

