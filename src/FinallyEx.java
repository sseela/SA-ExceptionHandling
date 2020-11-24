
public class FinallyEx {
	public static int getNumber() {
		try {
			System.out.println("try");
			return 10;
		} catch(Exception e) {
			return 90;
		} finally {
			System.out.println("finally");			//Even if try or catch has return statement, finally block will be compulsory executed if it is present,
						// hence return from finally block will win here.
		}
	}
	
	public static void main(String[] args) {
		int i = getNumber();
		System.out.println(i);
	}
}


class FinallyReturn {
	public static void main(String[] args) {
		int x= method();
		System.out.println(x);
	}
	
	public static int method() {
		int i=10;
		try {
			System.out.println("statement1");
			System.out.println("statement2");
			return i;
		} catch(Exception e) {
			
		} finally {
			System.out.println("statement3");
			return i+80;
		}
	}
}
