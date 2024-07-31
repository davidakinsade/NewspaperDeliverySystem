package src;

public class StockExceptionHandler extends Exception {

    String message;

    public StockExceptionHandler(String errMessage) {

        message = errMessage;
    }

    public String getMessage() {

        return message;
    }

}

