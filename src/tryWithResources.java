import java.util.Scanner;

public class tryWithResources {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("please enter your name: ");
			String name = sc.nextLine();
			System.out.println("welcome "+name);
		}
	}
}


class tryWithResources2 {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("please enter your name: ");
			String name = sc.nextLine();
			System.out.println("welcome "+name);
		}
	}
}