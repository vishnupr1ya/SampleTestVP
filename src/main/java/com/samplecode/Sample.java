package com.samplecode;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Sample {
	
	public int userLogin(String userName, String password) throws IOException {
		System.out.println("This is my first change");
		
		
		Properties properties = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\Config.properties");
		properties.load(fis);
		String user = properties.getProperty("userName");
		System.out.println(user);
		String pass = properties.getProperty("password");
		System.out.println(pass);
		if(user.equals(userName) && pass.equals(password)) {
			return 1;
		}else {
			return 0;
		}
		
	
	}

}
