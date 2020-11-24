import java.util.Scanner;

public class IllegalArgumentExceptionEx {
	public static void main(String[] args) {
		method1(null);
	}
	public static void method1(String str) {
		System.out.println(str);
	}
}


class takingInputs {
	public static void main(String[] args) {
		System.out.println("enter number:");
		Scanner sc = new Scanner(System.in);
		String i1 = sc.nextLine();
		System.out.println("num "+i1);
	}
}
