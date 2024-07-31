package src;
import junit.framework.TestCase;

public class AdminTest extends TestCase {

//    Validate Username

    //Test #: 1
    //Test Objective: To catch an invalid admin name(less than 2 character)
    //Inputs: username = "J"
    //Expected Output: Exception Message: "Admin Name does not meet minimum length requirements"
    public void testValidateUserName001() {
        try {
            //Call method under test
            Admin.validateUsername("J");
            fail("Exception expected");
        } catch (AdminExceptionHandler e) {
            assertEquals("Admin Name does not meet minimum length requirements", e.getMessage());
        }
    }

    //Test #: 2
    //Test Objective: To catch an blank admin name
    //Inputs: username = " "
    //Expected Output: Exception Message: "Admin Name CAN NOT BE EMPTY"
    public void testValidateUserName002() {
        try {
            //Call method under test
            Admin.validateUsername(" ");
            fail("Exception expected");
        } catch (AdminExceptionHandler e) {
            assertEquals("Admin Name CAN NOT BE EMPTY", e.getMessage());
        }
    }

    //Test #: 3
    //Test Objective: To catch admin name with more than 20 characters
    //Inputs: username = "asdfghjklpoiuytrewqas"
    //Expected Output: Exception Message: "Admin Name too long"
    public void testValidateUserName003() {
        try {
            //Call method under test
            Admin.validateUsername("asdfghjklpoiuytrewqas");
            fail("Exception expected");
        } catch (AdminExceptionHandler e) {
            assertEquals("Admin Name too long", e.getMessage());
        }
    }


//  Validate Password

    //Test #: 4
    //Test Objective: To catch an invalid Password(less than 2 character)
    //Inputs: username = "A"
    //Expected Output: Exception Message: "Admin Password does not meet minimum length requirements"
    public void testValidatePassword001() {
        try {
            //Call method under test
            Admin.validatePassword("J");
            fail("Exception expected");
        } catch (AdminExceptionHandler e) {
            assertEquals("Admin password does not meet minimum length requirements", e.getMessage());
        }
    }

    //Test #: 5
    //Test Objective: To catch an blank admin name
    //Inputs: username = " "
    //Expected Output: Exception Message: "Admin Name does not meet minimum length requirements"
    public void testValidatePassword002() {
        try {
            //Call method under test
            Admin.validatePassword(" ");
            fail("Exception expected");
        } catch (AdminExceptionHandler e) {
            assertEquals("Admin password NOT specified", e.getMessage());
        }
    }

    //Test #: 6
    //Test Objective: To catch admin name with more than 20 characters
    //Inputs: username = "asdfghjklpoiuytrewqas"
    //Expected Output: Exception Message: "Admin password too long"
    public void testValidatePassword003() {
        try {
            //Call method under test
            Admin.validatePassword("asdfghjklpoiuytrewqas");
            fail("Exception expected");
        } catch (AdminExceptionHandler e) {
            assertEquals("Admin password too long", e.getMessage());
        }
    }

    // Validate Email

    //Test #: 13
    //Test Objective: To catch an invalid Admin email (checking for blank or empty)
    //Inputs: email = " "
    //Expected Output: Exception Message: "Admin email NOT specified"
    public void testValidateEmail001() {
        try {
            //Call method under test
            Admin.validateEmail(" ");
            fail("Exception expected");
        } catch (AdminExceptionHandler e) {
            assertEquals("Admin Email NOT specified", e.getMessage());
        }
    }
    //Test #: 14
    //Test Objective: To catch an invalid Admin Email (checking for less then 5)
    //Inputs: Email = "1234"
    //Expected Output: Exception Message: "Admin Email does not meet minimum length requirements"
    public void testValidateEmail002() {
        try {
            //Call method under test
            Admin.validateEmail("1234");
            fail("Exception expected");
        } catch (AdminExceptionHandler e) {
            assertEquals("Admin Email does not meet minimum length requirements", e.getMessage());
        }
    }
    //Test #: 15
    //Test Objective: To catch an invalid Admin Email (checking is it greater then 20 characters)
    //Inputs: Email = "12345678910111213142122"
    //Expected Output: Exception Message: "Admin Email exceeds maximum length requirements"
    public void testValidateEmail003() {
        try {
            //Call method under test
            Admin.validateEmail("12345678910111213142122");
            fail("Exception expected");
        } catch (AdminExceptionHandler e) {
            assertEquals("Admin Email exceeds maximum length requirements", e.getMessage());
        }
    }

    // Validate Admin Phone number

//    Validate Phone number for Admin
    //Test #: 7
    //Test Objective: To catch an invalid Admin PhoneNumber (checking for blank or empty)
    //Inputs: PhoneNumber = " "
    //Expected Output: Exception Message: "Admin phone number is not valid"
    public void testValidatePhoneNumber001() {
        try {
            //Call method under test
            Admin.validatePhoneNumber(" ");
            fail("Exception expected");
        } catch (AdminExceptionHandler e) {
            assertEquals("Admin phone number is not valid", e.getMessage());
        }
    }

