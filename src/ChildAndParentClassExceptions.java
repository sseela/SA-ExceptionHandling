import java.io.FileNotFoundException;
import java.io.IOException;

public class ChildAndParentClassExceptions {
	
}


class parent {
	public void method() throws NullPointerException {
		
	}
}

class child extends parent{
	public void method() throws RuntimeException {
		
	}
}
