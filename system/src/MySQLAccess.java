package src;

import java.sql.*;
import java.util.Scanner;


public class MySQLAccess {

    private final Connection connect;
    private Statement statement;
    //static Statement stmt = null;
    static Scanner in = new Scanner(System.in);

    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    final private String host ="localhost:3306";
    final private String user = "root";
    final private String password = "28102000";


    public MySQLAccess() throws Exception {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/newsagency_data_baseSQL?useTimezone=true&serverTimezone=UTC";
            connect = DriverManager.getConnection(url, "root", "28102000");
            statement = connect.createStatement();

            /*//Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Setup the connection with the DB
            connect = DriverManager.getConnection("jdbc:mysql://" + host + "/newsagency_data_baseSQL?" + "user=" + user + "&password=" + password);*/
        }
        catch (Exception e) {
            throw e;
        }


    }

    public boolean insertCustomerDetailsAccount(Customer c) {

        boolean insertSucessfull = true;

        //Add Code here to call embedded SQL to insert Customer into DB

        try {

            //Create prepared statement to issue SQL query to the database
            preparedStatement = connect.prepareStatement("insert into newsagency_data_baseSQL.customer values (default, ?, ?, ?, ?, ?, ?, ?)");
            preparedStatement.setString(1, c.getName());
            preparedStatement.setString(2, c.getSurname());
            preparedStatement.setString(3, c.getPhoneNumber());
            preparedStatement.setString(4, c.getCustomerAge());
            preparedStatement.setString(5, c.getCustomerTown());
            preparedStatement.setString(6, c.getCustomerAddress());
            preparedStatement.setString(7, c.getCustomerArea());



            //preparedStatement.setString(3, c.getPhoneNumber());
            preparedStatement.executeUpdate();


        }
        catch (SQLException  e) {
            insertSucessfull = false;
        }

        return insertSucessfull;

    }// end insertCustomerDetailsAccount

    public ResultSet retrieveAllCustomerAccounts() {

        //Add Code here to call embedded SQL to view Customer Details

        try {
            statement = connect.createStatement();
            resultSet = statement.executeQuery("Select * from newsagency_data_baseSQL.customer");

        }
        catch (Exception e) {
            resultSet = null;
        }
        return resultSet;
    }

    public boolean deleteCustomerById(int customer_id) {

        boolean deleteSucessfull = false;

        //Add Code here to call embedded SQL to insert Customer into DB

        try {

            //Create prepared statement to issue SQL query to the database
            if (customer_id == -99)
            {
                //Delete all entries in Table
                preparedStatement = connect.prepareStatement("delete from newsagency_data_baseSQL.customer");
                deleteSucessfull = true;
            }
            else
            {
                //Delete a particular Customer
                preparedStatement = connect.prepareStatement("delete from newsagency_data_baseSQL.customer where customer_id = " + customer_id);

                //preparedStatement = connect.prepareStatement("delete from newsagency_data_baseSQL.customer where customer_id = ?");
                //preparedStatement.setInt(1, customer_id);
//
                preparedStatement.executeUpdate();
                deleteSucessfull = true;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            deleteSucessfull = false;
        }

        return deleteSucessfull;

    }

    public boolean insertPublicationDetailsAccount(Publication p) {

        boolean insertSucessfull = true;

        try {

            preparedStatement = connect.prepareStatement("insert into newsagency_data_baseSQL.publication values (default, ?, ?, ?)");
            preparedStatement.setString(1, p.getName());
            preparedStatement.setString(2, p.getPrice());
            preparedStatement.setString(3, p.getFrequency());

            preparedStatement.executeUpdate();
        }
        catch (SQLException e) {
            insertSucessfull = false;
        }

        return insertSucessfull;

    }

    public ResultSet retrieveAllPublicationAccounts() {

        try {
            statement = connect.createStatement();
            resultSet = statement.executeQuery("Select * from newsagency_data_baseSQL.publication");
        }
        catch (Exception e) {
            resultSet = null;

        }
        return resultSet;
    }

    /*public ResultSet retrieveAllCustomerAccounts() {

        //Add Code here to call embedded SQL to view Customer Details

        try {
            statement = connect.createStatement();
            resultSet = statement.executeQuery("Select * from newsagency_data_baseSQL.customer");

        }
        catch (Exception e) {
            resultSet = null;
        }
        return resultSet;
    }*/

    public boolean deletePublicationById(int publication_id) {
        boolean deleteSucessfull;

        try{
            if (publication_id == -99)
            {
                preparedStatement = connect.prepareStatement("delete from newsagency_data_baseSQL.publication");
                deleteSucessfull = true;
            }
            else
            {
                preparedStatement = connect.prepareStatement("delete from newsagency_data_baseSQL.publication where publication_id = " + publication_id);

                preparedStatement.executeUpdate();
                deleteSucessfull = true;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            deleteSucessfull = false;
        }

        return deleteSucessfull;
    }

    public ResultSet retrieveAllAdmins() {

        //Add Code here to call embedded SQL to view Admin Details

        try {
            statement = connect.createStatement();
            resultSet = statement.executeQuery("Select * from newsagency_data_baseSQL.admin");

        }
        catch (Exception e) {
            resultSet = null;
        }
        return resultSet;
    }

    // adding Admin user
    public boolean insertAdminDetailsAccount(Admin c) {

        boolean insertSucessfull = true;

        //Add Code here to call embedded SQL to insert Customer into DB

        try {

            //Create prepared statement to issue SQL query to the database
            preparedStatement = connect.prepareStatement("insert into newsagency_data_baseSQL.admin values (default, ?, ?, ?, ?, ?, ?, ?)");
            preparedStatement.setString(1, c.getUsername());
            preparedStatement.setString(2, c.getPassword());
            preparedStatement.setString(3, c.getEmail());
            preparedStatement.setString(4, c.getPhone_number());
            preparedStatement.setString(5, c.getFirstName());
            preparedStatement.setString(6, c.getSurname());
            preparedStatement.setString(7, c.getLevel());



            //preparedStatement.setString(3, c.getPhoneNumber());
            preparedStatement.executeUpdate();


        }
        catch (SQLException  e) {
            insertSucessfull = false;
        }

        return insertSucessfull;

    }// end insertAdminDetailsAccount
    public boolean deleteAdminByID(int admin_id) {

        boolean deleteSuccessful = false;

        //Add Code here to call embedded SQL to insert Customer into DB

        try {

            //Create prepared statement to issue SQL query to the database
            if (admin_id == -99)
            {
                //Delete all entries in Table
                preparedStatement = connect.prepareStatement("delete from newsagency_data_baseSQL.admin");
            }
            else
            {
                //Delete a particular Admin
                preparedStatement = connect.prepareStatement("delete from newsagency_data_baseSQL.admin where admin_id = " + admin_id);

                //preparedStatement = connect.prepareStatement("delete from newsagency_data_baseSQL.customer where customer_id = ?");
                //preparedStatement.setInt(1, customer_id);
//
                preparedStatement.executeUpdate();
            }
            deleteSuccessful = true;
        }
        catch (Exception e) {
            e.printStackTrace();
            deleteSuccessful = false;
        }

        return deleteSuccessful;

    }


//-----------------------------------------------------------------------------------------------------------


    public boolean insertAvailableStock(Stock c) {

        boolean insertSucessfull = true;

        //Add Code here to call embedded SQL to insert Stock into DB

        try {

            //Create prepared statement to issue SQL query to the database
            preparedStatement = connect.prepareStatement("insert into newsagency_data_baseSQL.stock values (default, ?)");
            preparedStatement.setString(1, c.getName());




            //preparedStatement.setString(3, c.getPhoneNumber());
            preparedStatement.executeUpdate();


        }
        catch (SQLException  e) {
            insertSucessfull = false;
        }

        return insertSucessfull;

    }// end insertStockDetails

    public boolean deleteStockById(int stock_id) {
        boolean deleteSucessfull;

        try{
            if (stock_id == -99)
            {
                preparedStatement = connect.prepareStatement("delete from newsagency_data_baseSQL.stock");
            }
            else
            {
                preparedStatement = connect.prepareStatement("delete from newsagency_data_baseSQL.stock where stock_id = " + stock_id);

                preparedStatement.executeUpdate();
            }
            deleteSucessfull = true;
        }
        catch (Exception e) {
            e.printStackTrace();
            deleteSucessfull = false;
        }

        return deleteSucessfull;
    }
    public ResultSet retrieveAllStockAccounts() {

        try {
            statement = connect.createStatement();
            resultSet = statement.executeQuery("Select * from newsagency_data_baseSQL.stock");

        }
        catch (Exception e) {
            resultSet = null;

        }
        return resultSet;
    }
    //-------------------------------------------------------------------------------------------------


    public boolean insertInvoiceDetailsAccount(Invoice i) {

        boolean insertSucessfull = true;

        //Add Code here to call embedded SQL to insert Invoice into DB

        try {

            //Create prepared statement to issue SQL query to the database
            preparedStatement = connect.prepareStatement("insert into newsagency_data_baseSQL.invoice values (default, ?, ?, ?, ?)");
            preparedStatement.setString(1, i.getCusDetails());
            preparedStatement.setString(2, i.getPrice());
            preparedStatement.setString(3, i.getOrdDetails());
            preparedStatement.setString(4, i.getPaymentType());

            //preparedStatement.setString(3, i.getOrdDetails());
            preparedStatement.executeUpdate();


        }
        catch (SQLException  e) {
            insertSucessfull = false;
        }

        return insertSucessfull;

    }// end insertCustomerDetailsAccount

    public ResultSet retrieveAllInvoiceAccounts() {

        try {
            statement = connect.createStatement();
            resultSet = statement.executeQuery("Select * from newsagency_data_baseSQL.invoice");
        }
        catch (Exception e) {
            resultSet = null;

        }
        return resultSet;
    }

    /*public ResultSet retrieveAllInvoiceAccounts() {

        //Add Code here to call embedded SQL to view Invoice Details

        try {
            statement = connect.createStatement();
            resultSet = statement.executeQuery("Select * from newsagency_data_baseSQL.invoice");

        }
        catch (Exception e) {
            resultSet = null;
        }
        return resultSet;
    }*/

    public boolean deleteInvoiceById(int bill_id) {
        boolean deleteSucessfull;

        try{
            if (bill_id == -99)
            {
                preparedStatement = connect.prepareStatement("delete from newsagency_data_baseSQL.invoice");
                deleteSucessfull = true;
            }
            else
            {
                preparedStatement = connect.prepareStatement("delete from newsagency_data_baseSQL.invoice where bill_id = " + bill_id);

                preparedStatement.executeUpdate();
                deleteSucessfull = true;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            deleteSucessfull = false;
        }

        return deleteSucessfull;
    }


//--------------------------------------------------------------------------------------------------------

    public boolean insertDeliveryDetailsAccount(Delivery d) {

        boolean insertSucessfull = true;

        //Add Code here to call embedded SQL to insert Delivery into DB

        try {

            //Create prepared statement to issue SQL query to the database
            preparedStatement = connect.prepareStatement("insert into newsagency_data_baseSQL.delivery values (default, ?, ?, ?, ?)");
            preparedStatement.setString(1, d.getCustomerAddress());
            preparedStatement.setString(2, d.getProducts());
            preparedStatement.setString(3, d.getTime());
            preparedStatement.setString(4, d.getOrder());



            //preparedStatement.setString(3, c.getTime());
            preparedStatement.executeUpdate();


        }
        catch (SQLException  e) {
            insertSucessfull = false;
        }

        return insertSucessfull;

    }// end insertDeliveryDetailsAccount


    public ResultSet retrieveAllDeliveryAccounts() {

        try {
            statement = connect.createStatement();
            resultSet = statement.executeQuery("Select * from newsagency_data_baseSQL.delivery");
        }
        catch (Exception e) {
            resultSet = null;

        }
        return resultSet;
    }

    public boolean deleteDeliveryById(int delivery_id) {
        boolean deleteSucessfull;

        try{
            if (delivery_id == -99)
            {
                preparedStatement = connect.prepareStatement("delete from newsagency_data_baseSQL.delivery");
                deleteSucessfull = true;
            }
            else
            {
                preparedStatement = connect.prepareStatement("delete from newsagency_data_baseSQL.delivery where delivery_id = " + delivery_id);

                preparedStatement.executeUpdate();
                deleteSucessfull = true;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            deleteSucessfull = false;
        }

        return deleteSucessfull;
    }


//--------------------------------------------------------------------------------------------------------------

}// end Class

