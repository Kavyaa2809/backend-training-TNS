package typecasting;

public class Typecastingexample {
	 public static void main(String[] args) {
	        int intNum = 100;
	        double doubleNum = intNum; // int to double
	        System.out.println("Widening Casting:");
	        System.out.println("Integer value: " + intNum);
	        System.out.println("Converted to double: " + doubleNum);

	        System.out.println();
	        double bigDouble = 99.99;
	        int smallInt = (int) bigDouble;
	        System.out.println("Narrowing Casting:");
	        System.out.println("Double value: " + bigDouble);
	        System.out.println("Converted to int: " + smallInt);

	        System.out.println();
	        char letter = 'A';
	        int ascii = letter; 
	        System.out.println("Char to int: " + letter + " -> " + ascii);

	        int num = 66;
	        char ch = (char) num; // int to char (narrowing)
	        System.out.println("Int to char: " + num + " -> " + ch);
	    }
	}


