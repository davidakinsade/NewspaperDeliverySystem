package src;

public class Publication
{
    private int pub_id;
    private String name;
    private String price;
    private String frequency;



    void setId(int publication_id) { pub_id = publication_id;}
    void setName(String publication_name) { name = publication_name; }
    void setPrice(String publication_price) { price = publication_price; }
    void setFrequency(String publication_frequency) { frequency = publication_frequency; }

    int getId() {
        return pub_id;
    }

    String getName() {
        return name;
    }

    String getPrice() {
        return price;
    }

    String getFrequency() {
        return frequency;
    }

    //Facing problems with the exception handler

    public Publication(String publication_name, String publication_price, String publication_frequency) throws PublicationExceptionHandler
    {

        pub_id = 0;

        try {

            validateName(publication_name);
            validatePrice(publication_price);
            validateFrequency(publication_frequency);


        } catch (PublicationExceptionHandler e) {

            throw e;
        }
        name = publication_name;
        price = publication_price;
        frequency = publication_frequency;
    }


    public static void validateName (String publication_name) throws PublicationExceptionHandler {

        if (publication_name.isEmpty() || publication_name.isBlank())
            throw new PublicationExceptionHandler("Please enter publication name");
        else if (publication_name.length() < 2 && publication_name.length() > 40)
            throw new PublicationExceptionHandler("Invalid publication name");
    }


    public static void validatePrice ( String publication_price) throws PublicationExceptionHandler {

        if (publication_price.isEmpty())

            throw new PublicationExceptionHandler("Please enter publication price");
    }


    public static void validateFrequency (String publication_frequency) throws PublicationExceptionHandler {

        if (publication_frequency.isEmpty())
            throw new PublicationExceptionHandler("Please enter publication frequency");
        else if (publication_frequency.length() < 2 && publication_frequency.length() > 40)
            throw new PublicationExceptionHandler("Invalid publication frequency");


    }

}
