package com.BridgeLabz.UserRegistration;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationValidation {
	static Scanner sc = new Scanner(System.in);

	public static boolean validateFirstName(String first_name ){
		String firstNamePattern = "^([A-Z]{1})+[a-zA-Z]{2,}$"; //set Pattern
		Pattern pattern = Pattern.compile(firstNamePattern);
		Matcher matcher = pattern.matcher(first_name);
		if (matcher.matches()) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean validateLastName(String last_name) {
		String lastNamePattern = "^[A-Z]{1}[a-z,A-Z]{2,}";
		Pattern pattern = Pattern.compile(lastNamePattern);
		Matcher matcher =pattern.matcher(last_name);
		if(matcher.matches()) {
			return true;
		}else {
			return false;
		}
	}
	public static boolean validateEmail (String email) {
		String emailPattern = "^[a-zA-Z0-9]+[.(a-zA-Z0-9)]*[@]{1}[a-z]+[.]{1}[a-z]{2,4}[.]*[a-z]*{2}$";  //set pattern for email id
		Pattern pattern = Pattern.compile(emailPattern);
		Matcher matcher=pattern.matcher(email);
		if(matcher.matches()) {
			return true;
		}else {
			return false;
		}
	}
	public static boolean validatePhoneNumber(String phoneNumber) {
		String phoneNumberPattern = "^[0-9]{2}[ ]+[0-9]{10}";    //set pattern
		Pattern pattern = Pattern.compile(phoneNumberPattern);
		Matcher matcher=pattern.matcher(phoneNumber);
		if(matcher.matches()) {
			return true;
		}else {
			return false;
		}
	}
	public static boolean validatePassword(String password) {
		String passwordPattern =  "^(?=.*[0-9])(?=.*[@#$%^&!])(?=.*[A-Z])(?=.*[a-z]).{8,}$";     //set Pattern
		Pattern pattern = Pattern.compile(passwordPattern);
		Matcher matcher=pattern.matcher(password);
		if(matcher.matches()) {
			return true;
		}else {
			return false;
		}
	}
	public static void main (String[]args ){
		System.out.println("Welcome to User Registration Project ");
		System.out.println("Enter First name ");
        validateFirstName(sc.nextLine());
        System.out.println("Enter last name ");
        validateLastName(sc.nextLine());
        System.out.println("Enter email name ");
        validateEmail(sc.nextLine());
        System.out.println(" Enter mobile number: ");
        validatePhoneNumber(sc.nextLine());
        System.out.println("Enter password: ");
        validatePassword(sc.nextLine());
	}
}


