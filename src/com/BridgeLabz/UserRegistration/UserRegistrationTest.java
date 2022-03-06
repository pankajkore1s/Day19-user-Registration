package com.BridgeLabz.UserRegistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {
	 @Test
	    public void givenFirstName_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
	        UserRegistrationValidation userValidation = new UserRegistrationValidation();
	        boolean first_name = UserRegistrationValidation.validateFirstName("Pankaj");
	        Assertions.assertEquals(true, first_name);
	    }

	    @Test
	    public void givenFirstName_WhenWithSpChars_ShouldReturnFalse() throws UserRegistrationException {
	        UserRegistrationValidation userValidation = new UserRegistrationValidation();
	        boolean first_name = UserRegistrationValidation.validateFirstName("P@1qw");
	        Assertions.assertEquals(false, first_name);
	    }

	    @Test
	    public void givenLastName_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
	        UserRegistrationValidation userValidation = new UserRegistrationValidation();
	        boolean last_name = UserRegistrationValidation.validateLastName("Kore");
	        Assertions.assertEquals(true, last_name);
	    }

	    @Test
	    public void givenLaststName_WhenWithSpChars_ShouldReturnFalse() throws UserRegistrationException {
	        UserRegistrationValidation userValidation = new UserRegistrationValidation();
	        boolean last_name = UserRegistrationValidation.validateFirstName("P@*1");
	        Assertions.assertEquals(false, last_name);
	    }

	    //--------------------------Test Cases for Email Validation---------------------//
	    @Test
	    public void validateEmailAddress_WhenValidDomainName2_ShouldReturnTrue() throws UserRegistrationException {
	        UserRegistrationValidation userValidation = new UserRegistrationValidation();
	        boolean email = UserRegistrationValidation.validateEmail("korep9@gmail.com");
	        Assertions.assertEquals(true, email);
	    }

	    @Test
	    public void validateEmailAddress_WhenWithoutDomain_ShouldReturnFalse() throws UserRegistrationException {
	        UserRegistrationValidation userValidation = new UserRegistrationValidation();
	        boolean email = UserRegistrationValidation.validateEmail("korep");
	        Assertions.assertEquals(false, email);
	    }

	    //--------------------------Test Cases for Mobile Number Validation-----------------//
	    @Test
	    public void validateMobileNo_WhenValid_ShouldReturnTrue() throws UserRegistrationException {
	        UserRegistrationValidation userValidation = new UserRegistrationValidation();
	        boolean phoneNo = UserRegistrationValidation.validatePhoneNumber("91 8888888888");
	        Assertions.assertEquals(true, phoneNo);
	    }

	    @Test
	    public void validateMobileNo_WhenShort_ShouldReturnFalse() throws UserRegistrationException {
	        UserRegistrationValidation userValidation = new UserRegistrationValidation();
	        boolean phoneNo = UserRegistrationValidation.validatePhoneNumber("9999");
	        Assertions.assertEquals(false, phoneNo);
	    }

	    //--------------------------Test Cases for Password Validation-----------------//
	    @Test
	    public void validatePassword_WhenValid_ShouldReturnTrue() throws UserRegistrationException {
	       UserRegistrationValidation userValidation=new UserRegistrationValidation();
	       boolean password=UserRegistrationValidation.validatePassword("SwS@sff223");
	       Assertions.assertEquals(true,password);
	    }

	    @Test
	    public void validatePassword_WhenDoNotContainAtLeast1Upper_ShouldReturnFalse() throws UserRegistrationException {
	        UserRegistrationValidation userValidation=new UserRegistrationValidation();
	        boolean password=UserRegistrationValidation.validatePassword("wret@sff223");
	        Assertions.assertEquals(false,password);
	    }

	    @Test
	    public void validatePassword_WhenDoNotContainAtLeast1Digit_ShouldReturnFalse() throws UserRegistrationException {
	        UserRegistrationValidation userValidation=new UserRegistrationValidation();
	        boolean password=UserRegistrationValidation.validatePassword("SS@asdf");
	        Assertions.assertEquals(false,password);
	    }

}