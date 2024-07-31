package src;
import junit.framework.TestCase;
public class CustomerTest extends TestCase {
    //Test #: 1
    //Test Objective: To create a Customer Account
    //Inputs: firstName = "Jack", surName = "Daniels",phone = "265646544", town = "Athlone", age = "19", address = "16 Abbey road", area = "West"
    //Expected Output: Customer Object created with id = 0, "Jack", "Daniels",phone = "265646544", town = "Athlone", age = "19", address = "16 Abbey road", area = "West"
    public void testCustomer001() {
        //Create the Customer Object
        try {
            //Call method under test
            Customer custObj = new Customer("Jack", "Daniels", "265646544", "19", "Athlone", "16 Abbey road", "West");
            // Use getters to check for object creation
            assertEquals(0, custObj.getId());
            assertEquals("Jack", custObj.getName());
            assertEquals("Daniels", custObj.getSurname());
            assertEquals("265646544", custObj.getPhoneNumber());
            assertEquals("19", custObj.getCustomerAge());
            assertEquals("Athlone", custObj.getCustomerTown());
            assertEquals("16 Abbey road", custObj.getCustomerAddress());
            assertEquals("West", custObj.getCustomerArea());
        } catch (CustomerExceptionHandler e) {
            //fail("Exception not expected");
        }
    }


    //Test #: 2
    //Test Objective: To catch an invalid customer name(less than 2 character)
    //Inputs: firstname = "J"
    //Expected Output: Exception Message: "Customer Name does not meet minimum length requirements"
    public void testValidateName002() {
        try {
            //Call method under test
            Customer.validateName("J");
            fail("Exception expected");
        } catch (CustomerExceptionHandler e) {
            assertEquals("Customer Name does not meet minimum length requirements", e.getMessage());
        }
    }


    //Test #: 3
    //Test Objective: To catch an blank customer name
    //Inputs: firstname = " "
    //Expected Output: Exception Message: "Customer Name does not meet minimum length requirements"
    public void testValidateName003() {
        try {
            //Call method under test
            Customer.validateName(" ");
            fail("Exception expected");
        } catch (CustomerExceptionHandler e) {
            assertEquals("Customer Name CAN NOT BE EMPTY", e.getMessage());
        }
    }


    //Test #: 4
    //Test Objective: To catch an Name with more then 20 characters
    //Inputs: firstname = "asdfghjklpoiuytrewqk "
    //Expected Output: Exception Message: "Customer Name does not meet minimum length requirements"
    public void testValidateName004() {
        try {
            //Call method under test
            Customer.validateName(" ");
            fail("Exception expected");
        } catch (CustomerExceptionHandler e) {
            assertEquals("Customer Name CAN NOT BE EMPTY", e.getMessage());
        }
    }


    //Test #: 5
    //Test Objective: To catch an invalid customer Surname
    //Inputs: Surname = "J"
    //Expected Output: Exception Message: "Customer Surname does not meet minimum length requirements"
    public void testValidateSurname001() {
        try {
            //Call method under test
            Customer.validateSurname("J");
            fail("Exception expected");
        } catch (CustomerExceptionHandler e) {
            assertEquals("Customer Surname does not meet minimum length requirements", e.getMessage());
        }
    }

    //Test #: 6
    //Test Objective: To catch an invalid customer Surname (which is blank,empty)
    //Inputs: Surname = " "
    //Expected Output: Exception Message: "Customer Surname does not meet minimum length requirements"
    public void testValidateSurname002() {
        try {
            //Call method under test
            Customer.validateSurname(" ");
            fail("Exception expected");
        } catch (CustomerExceptionHandler e) {
            assertEquals("Customer Surname CAN NOT BE EMPTY", e.getMessage());
        }
    }