    //Test #: 8
    //Test Objective: To catch an invalid Admin PhoneNumber (checking for less then 5)
    //Inputs: phoneNumber = "1"
    //Expected Output: Exception Message: "Admin phone number does not meet minimum length requirements"
    public void testValidatePhoneNumber002() {
        try {
            //Call method under test
            Admin.validatePhoneNumber("1");
            fail("Exception expected");
        } catch (AdminExceptionHandler e) {
            assertEquals("Admin phone number does not meet minimum length requirements", e.getMessage());
        }
    }

    //Test #: 9
    //Test Objective: To catch an invalid Admin PhoneNumber (if its greater then 15 characters)
    //Inputs: PhoneNumber = "12345678910111213142122"
    //Expected Output: Exception Message: "Admin phone number exceeds maximum length requirements"
    public void testValidatePhoneNumber003() {
        try {
            //Call method under test
            Admin.validatePhoneNumber("12345678910111213142122");
            fail("Exception expected");
        } catch (AdminExceptionHandler e) {
            assertEquals("Admin phone number exceeds maximum length requirements", e.getMessage());
        }
    }


    //   Validate Name

    //Test #: 10
    //Test Objective: To catch an blank Admin name
    //Inputs: firstname = " "
    //Expected Output: Exception Message: "Admin Name CAN NOT BE EMPTY"
    public void testValidateName001() {
        try {
            //Call method under test
            Admin.validateName(" ");
            fail("Exception expected");
        } catch (AdminExceptionHandler e) {
            assertEquals("Admin Name CAN NOT BE EMPTY", e.getMessage());
        }
    }

    //Test #: 11
    //Test Objective: To catch an Name with more then 20 characters
    //Inputs: firstname = "asdfghjklpoiuytrewqka"
    //Expected Output: Exception Message: "Admin Name to long"
    public void testValidateName002() {
        try {
            //Call method under test
            Admin.validateName("asdfghjklpoiuytrewqka");
            fail("Exception expected");
        } catch (AdminExceptionHandler e) {
            assertEquals("Admin Name to long", e.getMessage());
        }
    }

    //Test #: 12
    //Test Objective: To catch an invalid Admin name
    //Inputs: Surname = "J"
    //Expected Output: Exception Message: "Admin name does not meet minimum length requirements"
    public void testValidateName003() {
        try {
            //Call method under test
            Admin.validateName("J");
            fail("Exception expected");
        } catch (AdminExceptionHandler e) {
            assertEquals("Admin name does not meet minimum length requirements", e.getMessage());
        }
    }


    //    Validate Surname

    //Test #: 16
    //Test Objective: To catch an blank Admin surname
    //Inputs: surname = " "
    //Expected Output: Exception Message: "Admin Surname CAN NOT BE EMPTY"
    public void testValidateSurname001() {
        try {
            //Call method under test
            Admin.validateSurname(" ");
            fail("Exception expected");
        } catch (AdminExceptionHandler e) {
            assertEquals("Admin Surname CAN NOT BE EMPTY", e.getMessage());
        }
    }

    //Test #: 17
    //Test Objective: To catch an Name with more then 20 characters
    //Inputs: firstname = "asdfghjklpoiuytrewqka"
    //Expected Output: Exception Message: "Admin surname to long"
    public void testValidateSurname002() {
        try {
            //Call method under test
            Admin.validateSurname("asdfghjklpoiuytrewqka");
            fail("Exception expected");
        } catch (AdminExceptionHandler e) {
            assertEquals("Admin surname to long", e.getMessage());
        }
    }

    //Test #: 18
    //Test Objective: To catch an invalid Admin Surname
    //Inputs: Surname = "J"
    //Expected Output: Exception Message: "Admin Surname does not meet minimum length requirements"
    public void testValidateSurname003() {
        try {
            //Call method under test
            Admin.validateSurname("J");
            fail("Exception expected");
        } catch (AdminExceptionHandler e) {
            assertEquals("Admin Surname does not meet minimum length requirements", e.getMessage());
        }
    }

    //    Validate Level

    //Test #: 19
    //Test Objective: To catch an blank Admin Level
    //Inputs: Level = " "
    //Expected Output: Exception Message: "Admin Level CAN NOT BE EMPTY"
    public void testValidateLevel001() {
        try {
            //Call method under test
            Admin.validateLevel(" ");
            fail("Exception expected");
        } catch (AdminExceptionHandler e) {
            assertEquals("Admin Level CAN NOT BE EMPTY", e.getMessage());
        }
    }

    //Test #: 20
    //Test Objective: To catch an Level with more then 20 characters
    //Inputs: Level = "asdfghjklpoiuytrewqka"
    //Expected Output: Exception Message: "Admin level to long enter 'admin' or 'user'"
    public void testValidateLevel002() {
        try {
            //Call method under test
            Admin.validateLevel("asdfghjklpoiuytrewqka");
            fail("Exception expected");
        } catch (AdminExceptionHandler e) {
            assertEquals("Admin level to long enter 'admin' or 'user'", e.getMessage());
        }
    }

    //Test #: 21
    //Test Objective: To catch an invalid Admin Level
    //Inputs: Level = "J"
    //Expected Output: Exception Message: "Admin Level does not meet minimum length requirements"
    public void testValidateLevel003() {
        try {
            //Call method under test
            Admin.validateLevel("J");
            fail("Exception expected");
        } catch (AdminExceptionHandler e) {
            assertEquals("Admin Level does not meet minimum length requirements", e.getMessage());
        }
    }
}
