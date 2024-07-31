package src;

public class Admin {

    private int userId;
    private String admin_username;
    private String admin_password;
    private String admin_email;
    private String ad_phone_number;
    private String admin_firstName;
    private String admin_surname;
    private String admin_level;


    void setId(int admin_id) { userId = admin_id; }
    void setUsername(String adminName) { admin_username = adminName; }
    void setPassword(String adminPassword) { admin_password = adminPassword; }
    void setEmail(String adminEmail) { admin_email = adminEmail; }
    void setPhone_number(String adminPhoneNumber) { ad_phone_number = adminPhoneNumber; }
    void setFirstName(String adminFirstname) { admin_firstName = adminFirstname; }
    void setSurname(String adminSurname) { admin_surname = adminSurname; }
    void setLevel(String adminLevel) { admin_level = adminLevel; }

    int getId() {
        return userId;
    }
    String getUsername() {
        return admin_username;
    }
    String getPassword() {
        return admin_password;
    }
    String getEmail() {
        return admin_email;
    }
    String getPhone_number() {
        return ad_phone_number;
    }
    String getFirstName() {
        return admin_firstName;
    }
    String getSurname() {
        return admin_surname;
    }
    String getLevel() { return admin_level; }

    public Admin(String username,String password,String email,String admin_phone_number, String firstName, String surname, String level ) throws  AdminExceptionHandler {
        userId = 0;

        // Validate Input

        validateUsername(username);
        validatePassword(password);
        validateEmail(email);
        validatePhoneNumber(admin_phone_number);
        validateName(firstName);
        validateSurname(surname);
        validateLevel(level);

        // Set Attributes
        admin_username = username;
        admin_password = password;
        admin_email = email;
        ad_phone_number = admin_phone_number;
        admin_firstName = firstName;
        admin_surname = surname;
        admin_level = level;

    }

    public static void validateUsername(String username) throws AdminExceptionHandler {

        //Agree Formating Rules on "Admin Name"
        //E.G. Name String must be a minimum of 2 characters and a maximum of 50 characters

        if (username.isBlank() || username.isEmpty())
            throw new AdminExceptionHandler("Admin Name CAN NOT BE EMPTY");
        else if (username.length() < 2)
            throw new AdminExceptionHandler("Admin Name does not meet minimum length requirements");
        else if (username.length() > 20)
            throw new AdminExceptionHandler("Admin Name too long");

    }
    public static void validatePassword(String password) throws AdminExceptionHandler {

        //Agree Formating Rules on "Admin Password"
        //E.G. Name String must be a minimum of 5 characters and a maximum of 60 characters

        if (password.isBlank() || password.isEmpty())
            throw new AdminExceptionHandler("Admin password NOT specified");
        else if (password.length() < 3)
            throw new AdminExceptionHandler("Admin password does not meet minimum length requirements");
        else if (password.length() > 20)
            throw new AdminExceptionHandler("Admin password too long");

    }
    public static void validateEmail(String email) throws AdminExceptionHandler {

        //Agree Formating Rules on "Admin email"
        //E.G. Name String must be a minimum of 5 characters and a maximum of 60 characters

        if (email.isBlank() || email.isEmpty())
            throw new AdminExceptionHandler("Admin Email NOT specified");
        else if (email.length() < 5)
            throw new AdminExceptionHandler("Admin Email does not meet minimum length requirements");
        else if (email.length() > 20)
            throw new AdminExceptionHandler("Admin Email exceeds maximum length requirements");

    }
    public static void validatePhoneNumber (String phone_number) throws AdminExceptionHandler {

        //Agree Formating Rules on "Admin phone"
        //E.G. Name String must be a minimum of 5 characters and a maximum of 60 characters

        if (phone_number.isBlank() || phone_number.isEmpty()) {
            throw new AdminExceptionHandler("Admin phone number is not valid");
        } else if (phone_number.length() < 2)
            throw new AdminExceptionHandler("Admin phone number does not meet minimum length requirements");
        else if (phone_number.length() > 15)
            throw new AdminExceptionHandler("Admin phone number exceeds maximum length requirements");
//        else if (phone_number.length() > 0)
//            throw new AdminExceptionHandler("Admin phone number does not exceeds maximum length requirements");


    }
    public static void validateName(String firstName) throws AdminExceptionHandler {

        //Agree Formating Rules on "Admin Name"
        //E.G. Name String must be a minimum of 5 characters and a maximum of 60 characters

        if (firstName.isBlank() || firstName.isEmpty()){
            throw new AdminExceptionHandler("Admin Name CAN NOT BE EMPTY");}
        else if (firstName.length() < 5)
            throw new AdminExceptionHandler("Admin name does not meet minimum length requirements");
        else if (firstName.length() > 20)
            throw new AdminExceptionHandler("Admin Name to long");
    }
    public static void validateSurname(String surname) throws AdminExceptionHandler {

        //Agree Formating Rules on "Admin surname"
        //E.G. Name String must be a minimum of 5 characters and a maximum of 60 characters

        if (surname.isBlank() || surname.isEmpty()){
            throw new AdminExceptionHandler("Admin Surname CAN NOT BE EMPTY");}
        else if (surname.length() < 2)
            throw new AdminExceptionHandler("Admin Surname does not meet minimum length requirements");
        else if (surname.length() > 20)
            throw new AdminExceptionHandler("Admin surname to long");
    }
    public static void validateLevel(String level) throws AdminExceptionHandler {

        //Agree Formating Rules on "Admin level"
        //E.G. Name String must be a minimum of 5 characters and a maximum of 60 characters

        if (level.isBlank() || level.isEmpty())
            throw new AdminExceptionHandler("Admin Level CAN NOT BE EMPTY");
        else if (level.length() < 2)
            throw new AdminExceptionHandler("Admin Level does not meet minimum length requirements");
        else if (level.length() > 6)
            throw new AdminExceptionHandler("Admin level to long enter 'admin' or 'user'");

    }

}

