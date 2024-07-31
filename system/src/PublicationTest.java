package src;
import junit.framework.AssertionFailedError;
import junit.framework.TestCase;

public class PublicationTest extends TestCase{


        //Test #: 1
        //Test Objective: To create a Publication
        //Input: name = "westmeath_independant", price = "1.90", frequency = "daily"
        //Expected Output: Publication Object created with id = 0 ,"westmeath_independant", price= "1.90", frequency = "daily"

        public void testPublication001() {

        //Create the Publication
        try {

            //Call method under test
            Publication publicationObj = new Publication("westmeath_independant", "1.90", "daily");

            // Use getters to check for object creation
            assertEquals(0, publicationObj.getId());
            assertEquals("westmeath_independant", publicationObj.getName());
            assertEquals("1.90", publicationObj.getPrice());
            assertEquals("daily", publicationObj.getFrequency());

        } catch (PublicationExceptionHandler e) {
            //fail("Exception not expected");
        }

    }

        //Test #: 2
        //Test Objective: To catch an invalid publication name
        //Inputs: firstname = "Wdsd"
        //Expected Output: Exception Message: "Publication Name does not meet minimum length requirements"

        public void testValidateName001() {

        try {

            //Call method under test
           Publication.validateName("Wdsd");
           fail("Exception expected");
        }
        catch (PublicationExceptionHandler e) {
            assertEquals("Publication Name does not meet minimum length requirements", e.getMessage());

        }
    }
    }






