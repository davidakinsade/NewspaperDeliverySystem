package src;

public class Customer {

    private int id;
    private String customerName;
    private String customerSurname;
    private String customerTown;
    private String customerAge;
    private String customerAddress;
    private String customerArea;
    private String phoneNumber;

    void setId(int customer_id) { id = customer_id; }
    void setName(String firstName) { customerName = firstName; }
    void setSurname(String surName) { customerSurname = surName; }
    void setPhoneNumber(String custPhone) { phoneNumber = custPhone; }
    void setCustomerAge(String age) { customerAge = age; }
    void setCustomerTown(String town) { customerTown = town; }
    void setCustomerAddress(String address) { customerAddress = address; }
    void setCustomerArea(String area) { customerArea = area; }

    //void setAddress(String custAddr) { address = custAddr; }


    int getId() {
        return id;
    }

    String getName() {
        return customerName;
    }
    String getSurname() {
        return customerSurname;
    }

    String getCustomerAge() {
        return customerAge;
    }

    String getCustomerTown() {
        return customerTown;
    }

    String getCustomerAddress() {
        return customerAddress;
    }

    String getCustomerArea() {
        return customerArea;
    }

    String getPhoneNumber() { return phoneNumber; }

    public Customer(String firstName,String surName,String custPhone,String age, String town, String address, String area ) throws CustomerExceptionHandler  {
        // String custPhone will be added later
        id = 0;

        // Validate Input

        validateName(firstName);
        validateSurname(surName);
        validatePhoneNumber(custPhone);
        validateAge(age);
        validateTown(town);
        validateAddress(address);
        validateArea(area);


        // Set Attributes
        customerName = firstName;
        customerSurname = surName;
        phoneNumber = custPhone;
        customerTown = town;
        customerAge = age;
        customerAddress = address;
        customerArea = area;
        }

    public static void validateName(String firstName) throws CustomerExceptionHandler {

        //Agree Formating Rules on "Customer Name"
        //E.G. Name String must be a minimum of 2 characters and a maximum of 20 characters

        if (firstName.isBlank() || firstName.isEmpty())
            throw new CustomerExceptionHandler("Customer Name CAN NOT BE EMPTY");
        else if (firstName.length() < 2)
            throw new CustomerExceptionHandler("Customer Name does not meet minimum length requirements");
//        else if (firstName == "-1")
//            throw new CustomerExceptionHandler("Customer Name does not meet minimum length requirements");
        else if (firstName.length() > 20)
            throw new CustomerExceptionHandler("Customer Name does not exceeds maximum length requirements");

    }


    public static void validateSurname(String customerSurname) throws CustomerExceptionHandler {

        //Agree Formating Rules on "Customer Surname"
        //E.G. Name String must be a minimum of 3 characters and a maximum of 20 characters

        if (customerSurname.isBlank() || customerSurname.isEmpty())
            throw new CustomerExceptionHandler("Customer Surname CAN NOT BE EMPTY");
        else if (customerSurname.length() < 3)
            throw new CustomerExceptionHandler("Customer Surname does not meet minimum length requirements");
        else if (customerSurname.length() > 20)
            throw new CustomerExceptionHandler("Customer Surname exceeds maximum length requirements");

    }

    public static void validateTown(String customerTown) throws CustomerExceptionHandler {

        //Agree Formating Rules on "Customer Town"
        //E.G. Name String must be a minimum of 5 characters and a maximum of 20 characters

        if (customerTown.isBlank() || customerTown.isEmpty())
            throw new CustomerExceptionHandler("Customer Town NOT specified");
        else if (customerTown.length() < 5)
            throw new CustomerExceptionHandler("Customer Town does not meet minimum length requirements");
        else if (customerTown.length() > 20)
            throw new CustomerExceptionHandler("Customer Town exceeds maximum length requirements");

    }

    public static void validateAge (String customerAge) throws CustomerExceptionHandler {

        //Agree Formating Rules on "Customer Age"
        //E.G. Name String must be a minimum of 2 characters and a maximum of 3 characters

        if (customerAge.isBlank() || customerAge.isEmpty()) {
            throw new CustomerExceptionHandler("Customer Age is not valid");
        } else if (customerAge.length() < 2)
            throw new CustomerExceptionHandler("Customer Age does not meet minimum requirements");
        else if (customerAge.length() > 3)
            throw new CustomerExceptionHandler("Customer Age exceeds maximum length requirements");

    }

    public static void validateAddress(String customerAddress) throws CustomerExceptionHandler {

        //Agree Formating Rules on "Customer Address"
        //E.G. Name String must be a minimum of 5 characters and a maximum of 30 characters

        if (customerAddress.isBlank() || customerAddress.isEmpty())
            throw new CustomerExceptionHandler("Customer Address NOT specified");
        else if (customerAddress.length() < 5)
            throw new CustomerExceptionHandler("Customer Address can not be less then 5 characters");
        else if (customerAddress.length() > 30)
            throw new CustomerExceptionHandler("Customer Address exceeds maximum length requirements");
        // need to check for empty string

    }

    public static void validateArea(String customerArea) throws CustomerExceptionHandler {

        //Agree Formating Rules on "Customer Area"
        //E.G. Name String must be a minimum of 3 characters and a maximum of 10 characters

        if (customerArea.isBlank() || customerArea.isEmpty())
            throw new CustomerExceptionHandler("Customer Area NOT specified");
        else if (customerArea.length() < 3)
            throw new CustomerExceptionHandler("Customer Area does not meet minimum length requirements");
        else if (customerArea.length() > 10)
            throw new CustomerExceptionHandler("Customer Area exceeds maximum length requirements");

    }


    public static void validatePhoneNumber(String phoneNumber) throws CustomerExceptionHandler {

        //Agree Formating Rules on "Customer PhoneNumber"
        //E.G. Name String must be a minimum of 5 characters and a maximum of 20 characters

        if (phoneNumber.isBlank() || phoneNumber.isEmpty())
            throw new CustomerExceptionHandler("Customer PhoneNumber NOT specified");
        else if (phoneNumber.length() < 5)
            throw new CustomerExceptionHandler("Customer PhoneNumber does not meet minimum length requirements");
        else if (phoneNumber.length() > 20)
            throw new CustomerExceptionHandler("Customer PhoneNumber exceeds maximum length requirements");

    }


}

