
public class MethodsInThrowable {
	public static void main(String[] args) {
		try {
		System.out.println(2/0);
		} catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
	}
}