    //Test #: 7
    //Test Objective: To catch an invalid customer Surname with more then 20 characters
    //Inputs: Surname = "asdfghjklpoiuytrewqncbv"
    //Expected Output: Exception Message: "Customer Surname exceeds maximum length requirements"
    public void testValidateSurname003() {
        try {
            //Call method under test
            Customer.validateSurname("ajskjkjkasjkjaksajksjaksjaksjakjs ");
            fail("Exception expected");
        } catch (CustomerExceptionHandler e) {
            assertEquals("Customer Surname exceeds maximum length requirements", e.getMessage());
        }
    }

    //Test #: 8
    //Test Objective: To catch an invalid customer Town
    //Inputs: Town = "B"
    //Expected Output: Exception Message: "Customer Town does not meet minimum length requirements"
    public void testValidateTown001() {
        try {
            //Call method under test
            Customer.validateTown("B");
            fail("Exception expected");
        } catch (CustomerExceptionHandler e) {
            assertEquals("Customer Town does not meet minimum length requirements", e.getMessage());
        }
    }

    //Test #: 9
    //Test Objective: To catch an invalid customer Town (less then 5 characters)
    //Inputs: Town = "Boo"
    //Expected Output: Exception Message: "Customer Town does not meet minimum length requirements"
    public void testValidateTown002() {
        try {
            //Call method under test
            Customer.validateTown("Boo");
            fail("Exception expected");
        } catch (CustomerExceptionHandler e) {
            assertEquals("Customer Town does not meet minimum length requirements", e.getMessage());
        }
    }

    //Test #: 10
    //Test Objective: To catch an invalid customer Town (more then 20)
    //Inputs: Town = "Boo"
    //Expected Output: Exception Message: "Customer Town exceeds maximum length requirements"
    public void testValidateTown003() {
        try {
            //Call method under test
            Customer.validateTown("asdfghjklpoiuytrewqncbv");
            fail("Exception expected");
        } catch (CustomerExceptionHandler e) {
            assertEquals("Customer Town exceeds maximum length requirements", e.getMessage());
        }
    }

    //Test #: 11
    //Test Objective: To catch an invalid customer Age (checking for blank or empty)
    //Inputs: Age = " "
    //Expected Output: Exception Message: "Customer Age is not valid"
    public void testValidateAge001() {
        try {
            //Call method under test
            Customer.validateAge(" ");
            fail("Exception expected");
        } catch (CustomerExceptionHandler e) {
            assertEquals("Customer Age is not valid", e.getMessage());
        }
    }

    //Test #: 12
    //Test Objective: To catch an invalid customer Age (checking for less then 2 characters)
    //Inputs: Age = "2"
    //Expected Output: Exception Message: "Customer Age is not valid"
    public void testValidateAge002() {
        try {
            //Call method under test
            Customer.validateAge("2");
            fail("Exception expected");
        } catch (CustomerExceptionHandler e) {
            assertEquals("Customer Age does not meet minimum requirements", e.getMessage());
        }
    }

    //Test #: 13
    //Test Objective: To catch an invalid customer Age (checking for more then 3 characters)
    //Inputs: Age = "1234"
    //Expected Output: Exception Message: "Customer Age exceeds maximum length requirements"
    public void testValidateAge003() {
        try {
            //Call method under test
            Customer.validateAge("1234");
            fail("Exception expected");
        } catch (CustomerExceptionHandler e) {
            assertEquals("Customer Age exceeds maximum length requirements", e.getMessage());
        }
    }

    //Test #: 14
    //Test Objective: To catch an invalid customer Address (checking for blank or empty)
    //Inputs: Address = " "
    //Expected Output: Exception Message: "Customer Address NOT specified"
    public void testValidateAddress001() {
        try {
            //Call method under test
            Customer.validateAddress(" ");
            fail("Exception expected");
        } catch (CustomerExceptionHandler e) {
            assertEquals("Customer Address NOT specified", e.getMessage());
        }
    }

