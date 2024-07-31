package src;

public class Stock
{
    private int id;
    private String name;  //available_stock




    void setId(int stock_id) {
        id = stock_id;
    }
    void setName(String available_stock) { name = available_stock; }


    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    public Stock(String available_stock) throws StockExceptionHandler
    {

        id = 0;

        try {

            validateStockName(available_stock);

        } catch (StockExceptionHandler e) {

            throw e;
        }
        name = available_stock;

    }

    public static void validateStockName (String available_stock) throws StockExceptionHandler {

        if (available_stock.isEmpty() || available_stock.isBlank())
            throw new StockExceptionHandler("Please enter Stock name");
        else if (available_stock.length() < 2)
            throw new StockExceptionHandler("Stock name to short");
        else if (available_stock.length() > 40)
            throw new StockExceptionHandler("Stock name too long");
    }
}