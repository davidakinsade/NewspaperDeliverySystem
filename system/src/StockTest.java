package src;
import junit.framework.AssertionFailedError;
import junit.framework.TestCase;

public class StockTest extends TestCase{


    //Test #: 1
    //Test Objective: To create a Stock
    //Input: name = "westmeath_independant"
    //Expected Output: Stock Object created with id = 0 ,"westmeath_independant"

    public void testStock001() throws StockExceptionHandler {

        //Create the Stock
        try {

            //Call method under test
            Stock stockObj = new Stock("westmeath_independant");

            // Use getters to check for object creation
            assertEquals(0, stockObj.getId());
            assertEquals("westmeath_independant", stockObj.getName());


        } catch (StockExceptionHandler e)
        {
            //fail("Exception not expected");
        }

    }

    //Test #: 2
    //Test Objective: To catch an invalid stock name
    //Inputs: name = "Wdsd"
    //Expected Output: Exception Message: "Stock Name does not meet minimum length requirements"

    public void testValidateName001() {

        try {

            //Call method under test
            Stock.validateStockName("Wdsd");
            fail("Exception expected");
        }
        catch (StockExceptionHandler e) {
            assertEquals("Stock Name does not meet minimum length requirements", e.getMessage());

        }
    }
}
