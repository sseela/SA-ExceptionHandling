
public class MainClass {
	public static void main(String[] args) {
		method1();
	}
	
	private static int method1() {
		try {
			System.out.println("try");
			return 10;
		} catch(Exception e) {
			System.out.println("catch");
		} finally {
			System.out.println("finally");
		}
		return 10;
	}
}