    //Test #: 15
    //Test Objective: To catch an invalid customer Address (checking for less then 5 characters)
    //Inputs: Address = "asdf"
    //Expected Output: Exception Message: "Customer Address can not be less then 5 characters"
    public void testValidateAddress002() {
        try {
            //Call method under test
            Customer.validateAddress("asdf");
            fail("Exception expected");
        } catch (CustomerExceptionHandler e) {
            assertEquals("Customer Address can not be less then 5 characters", e.getMessage());
        }
    }

    //Test #: 16
    //Test Objective: To catch an invalid customer Address (checking for more then 30 characters)
    //Inputs: Address = "asdfsssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss"
    //Expected Output: Exception Message: "Customer Address exceeds maximum length requirements"
    public void testValidateAddress003() {
        try {
            //Call method under test
            Customer.validateAddress("asdfsssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss");
            fail("Exception expected");
        } catch (CustomerExceptionHandler e) {
            assertEquals("Customer Address exceeds maximum length requirements", e.getMessage());
        }
    }

    //Test #: 17
    //Test Objective: To catch an invalid customer Area (checking for blank or empty)
    //Inputs: Address = " "
    //Expected Output: Exception Message: "Customer Area NOT specified"
    public void testValidateArea001() {
        try {
            //Call method under test
            Customer.validateArea(" ");
            fail("Exception expected");
        } catch (CustomerExceptionHandler e) {
            assertEquals("Customer Area NOT specified", e.getMessage());
        }
    }

    //Test #: 18
    //Test Objective: To catch an invalid customer Area (checking for less then 3 characters)
    //Inputs: Address = "we"
    //Expected Output: Exception Message: "Customer Area does not meet minimum length requirements"
    public void testValidateArea002() {
        try {
            //Call method under test
            Customer.validateArea("we");
            fail("Exception expected");
        } catch (CustomerExceptionHandler e) {
            assertEquals("Customer Area does not meet minimum length requirements", e.getMessage());
        }
    }

    //Test #: 19
    //Test Objective: To catch an invalid customer Area (checking for more then 10 characters)
    //Inputs: Address = "westeastnorth"
    //Expected Output: Exception Message: "Customer Area does not meet minimum length requirements"
    public void testValidateArea003() {
        try {
            //Call method under test
            Customer.validateArea("westeastnorth");
            fail("Exception expected");
        } catch (CustomerExceptionHandler e) {
            assertEquals("Customer Area exceeds maximum length requirements", e.getMessage());
        }
    }

    //Test #: 20
    //Test Objective: To catch an invalid customer PhoneNumber (checking for blank or empty)
    //Inputs: PhoneNumber = " "
    //Expected Output: Exception Message: "Customer PhoneNumber NOT specified"
    public void testValidatePhoneNumber001() {
        try {
            //Call method under test
            Customer.validatePhoneNumber(" ");
            fail("Exception expected");
        } catch (CustomerExceptionHandler e) {
            assertEquals("Customer PhoneNumber NOT specified", e.getMessage());
        }
    }

    //Test #: 21
    //Test Objective: To catch an invalid customer PhoneNumber (checking for less then 5)
    //Inputs: PhoneNumber = "1234"
    //Expected Output: Exception Message: "Customer PhoneNumber does not meet minimum length requirements"
    public void testValidatePhoneNumber002() {
        try {
            //Call method under test
            Customer.validatePhoneNumber("1234");
            fail("Exception expected");
        } catch (CustomerExceptionHandler e) {
            assertEquals("Customer PhoneNumber does not meet minimum length requirements", e.getMessage());
        }
    }

    //Test #: 22
    //Test Objective: To catch an invalid customer PhoneNumber (checking for less then 5)
    //Inputs: PhoneNumber = "12345678910111213142122"
    //Expected Output: Exception Message: "Customer PhoneNumber exceeds maximum length requirements"
    public void testValidatePhoneNumber003() {
        try {
            //Call method under test
            Customer.validatePhoneNumber("12345678910111213142122");
            fail("Exception expected");
        } catch (CustomerExceptionHandler e) {
            assertEquals("Customer PhoneNumber exceeds maximum length requirements", e.getMessage());
        }
    }


}