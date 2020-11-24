
public class ExceptionOrder {
	public static void main(String[] args) {
		System.out.println("sande");
		try {
			System.out.println(2/0);
			
		} catch(ArithmeticException e) {
			System.out.println("arithmetic");
		} catch(Exception e) {			//Exception order should be from child to parent. And it should not be from parent to child, in which case, we will get an error saying Exception is already caught.
			System.out.println("exception");
		}
	}
}
