package src;

public class Invoice {

    private int id;
    private String customer_id;
    private String price;
    private String ordDetails;
    private String payment_type;
    private String Customer_id;

    void setId(int bill_id) {id = bill_id; }
    void setCustomer_id(String customer_id) {Customer_id = customer_id; }
    void setPrice(String bill_price) {price = bill_price; }
    void setOrdDetails(String publication_id) {ordDetails = publication_id; }
    void setPaymentType(String bill_paymentType) {payment_type = bill_paymentType; }

    int getId() {
        return id;
    }

    String getCusDetails() {
        return customer_id;
    }

    String getPrice() {
        return price;
    }

    String getOrdDetails() {
        return ordDetails;
    }

    String getPaymentType() {
        return payment_type;
    }

    public Invoice(String bill_cusDetails, String bill_price, String bill_ordDetails, String bill_paymentType) throws InvoiceExceptionHandler{

        id = 0;

        validateCusDetails(bill_cusDetails);
        validatePrice(bill_price);
        validateOrdDetails(bill_ordDetails);
        validatePaymentType(bill_paymentType);


        customer_id = bill_cusDetails;
        price = bill_price;
        ordDetails = bill_ordDetails;
        payment_type = bill_paymentType;
    }

    public static void validateCusDetails (String bill_cusDetails) throws InvoiceExceptionHandler {
        if (bill_cusDetails.isEmpty() || bill_cusDetails.isBlank())
            throw new InvoiceExceptionHandler("Please enter the customer details.");
        //else if (bill_cusDetails.length() < 2 && bill_cusDetails.length() > 40)
          //  throw new InvoiceExceptionHandler("Invalid customer details");
    }

    public static void validatePrice ( String bill_price) throws InvoiceExceptionHandler {

        if (bill_price.isEmpty())

            throw new InvoiceExceptionHandler("Please enter a price");
    }

    public static void validateOrdDetails (String bill_ordDetails) throws InvoiceExceptionHandler {
        if (bill_ordDetails.isEmpty() || bill_ordDetails.isBlank())
            throw new InvoiceExceptionHandler("Please enter the order details.");
       // else if (bill_ordDetails.length() < 2 && bill_ordDetails.length() > 40)
          //  throw new InvoiceExceptionHandler("Invalid order details");
    }

    public static void validatePaymentType (String bill_paymentType) throws InvoiceExceptionHandler {
        if (bill_paymentType.isEmpty() || bill_paymentType.isBlank())
            throw new InvoiceExceptionHandler("Please enter your payment type.");
        else if (bill_paymentType.length() < 2 && bill_paymentType.length() > 40)
            throw new InvoiceExceptionHandler("Invalid payment type");
    }
}
