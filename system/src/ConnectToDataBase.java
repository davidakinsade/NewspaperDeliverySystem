package src;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ConnectToDataBase {

    private static void listCustomerFunctionalityAvailable() {

        //Present Customer with Functionality Options

        System.out.println(" ");
        System.out.println("=============================================");
        System.out.println("Please choose ONE of the following options:");
        System.out.println("1. Create Customer Account");
        System.out.println("2. View ALL Customer Records");
        System.out.println("3. Delete Customer Record by ID");
        System.out.println("=============================================");

        System.out.println("4. Create A Publication");
        System.out.println("5. View ALL Publication Records");
        System.out.println("6. Delete Publication Record by ID");
        System.out.println("=============================================");

        System.out.println("7. Create An Invoice");
        System.out.println("8. View ALL Invoice Records");
        System.out.println("9. Delete Invoice Record by ID");
        System.out.println("=============================================");

        System.out.println("10. View ALL Admin Records");
        System.out.println("11. Create Admin Account");
        System.out.println("12. Delete Admin Record by ID or '-99' deletes all");
        System.out.println("=============================================");
        //System.out.println("13. Log In to Admin Account");

        System.out.println("13. Create A available stock");
        System.out.println("14. Delete A available stock");
        System.out.println("15. View ALL Stock Records");
        System.out.println("=============================================");

        System.out.println("16. Create a delivery route");
        System.out.println("17. View delivery records");
        System.out.println("18. Remove a delivery route by id");

        System.out.println("=============================================");
        System.out.println("99. Close the NewsAgent Application");

        System.out.println(" ");

    }
    private static boolean printCustomerTable(ResultSet rs) throws Exception {

        //Print The Contents of the Full Customer Table

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Table: " + rs.getMetaData().getTableName(1));
        for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
            System.out.printf("%30s",rs.getMetaData().getColumnName(i));
        }
        System.out.println();
        while (rs.next()) {
            int customer_id = rs.getInt("customer_id");
            String name = rs.getString("firstName");
            String surName = rs.getString("surName");
            String phone_number = rs.getString("phone_number");
            String age = rs.getString("age");
            String town = rs.getString("town");
            String address = rs.getString("address");
            String area = rs.getString("area");

            System.out.printf("%30s", customer_id);
            System.out.printf("%30s", name);
            System.out.printf("%30s", surName);
            System.out.printf("%30s", phone_number);
            System.out.printf("%30s", age);
            System.out.printf("%30s", town);

            System.out.printf("%30s", address);
            System.out.printf("%30s", area);


            System.out.println();
        }// end while
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

        return true;
    }
    private static boolean printAdminTable(ResultSet rSet2) throws SQLException{
        //Print The Contents of the Full Admin Table

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Table: " + rSet2.getMetaData().getTableName(1));
        for (int i = 1; i <= rSet2.getMetaData().getColumnCount(); i++) {
            System.out.printf("%30s",rSet2.getMetaData().getColumnName(i));
        }
        System.out.println();
        while (rSet2.next()) {
            int admin_id = rSet2.getInt("admin_id");
            String adminName = rSet2.getString("adminName");
            String adminPassword = rSet2.getString("adminPassword");
            String adminEmail = rSet2.getString("adminEmail");
            String adminPhoneNumber = rSet2.getString("adminPhoneNumber");
            String adminFirstname = rSet2.getString("adminFirstname");
            String adminSurname = rSet2.getString("adminSurname");
            String adminLevel = rSet2.getString("adminLevel");

            System.out.printf("%30s", admin_id);
            System.out.printf("%30s", adminName);
            System.out.printf("%30s", adminPassword);
            System.out.printf("%30s", adminEmail);
            System.out.printf("%30s", adminPhoneNumber);
            System.out.printf("%30s", adminFirstname);
            System.out.printf("%30s", adminSurname);
            System.out.printf("%30s", adminLevel);


            System.out.println();
        }// end while
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

        return true;
    }
    private static boolean printPublicationTable(ResultSet rSet1) throws SQLException {
        //Print The Contents of the Full Customer Table

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Table: " + rSet1.getMetaData().getTableName(1));
        for (int i = 1; i <= rSet1.getMetaData().getColumnCount(); i++) {
            System.out.printf("%30s",rSet1.getMetaData().getColumnName(i));
        }
        System.out.println();
        while (rSet1.next()) {
            int publication_id = rSet1.getInt("publication_id");
            String publication_name = rSet1.getString("publication_name");
            String publication_price = rSet1.getString("publication_price");
            String publication_frequency = rSet1.getString("publication_frequency");

            System.out.printf("%30s", publication_id);
            System.out.printf("%30s", publication_name);
            System.out.printf("%30s", publication_price);
            System.out.printf("%30s", publication_frequency);


            System.out.println();
        }// end while
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

        return true;

    }

    private static boolean printInvoiceTable(ResultSet rSet1) throws SQLException {
        //Print The Contents of the Full Customer Table

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Table: " + rSet1.getMetaData().getTableName(1));
        for (int i = 1; i <= rSet1.getMetaData().getColumnCount(); i++) {
            System.out.printf("%30s",rSet1.getMetaData().getColumnName(i));
        }
        System.out.println();
        while (rSet1.next()) {
            int bill_id = rSet1.getInt("bill_id");
            String customer_id = rSet1.getString("customer_id");
            String price = rSet1.getString("price");
            String publication_id = rSet1.getString("publication_id");
            String payment_type = rSet1.getString("payment_type");

            System.out.printf("%30s", bill_id);
            System.out.printf("%30s", customer_id);
            System.out.printf("%30s", price);
            System.out.printf("%30s", publication_id);
            System.out.printf("%30s", payment_type);


            System.out.println();
        }// end while
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

        return true;

    }
    private static boolean printStockTable(ResultSet rSet1) throws SQLException {
        //Print The Contents of the Full Customer Table

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Table: " + rSet1.getMetaData().getTableName(1));
        for (int i = 1; i <= rSet1.getMetaData().getColumnCount(); i++) {
            System.out.printf("%30s",rSet1.getMetaData().getColumnName(i));
        }
        System.out.println();
        while (rSet1.next()) {
            int stock_id = rSet1.getInt("stock_id");
            String available_stock = rSet1.getString("available_stock");


            System.out.printf("%30s", stock_id);
            System.out.printf("%30s", available_stock);



            System.out.println();
        }// end while
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

        return true;
    }

    private static boolean printDeliveryTable(ResultSet rSet1) throws SQLException {
        //Print The Contents of the Full Customer Table

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Table: " + rSet1.getMetaData().getTableName(1));
        for (int i = 1; i <= rSet1.getMetaData().getColumnCount(); i++) {
            System.out.printf("%30s",rSet1.getMetaData().getColumnName(i));
        }
        System.out.println();
        while (rSet1.next()) {
            int delivery_id = rSet1.getInt("delivery_id");
            String delivery_customerAddress = rSet1.getString("delivery_customerAddress");
            String delivery_products = rSet1.getString("delivery_products");
            String delivery_time = rSet1.getString("delivery_time");
            String delivery_order = rSet1.getString("delivery_order");

            System.out.printf("%30s", delivery_id);
            System.out.printf("%30s", delivery_customerAddress);
            System.out.printf("%30s", delivery_products);
            System.out.printf("%30s", delivery_time);
            System.out.printf("%30s", delivery_order);


            System.out.println();
        }// end while
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

        return true;

    }



    public static void main(String[] args) {

        //Create the Database Object

        try {

            MySQLAccess dao = new MySQLAccess();  // connection to database

            // Configure System for Running
            Scanner keyboard = new Scanner(System.in);
            String functionNumber = "-99";
            boolean keepAppOpen = true;

            while (keepAppOpen) {

                //Present list of functionality and get selection
                listCustomerFunctionalityAvailable();
                functionNumber = keyboard.next();

                switch (functionNumber) {
                    case "1" -> {
                        System.out.print("Enter Customer First Name: \n");
                        String name = keyboard.next();

                        //if (keyboard.next() == "-1")
                        System.out.printf("Enter Customer Surname: \n");
                        String surName = keyboard.next();
                        System.out.print("Enter Customer phone number: \n");
                        String phone_number = keyboard.next();
                        System.out.print("Enter Customer Age: \n");
                        String age = keyboard.next();
                        System.out.print("Enter Customer Town: \n");
                        String town = keyboard.next();
                        System.out.print("Enter Customer address without spaces: \n");
                        String address = keyboard.next();
                        //address = address.replaceAll(" ", " ");
                        System.out.print("Enter Customer area: \n");
                        String area = keyboard.next();
                        Customer custObj = new Customer(name, surName, phone_number, age, town, address, area);
                        boolean insertResult = dao.insertCustomerDetailsAccount(custObj);
                        if (insertResult)
                            System.out.println("Customer Details Saved");
                        else
                            System.out.println("ERROR: Customer Details NOT Saved");
                    }
                    case "2" -> {
                        ResultSet rSet = dao.retrieveAllCustomerAccounts();
                        if (rSet == null) {
                            System.out.println("No Records Found");
                            break;
                        } else {
                            boolean tablePrinted = printCustomerTable(rSet);
                            if (tablePrinted)
                                rSet.close();
                        }
                    }
                    case "3" -> {
                        System.out.println("Enter Customer Id to be deleted or -99 to Clear all Rows");
                        String deletecustomer_id = keyboard.next();
                        boolean deleteResult = dao.deleteCustomerById(Integer.parseInt(deletecustomer_id));
                        if ((deleteResult) && (deletecustomer_id.equals("-99")))
                            System.out.println("Customer Table Emptied");
                        else if (deleteResult)
                            System.out.println("Customer Deleted");
                        else
                            System.out.println("ERROR: Customer Details NOT Deleted or Do Not Exist");
                        keepAppOpen = true;
                    }
                    case "4" -> {
                        System.out.print("Enter Publication Name: \n");
                        String publication_name = keyboard.next();
                        System.out.print("Enter Publication Price: \n");
                        String publication_price = keyboard.next();
                        System.out.print("Enter Publication Frequency: \n");
                        String publication_frequency = keyboard.next();
                        Publication pubObj = new Publication(publication_name, publication_price, publication_frequency);
                        boolean insertResult1 = dao.insertPublicationDetailsAccount(pubObj);
                        if (insertResult1)
                            System.out.println("Publication Details Saved");
                        else
                            System.out.println("ERROR: Publication Details NOT Saved");
                    }
                    case "5" -> {
                        ResultSet rSet1 = dao.retrieveAllPublicationAccounts();
                        if (rSet1 == null) {
                            System.out.println("No Records Found");
                            break;
                        } else {
                            boolean tablePrinted = printPublicationTable(rSet1);
                            if (tablePrinted)
                                rSet1.close();
                        }
                    }
                    case "6" -> {
                        System.out.println("Enter Publication Id to be deleted or -66 to Clear all Rows");
                        String deletepublication_id = keyboard.next();
                        boolean deleteResult1 = dao.deletePublicationById(Integer.parseInt(deletepublication_id));
                        if ((deleteResult1) && (deletepublication_id.equals("-66")))
                            System.out.println("Publication Table Emptied");
                        else if (deleteResult1)
                            System.out.println("Publication Deleted");
                        else
                            System.out.println("ERROR: Publication Details NOT Deleted or Do Not Exist");
                        keepAppOpen = true;
                    }
                    case "7" -> {
                        System.out.print("Enter The Customer Details/ ID: \n");
                        String customer_id = keyboard.next();
                        System.out.print("Enter The Price: \n");
                        String bill_price = keyboard.next();
                        System.out.print("Enter The Publication ID: \n");
                        String bill_ordDetails = keyboard.next();
                        System.out.print("Enter The Payment Type. Cash Or Card?: \n");
                        String bill_paymentType = keyboard.next();

                        Invoice invObj = new Invoice(customer_id, bill_price, bill_ordDetails, bill_paymentType);

                        boolean insertResult = dao.insertInvoiceDetailsAccount(invObj);
                        if (insertResult)
                            System.out.println("Invoice Details Saved");
                        else
                            System.out.println("ERROR: Invoice Details NOT Saved");
                    }

                    case "8" -> {
                        ResultSet rSet1 = dao.retrieveAllInvoiceAccounts();
                        if (rSet1 == null) {
                            System.out.println("No Records Found");
                            break;
                        } else {
                            boolean tablePrinted = printInvoiceTable(rSet1);
                            if (tablePrinted)
                                rSet1.close();
                        }
                    }
                    case "9" -> {
                        System.out.println("Enter Invoice Id to be deleted or -66 to Clear all Rows");
                        String deletebill_id = keyboard.next();
                        boolean deleteResult1 = dao.deleteInvoiceById(Integer.parseInt(deletebill_id));
                        if ((deleteResult1) && (deletebill_id.equals("-66")))
                            System.out.println("Invoice Table Emptied");
                        else if (deleteResult1)
                            System.out.println("Invoice Deleted");
                        else
                            System.out.println("ERROR: Invoice Details NOT Deleted or Do Not Exist");
                        keepAppOpen = true;
                    }
                    case "10" -> {
                        ResultSet rSet2 = dao.retrieveAllAdmins();
                        if (rSet2 == null) {
                            System.out.println("No Records Found");
                            break;
                        } else {
                            boolean tablePrinted = printAdminTable(rSet2);
                            if (tablePrinted)
                                rSet2.close();
                        }
                    }
                    case "11" -> {
                        System.out.print("Enter Admin User Name: \n");
                        String username = keyboard.next();
                        System.out.print("Enter Admin password: \n");
                        String password = keyboard.next();
                        System.out.print("Enter Admin email: \n");
                        String email = keyboard.next();
                        System.out.print("Enter Admin phone number: \n");
                        String admin_phone_number = keyboard.next();
                        System.out.print("Enter Admin real firstname: \n");
                        String firstName = keyboard.next();
                        System.out.print("Enter Admin real surname: \n");
                        String surname = keyboard.next();
                        System.out.print("Enter Admin level 'admin' or 'user': \n");
                        String level = keyboard.next();
                        Admin adminObj = new Admin(username, password, email, admin_phone_number, firstName, surname, level);

                        boolean insertResultForAdmin = dao.insertAdminDetailsAccount(adminObj);
                        if (insertResultForAdmin)
                            System.out.println("Admin Details Saved");
                        else
                            System.out.println("ERROR: Admin Details NOT Saved");
                    }
                    case "12" -> {
                        System.out.println("Enter Admin Id to be deleted or -99 to Clear all Rows");
                        String deletedAdmin_id = keyboard.next();
                        boolean deleteResult2 = dao.deleteAdminByID(Integer.parseInt(deletedAdmin_id));
                        if ((deleteResult2) && (deletedAdmin_id.equals("-99")))
                            System.out.println("Admin Table Emptied");
                        else if (deleteResult2)
                            System.out.println("Admin Deleted");
                        else
                            System.out.println("ERROR: Admin Details NOT Deleted or Do Not Exist");
                        keepAppOpen = true;
                    }

                    case "13" -> {
                        System.out.print("Enter available stock name: \n");
                        String available_stock = keyboard.next();
                        Stock stockObj = new Stock(available_stock);
                        boolean insertStock_name = dao.insertAvailableStock(stockObj);
                        if (insertStock_name)
                            System.out.println("Available Stock Details Saved");
                        else
                            System.out.println("ERROR: Available Stock Details NOT Saved");
                    }

                    case "14" -> {
                        System.out.println("Enter Stock Id to be deleted or -66 to Clear all Rows");
                        String deletestock_id = keyboard.next();
                        boolean deleteResult1 = dao.deleteStockById(Integer.parseInt(deletestock_id));
                        if ((deleteResult1) && (deletestock_id.equals("-66")))
                            System.out.println("Stock Table Emptied");
                        else if (deleteResult1)
                            System.out.println("Stock item Deleted");
                        else
                            System.out.println("ERROR: Stock Details NOT Deleted or Do Not Exist");
                        keepAppOpen = true;
                    }

                    case "15" -> {
                        ResultSet rSet1 = dao.retrieveAllStockAccounts();
                        if (rSet1 == null) {
                            System.out.println("No Records Found");
                            break;
                        } else {
                            boolean tablePrinted = printStockTable(rSet1);
                            if (tablePrinted)
                                rSet1.close();
                        }
                    }
                    case "16" -> {
                        System.out.print("Enter a delivery address: \n");
                        String delivery_customerAddress = keyboard.next();
                        System.out.print("Enter a product: \n");
                        String delivery_products = keyboard.next();
                        System.out.print("Enter the time: \n");
                        String delivery_time = keyboard.next();
                        System.out.print("Enter the order: \n");
                        String delivery_order = keyboard.next();

                        Delivery delObj = new Delivery(delivery_customerAddress, delivery_products, delivery_time, delivery_order);
                        boolean insertResult1 = dao.insertDeliveryDetailsAccount(delObj);
                        if (insertResult1)
                            System.out.println("Delivery Route Details Saved");
                        else
                            System.out.println("ERROR: Delivery Route Details NOT Saved");
                    }
                    case "17" -> {
                        ResultSet rSet1 = dao.retrieveAllDeliveryAccounts();
                        if (rSet1 == null) {
                            System.out.println("No Records Found");
                            break;
                        } else {
                            boolean tablePrinted = printDeliveryTable(rSet1);
                            if (tablePrinted)
                                rSet1.close();
                        }
                    }
                    case "18" -> {
                        System.out.println("Enter Delivery Id to be deleted or -66 to Clear all Rows");
                        String deletedelivery_id = keyboard.next();
                        boolean deleteResult1 = dao.deleteDeliveryById(Integer.parseInt(deletedelivery_id));
                        if ((deleteResult1) && (deletedelivery_id.equals("-66")))
                            System.out.println("Delivery Table Emptied");
                        else if (deleteResult1)
                            System.out.println("Delivery Route Deleted");
                        else
                            System.out.println("ERROR: Delivery route Details NOT Deleted or Do Not Exist");
                        keepAppOpen = true;
                    }









                    case "99" -> {
                        keepAppOpen = false;
                        System.out.println("Closing the Application");
                    }
                    default -> System.out.println("No Valid Function Selected");
                } // end switch

            }// end while
            keyboard.close();

        } catch (Exception e) {
            System.out.println("PROGRAM TERMINATED - ERROR MESSAGE:" + e.getMessage());
        } // end try-catch
    }
} // end main


