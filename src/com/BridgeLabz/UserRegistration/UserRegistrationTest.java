package com.BridgeLabz.UserRegistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {
	 @Test
	    public void givenFirstName_WhenProper_ShouldReturnTrue() {
	        UserRegistrationValidation userValidation = new UserRegistrationValidation();
	        boolean first_name = userValidation.validateFirstName("Pankaj");
	        Assertions.assertEquals(true, first_name);
	    }

	    @Test
	    public void givenFirstName_WhenWithSpChars_ShouldReturnFalse() {
	        UserRegistrationValidation userValidation = new UserRegistrationValidation();
	        boolean first_name = userValidation.validateFirstName("P@1qw");
	        Assertions.assertEquals(false, first_name);
	    }

	    @Test
	    public void givenLastName_WhenProper_ShouldReturnTrue() {
	        UserRegistrationValidation userValidation = new UserRegistrationValidation();
	        boolean last_name = userValidation.validateLastName("Kore");
	        Assertions.assertEquals(true, last_name);
	    }

	    @Test
	    public void givenLaststName_WhenWithSpChars_ShouldReturnFalse() {
	        UserRegistrationValidation userValidation = new UserRegistrationValidation();
	        boolean last_name = userValidation.validateFirstName("P@*1");
	        Assertions.assertEquals(false, last_name);
	    }

	    //--------------------------Test Cases for Email Validation---------------------//
	    @Test
	    public void validateEmailAddress_WhenValidDomainName2_ShouldReturnTrue() {
	        UserRegistrationValidation userValidation = new UserRegistrationValidation();
	        boolean email = userValidation.validateEmail("korep9@gmail.com");
	        Assertions.assertEquals(true, email);
	    }

	    @Test
	    public void validateEmailAddress_WhenWithoutDomain_ShouldReturnFalse() {
	        UserRegistrationValidation userValidation = new UserRegistrationValidation();
	        boolean email = userValidation.validateEmail("korep");
	        Assertions.assertEquals(false, email);
	    }

	    //--------------------------Test Cases for Mobile Number Validation-----------------//
	    @Test
	    public void validateMobileNo_WhenValid_ShouldReturnTrue() {
	        UserRegistrationValidation userValidation = new UserRegistrationValidation();
	        boolean phoneNo = userValidation.validatePhoneNumber("91 8888888888");
	        Assertions.assertEquals(true, phoneNo);
	    }

	    @Test
	    public void validateMobileNo_WhenShort_ShouldReturnFalse() {
	        UserRegistrationValidation userValidation = new UserRegistrationValidation();
	        boolean phoneNo = userValidation.validatePhoneNumber("9999");
	        Assertions.assertEquals(false, phoneNo);
	    }

	    //--------------------------Test Cases for Password Validation-----------------//
	    @Test
	    public void validatePassword_WhenValid_ShouldReturnTrue() {
	       UserRegistrationValidation userValidation=new UserRegistrationValidation();
	       boolean password=userValidation.validatePassword("SwS@sff223");
	       Assertions.assertEquals(true,password);
	    }

	    @Test
	    public void validatePassword_WhenDoNotContainAtLeast1Upper_ShouldReturnFalse() {
	        UserRegistrationValidation userValidation=new UserRegistrationValidation();
	        boolean password=userValidation.validatePassword("wret@sff223");
	        Assertions.assertEquals(false,password);
	    }

	    @Test
	    public void validatePassword_WhenDoNotContainAtLeast1Digit_ShouldReturnFalse() {
	        UserRegistrationValidation userValidation=new UserRegistrationValidation();
	        boolean password=userValidation.validatePassword("SS@asdf");
	        Assertions.assertEquals(false,password);
	    }

}