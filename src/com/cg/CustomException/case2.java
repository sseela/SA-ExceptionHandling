package com.cg.CustomException;

import java.io.IOException;
import java.sql.SQLException;

import javax.xml.bind.JAXBException;

public class case2 {
	private static int j = 90/0;
	public static void main(String[] args) {
		try {
			System.out.println("hello");
		} catch(Exception e) {
			
		}
	}
}

class case22 {
	public static void main(String[] args) {
		try {
			System.out.println("hello");
		} catch(IOException e) {						// fullyChecked exceptions are not allowed when there is no possibility of that error being raised.
			
		}
	}
}



class TestExceptionCase2 {

	public static void main(String[] args) {
		try {
			foo();
		} catch (IOException e) {
			e.printStackTrace();
		}catch(JAXBException e){
			e.printStackTrace();
		}catch(NullPointerException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public static void foo() throws IOException{
		
	}
}