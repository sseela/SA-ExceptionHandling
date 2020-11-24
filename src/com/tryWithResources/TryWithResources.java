package com.tryWithResources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.sql.Connection;

public class TryWithResources {
	public static void main(String[] args) {
		try(Lion lion = new Lion(); Tiger tiger = new Tiger()) {
			System.out.println(2/0);
		} catch(Exception e) {
			System.out.println("inside catch block");
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}
	}
}

class Lion implements AutoCloseable{
	Lion() {
		System.out.println("Lion is created");
	}

	@Override
	public void close() throws Exception {
		System.out.println("Closing the Lion");
	}
	
}

class Tiger implements AutoCloseable{
	public Tiger() {
		System.out.println("Tiger is created");
	}

	@Override
	public void close() throws Exception {
		System.out.println("Closing the Tiger");
		throw new Exception("fuck");
	}
}
