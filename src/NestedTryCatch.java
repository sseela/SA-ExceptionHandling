
public class NestedTryCatch {

	public static void main(String[] args) {
		try {
			System.out.println(2/0);
			try {
				System.out.println(3/0);
			} catch(Exception e) {
				System.out.println("nested block");
			} finally {
				System.out.println("finally");
			}
			
		} catch(Exception e) {
			System.out.println("exception caught");
		}
	}
}


class NestedTryCatch2 {

	public static void main(String[] args) {
		try {
			System.out.println(2/0);
			
		} catch(Exception e) {
			System.out.println("exception caught");
			try {
				System.out.println(3/0);
			} catch(Exception e1) {
				System.out.println("nested block");
			} finally {
				System.out.println("finally");
			}
		}
	}
}


class NestedTryCatch3 {

	public static void main(String[] args) {
		try {
			System.out.println(2/0);
			
		} catch(Exception e) {
			System.out.println("exception caught");
		} finally {
			try {
				System.out.println(3/0);
			} catch(Exception e1) {
				System.out.println("nested block");
			} finally {
				System.out.println("finally");
			}
		}
	}
}
