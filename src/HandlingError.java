

public class HandlingError {
	public static void main(String[] args) {
		//any vm error like stackoverflow error or OOM error can be handled 
		m1();
		
	}
	
	public static void m1() {
		try {
			m2();
		} catch(Throwable e) {
			System.out.println("fuckkkkkkkkkkkkkkkkk");
			e.printStackTrace();
		}
		
	}

	private static void m2() {
		m1();
	}
}
