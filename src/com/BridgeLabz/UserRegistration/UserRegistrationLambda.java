package com.BridgeLabz.UserRegistration;
import java.util.regex.Pattern;

@FunctionalInterface
interface UserRegistrationInterface {
	boolean validate(String userDetails,String pattern);
}
public class UserRegistrationLambda {
	public static void main(String[] args) {
	UserRegistrationInterface firstName = (String pattern, String first_name) -> {
		if (Pattern.matches(pattern, first_name)) {
			System.out.println("True");
			return true;
		}else {
			System.out.println("False");
			return false;
		}
	};
	UserRegistrationInterface lastName = (String pattern, String last_name) -> {
		if (Pattern.matches(pattern, last_name)) {
			System.out.println("True");
			return true;
		}else {
			System.out.println("False");
			return false;
		}
	};
	UserRegistrationInterface email = (String pattern, String Email) -> {
		if (Pattern.matches(pattern, Email)) {
			System.out.println("True");
			return true;
		}else {
			System.out.println("False");
			return false;
		}
	};
	UserRegistrationInterface phoneNumber = (String pattern, String phone_number) -> {
		if (Pattern.matches(pattern, phone_number)) {
			System.out.println("True");
			return true;
		}else {
			System.out.println("False");
			return false;
		}
	};
	UserRegistrationInterface passWord = (String pattern, String password) -> {
		if (Pattern.matches(pattern, password)) {
			System.out.println("True");
			return true;
		}else {
			System.out.println("False");
			return false;
		}
	};


	firstName.validate("^[A-Z][a-z]{2,}$", "Pankaj");
	firstName.validate("^[A-Z][a-z]{2,}$", "1pan");

	lastName.validate("^[A-Z][a-z]{2,}$", "Kore");
	lastName.validate("^[A-Z][a-z]{2,}$", "ko1");

	email.validate("^[a-zA-Z0-9_-]+(?:\\.[a-zA-Z0-9_+-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$","korep95@gmail.com");
	email.validate("^[a-zA-Z0-9_-]+(?:\\.[a-zA-Z0-9_+-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$","123nufn");

	phoneNumber.validate("^[9][1]{0,1}\\s[0-9]{10}", "91 8888888888");
	phoneNumber.validate("^[9][1]{0,1}\\s[0-9]{10}", "91 12ggh");

	passWord.validate("(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_-])[a-zA-Z0-9].{8,}$","DJqwerty100%");
	passWord.validate("(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_-])[a-zA-Z0-9].{8,}$","bgre1");

}

}
