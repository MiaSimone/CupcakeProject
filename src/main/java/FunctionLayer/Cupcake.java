package FunctionLayer;

public class Cupcake {

    private String topping;
    private String bottom;
    private double topPrice;
    private double botPrice;
    private int topID;
    private int botID;

    public double totalPriceCalculator(double topPrice, double botPrice){

        double sum = topPrice + botPrice;

        return sum;
    }


    public Cupcake(String topping, String bottom, double topPrice, double botPrice) {
        this.topping = topping;
        this.bottom = bottom;
        this.topPrice = topPrice;
        this.botPrice = botPrice;
    }

    public Cupcake(String topping, String bottom, double topPrice, double botPrice, int topID, int botID) {
        this.topping = topping;
        this.bottom = bottom;
        this.topPrice = topPrice;
        this.botPrice = botPrice;
        this.topID = topID;
        this.botID = botID;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getBottom() {
        return bottom;
    }

    public void setBottom(String bottom) {
        this.bottom = bottom;
    }

    public double getTopPrice() {
        return topPrice;
    }

    public void setTopPrice(double topPrice) {
        this.topPrice = topPrice;
    }

    public double getBotPrice() {
        return botPrice;
    }

    public void setBotPrice(double botPrice) {
        this.botPrice = botPrice;
    }

    public int getTopID() {
        return topID;
    }

    public void setTopID(int topID) {
        this.topID = topID;
    }

    public int getBotID() {
        return botID;
    }

    public void setBotID(int botID) {
        this.botID = botID;
    }
}
