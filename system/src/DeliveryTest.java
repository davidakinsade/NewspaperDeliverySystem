package src;
import junit.framework.TestCase;

public class DeliveryTest extends TestCase{

    //Test #: 1
    //Test Objective: To catch the customer address blank
    //Inputs: " "
    //Expected Output: Exception Message: "Customer Address does not meet minimum length requirements"
    public void testValidateCustomerAddress001() {
        try {
            //Call method under test
            Delivery.validateCustomerAddress(" ");
            fail("Exception expected");
        } catch (DeliveryExceptionHandler e) {
            assertEquals("Customer Address CAN NOT BE EMPTY", e.getMessage());
        }
    }

    //Test #: 2
    //Test Objective: To catch a customer's address with more then 50 characters
    //Inputs: = "qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnm"
    //Expected Output: Exception Message: "Customer Address exceeds the maximum length requirement"
    public void testValidateCustomerAddress002() {
        try {
            //Call method under test
            Delivery.validateCustomerAddress("qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnm ");
            fail("Exception expected");
        } catch (DeliveryExceptionHandler e) {
            assertEquals("Customer Address exceeds the maximum length requirement", e.getMessage());
        }
    }

    //Test #: 3
    //Test Objective: To catch a customer's address with less then 5 characters
    //Inputs: = "qw"
    //Expected Output: Exception Message: "Customer Address does not reach the minimum length requirement"
    public void testValidateCustomerAddress003() {
        try {
            //Call method under test
            Delivery.validateCustomerAddress("qw");
            fail("Exception expected");
        } catch (DeliveryExceptionHandler e) {
            assertEquals("Customer Address does not reach the minimum length requirement", e.getMessage());
        }
    }


    //Test #: 4
    //Test Objective: To catch a customer's address without the N37 postcode
    //Inputs: = "R35 T7O9"
    //Expected Output: Exception Message: "Customer Address does not include postcode 'N37' "
    public void testValidateCustomerAddress004() {
        try {
            //Call method under test
            Delivery.validateCustomerAddress("R35 T7O9");
            fail("Exception expected");
        } catch (DeliveryExceptionHandler e) {
            assertEquals("Customer Address does not include postcode 'N37'", e.getMessage());
        }
    }


    //Test #: 5
    //Test Objective: To catch products with less then 5 characters
    //Inputs: = "abc"
    //Expected Output: Exception Message: "Product name does not reach the minimum length requirement"
    public void testValidateProducts001() {
        try {
            //Call method under test
            Delivery.validateProducts("abc");
            fail("Exception expected");
        } catch (DeliveryExceptionHandler e) {
            assertEquals("Product name does not reach the minimum length requirement", e.getMessage());
        }
    }

    //Test #: 6
    //Test Objective: To catch the product name blank
    //Inputs: " "
    //Expected Output: Exception Message: "Product Name does not meet minimum length requirements"
    public void testValidateProducts002() {
        try {
            //Call method under test
            Delivery.validateProducts(" ");
            fail("Exception expected");
        } catch (DeliveryExceptionHandler e) {
            assertEquals("Product Name CAN NOT BE EMPTY", e.getMessage());
        }
    }

    //Test #: 7
    //Test Objective: To catch a product name with more then 50 characters
    //Inputs: = "qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnm"
    //Expected Output: Exception Message: "Product Name exceeds the maximum length requirement"
    public void testValidateProducts003() {
        try {
            //Call method under test
            Delivery.validateProducts("qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnm ");
            fail("Exception expected");
        } catch (DeliveryExceptionHandler e) {
            assertEquals("Product name exceeds the maximum length requirement", e.getMessage());
        }
    }


    //Test #: 8
    //Test Objective: To catch the time blank
    //Inputs: " "
    //Expected Output: Exception Message: "The time does not meet minimum length requirements"
    public void testValidateTime001() {
        try {
            //Call method under test
            Delivery.validateTime(" ");
            fail("Exception expected");
        } catch (DeliveryExceptionHandler e) {
            assertEquals("Time CAN NOT BE EMPTY", e.getMessage());
        }
    }

    //Test #: 9
    //Test Objective: To catch the time with less then 5 characters
    //Inputs: = "abc"
    //Expected Output: Exception Message: "Time does not reach the minimum length requirement"
    public void testValidateTime002() {
        try {
            //Call method under test
            Delivery.validateTime("1");
            fail("Exception expected");
        } catch (DeliveryExceptionHandler e) {
            assertEquals("Time does not reach the minimum length requirement", e.getMessage());
        }
    }

    //Test #: 10
    //Test Objective: To catch the time name with more then 10 characters
    //Inputs: = "qwertyuioxcvbnm"
    //Expected Output: Exception Message: "Product Name exceeds the maximum length requirement"
    public void testValidateTime003() {
        try {
            //Call method under test
            Delivery.validateTime("qwertyuioxcvbnm ");
            fail("Exception expected");
        } catch (DeliveryExceptionHandler e) {
            assertEquals("Time exceeds the maximum length requirement", e.getMessage());
        }
    }

    //Test #: 11
    //Test Objective: To catch a the time without the AM/PM
    //Inputs: = "12:00"
    //Expected Output: Exception Message: "Time does not include 'AM/PM' "
    public void testValidateTime004() {
        try {
            //Call method under test
            Delivery.validateTime("12:00");
            fail("Exception expected");
        } catch (DeliveryExceptionHandler e) {
            assertEquals("Time does not include 'AM/PM'", e.getMessage());
        }
    }





}
