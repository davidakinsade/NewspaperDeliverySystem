package src;

public class Delivery {

    private int id;
    private String customerAddress;
    private String products;
    private String time;
    private String order; //kilometres


    void setId(int delivery_id) {id = delivery_id; }
    void setCustomerAddress(String delivery_customerAddress) {customerAddress = delivery_customerAddress; }
    void setProducts(String delivery_products) {products = delivery_products; }
    void setTime(String delivery_time) {time = delivery_time;}
    void setOrder(String delivery_order) {order = delivery_order;}

     int getId() {
        return id;
    }

    String getCustomerAddress() {
        return customerAddress;
    }

    String getProducts() {
        return products;
    }

     String getTime() {
        return time;
    }

     String getOrder() {
        return order;
    }

    public Delivery(String delivery_customerAddress, String delivery_products, String delivery_time, String delivery_order) throws DeliveryExceptionHandler
    {

        id = 0;

        try {

            validateCustomerAddress(delivery_customerAddress);
            validateProducts(delivery_products);
            validateTime(delivery_time);
            validateOrder(delivery_order);


        } catch (DeliveryExceptionHandler e) {

            throw e;
        }
        customerAddress = delivery_customerAddress;
        products = delivery_products;
        time = delivery_time;
        order = delivery_order;
    }

    public static void validateCustomerAddress (String delivery_customerAddress) throws DeliveryExceptionHandler {

        if (delivery_customerAddress.isEmpty() || delivery_customerAddress.isBlank())
            throw new DeliveryExceptionHandler("Please enter the customer's address or EIR code");
        else if (delivery_customerAddress.length() < 5)
            throw new DeliveryExceptionHandler("Customer Address can not be less then 5 characters");
        else if (delivery_customerAddress.length() > 50)
            throw new DeliveryExceptionHandler("Customer Address exceeds maximum length requirements");
        // need to check for empty string
        else if (!delivery_customerAddress.contains("N37"))
            throw new DeliveryExceptionHandler("Customer Eircode routing key should contain N37 for Westmeath area");
    }

    public static void validateProducts (String delivery_products) throws DeliveryExceptionHandler {

        if (delivery_products.isEmpty() || delivery_products.isBlank())
            throw new DeliveryExceptionHandler("Please enter the products");
        else if (delivery_products.length() < 5)
            throw new DeliveryExceptionHandler("Product name can not be less then 5 characters");
        else if (delivery_products.length() > 50)
            throw new DeliveryExceptionHandler("Product name exceeds maximum length requirements");

    }

    public static void validateTime (String delivery_time) throws DeliveryExceptionHandler {

        if (delivery_time.isEmpty() || delivery_time.isBlank())
            throw new DeliveryExceptionHandler("Please enter the delivery time");
        else if (delivery_time.length() < 2)
            throw new DeliveryExceptionHandler("Time of delivery can not be less then 2 characters");
        else if (delivery_time.length() > 10)
            throw new DeliveryExceptionHandler("Time of delivery exceeds maximum length requirements");
        //else if (!delivery_time.contains("am") || !delivery_time.contains("pm"))
          //  throw new DeliveryExceptionHandler("The time should contain am or pm to specify the hours");


    }

    public static void validateOrder (String delivery_order) throws DeliveryExceptionHandler {

        if (delivery_order.isEmpty() || delivery_order.isBlank())
            throw new DeliveryExceptionHandler("Please enter the delivery order");
        else if (delivery_order.length() < 2)
            throw new DeliveryExceptionHandler("Distance can not be less then 5 characters");
        else if (delivery_order.length() > 10)
            throw new DeliveryExceptionHandler("Distance exceeds maximum length requirements");
        else if (!delivery_order.contains("km"))
            throw new DeliveryExceptionHandler("The distance should contain km to show us how far we have to travel to deliver");


    }


}
