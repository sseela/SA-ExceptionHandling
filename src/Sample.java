
public class Sample {
	
	private static String str=null;
	public static void main(String[] args) {
		try {
		System.out.println(2/0);		// If we don't handle this exception, then there will be abnormal termination of the program and last line will not be executed.
		System.out.println("first");
		System.out.println("second");
		System.out.println("third");
		} catch(ArithmeticException e) {
			System.out.println("exception raised"); // As we handled this exception, therefore program will not be terminated abnormally, hence the last line will be executed.
		}
		System.out.println("after that");
		System.out.println("after that");
		System.out.println("after that");
	}
}

class sample2 {
	public static void main(String[] args) {
		doStuff();
	}
	public static void doStuff() {
		doMoreStuff();										//In stack, these methods will be kept in the order of main, doStuff, doMoreStuff. So doMoreStuff will be executed first and then in order.
	}
	public static void doMoreStuff() {
		System.out.println(2/0);
	}
}
