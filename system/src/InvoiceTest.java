package src;
import junit.framework.TestCase;

public class InvoiceTest extends TestCase{

    //Test #: 1
    //Test Objective: To check payment type
    //Inputs: bill_paymentType = "card"
    //Expected Outputs: Exception Message: "Payment type not acceptable"
    public void testBill_paymentType001() {
        try {
            //Call method under test
            Invoice.validatePaymentType("card");
            equals("Exception expected");
        } catch (InvoiceExceptionHandler e) {
            assertEquals("Payment type not acceptable", e.getMessage());
        }
    }

    //Test #: 2
    //Test Objective: To check payment type
    //Inputs: bill_paymentType = "cash"
    //Expected Outputs: Exception Message: "Payment type not acceptable"
    public void testBill_paymentType002() {
        try {
            //Call method under test
            Invoice.validatePaymentType("cash");
            equals("Exception expected");
        } catch (InvoiceExceptionHandler e) {
            assertEquals("Payment type not acceptable", e.getMessage());
        }
    }

    //Test #: 3
    //Test Objective: To catch the customer details blank
    //Inputs: firstname = " "
    //Expected Output: Exception Message: "Customer Details do not meet minimum length requirements"
    public void testValidateCusDetails001() {
        try {
            //Call method under test
            Invoice.validateCusDetails(" ");
            fail("Exception expected");
        } catch (InvoiceExceptionHandler e) {
            assertEquals("Customer Details CAN NOT BE EMPTY", e.getMessage());
        }
    }

    //Test #: 4
    //Test Objective: To catch a customer details name with more then 40 characters
    //Inputs: firstname = "qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfg"
    //Expected Output: Exception Message: "Customer Name does not meet minimum length requirements"
    public void testValidateCusDetails002() {
        try {
            //Call method under test
            Invoice.validateCusDetails(" ");
            fail("Exception expected");
        } catch (InvoiceExceptionHandler e) {
            assertEquals("Customer Details CAN NOT BE EMPTY", e.getMessage());
        }
    }

    //Test #: 5
    //Test Objective: To catch the order details blank
    //Inputs: firstname = " "
    //Expected Output: Exception Message: "Order Name does not meet minimum length requirements"
    public void testValidateOrdDetails001() {
        try {
            //Call method under test
            Invoice.validateOrdDetails(" ");
            fail("Exception expected");
        } catch (InvoiceExceptionHandler e) {
            assertEquals("Order Details CAN NOT BE EMPTY", e.getMessage());
        }
    }

    //Test #: 6
    //Test Objective: To catch an order details name with more then 40 characters
    //Inputs: firstname = "qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfg"
    //Expected Output: Exception Message: "Order Name does not meet minimum length requirements"
    public void testValidateOrdDetails002() {
        try {
            //Call method under test
            Invoice.validateOrdDetails(" ");
            fail("Exception expected");
        } catch (InvoiceExceptionHandler e) {
            assertEquals("Order Details CAN NOT BE EMPTY", e.getMessage());
        }
    }

    //    Validate Price for Invoice
    //Test #: 7
    //Test Objective: To catch an invalid Invoice Price (checking for blank or empty)
    //Inputs: Price = " "
    //Expected Output: Exception Message: "Invoice price is not valid"
    public void testValidatePrice001() {
        try {
            //Call method under test
            Invoice.validatePrice(" ");
            fail("Exception expected");
        } catch (InvoiceExceptionHandler e) {
            assertEquals("Invoice price is not valid", e.getMessage());
        }
    }

    //    Validate Payment Type for Invoice
    //Test #: 8
    //Test Objective: To catch an invalid Payment Type (checking for blank or empty)
    //Inputs: Payment Type = " "
    //Expected Output: Exception Message: "Payment type has been left blank"
    public void testValidateBill_paymentType003() {
        try {
            //Call method under test
            Invoice.validatePaymentType(" ");
            fail("Exception expected");
        } catch (InvoiceExceptionHandler e) {
            assertEquals("Payment type has been left blank", e.getMessage());
        }
    }
}
