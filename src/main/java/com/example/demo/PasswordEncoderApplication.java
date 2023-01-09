package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class PasswordEncoderApplication {

	public static void main(String[] args) {
		SpringApplication.run(PasswordEncoderApplication.class, args);
		
		//sign up
		BCryptPasswordEncoder pwdEncoder = new BCryptPasswordEncoder();		
		String pwd = "Password*%^123";
//		String pwd1 = "Password";
		
		String encryptedpwd = pwdEncoder.encode(pwd);
//		pwdEncoder.
		
		System.out.println("password: " +  pwd);
		System.out.println("ecrypted pwd: " + encryptedpwd);
		
		
		
		
		//login page
		String secondpwd = "Password*%^123";
		
		boolean isMatch = pwdEncoder.matches(secondpwd, encryptedpwd);
		
		
		if (isMatch) {
			System.out.println("Correct password: " + pwd + "=" + secondpwd);
		}
		else {
			System.out.println("Inorrect password: " + pwd + "!=" + secondpwd);
		}
		
		
	}

}
