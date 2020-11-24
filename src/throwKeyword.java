import java.io.IOException;

import javax.xml.bind.JAXBException;

public class throwKeyword {
	public static void main(String[] args) {
		try {
			System.out.println(2/0);
		} catch(Exception e) {
			throw new NullPointerException("custom exception");
		}
	}
}


class nullReference {
	private static ArithmeticException ae = new ArithmeticException();
	public static void main(String[] args) {
		if(true) {
			throw ae;
		}
	}
}


