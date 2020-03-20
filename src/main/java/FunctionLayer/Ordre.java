package FunctionLayer;

import java.util.ArrayList;

public class Ordre {

    private int ordreID;
    private static ArrayList<Cupcake> cupcakeOrdre;
    private static double sum = 0;

    public static void addCupcake(Cupcake cupcake){
        cupcakeOrdre = new ArrayList<>();
        cupcakeOrdre.add(cupcake);
    }

    public static double totalSum(){
        for (Cupcake cupcake: cupcakeOrdre) {
            sum = sum + cupcake.totalPriceCalculator(cupcake.getTopPrice(), cupcake.getBotPrice());
        }
        return sum;
    }

    public Ordre(int ordreID, ArrayList<Cupcake> cupcakeOrdre, double sum) {
        this.ordreID = ordreID;
        this.cupcakeOrdre = cupcakeOrdre;
        this.sum = sum;
    }

    public Ordre(ArrayList<Cupcake> cupcakeOrdre, double sum) {
        this.cupcakeOrdre = cupcakeOrdre;
        this.sum = sum;
    }

    public int getOrdreID() {
        return ordreID;
    }

    public void setOrdreID(int ordreID) {
        this.ordreID = ordreID;
    }

    public ArrayList<Cupcake> getCupcakeOrdre() {
        return cupcakeOrdre;
    }

    public void setCupcakeOrdre(ArrayList<Cupcake> cupcakeOrdre) {
        this.cupcakeOrdre = cupcakeOrdre;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}
