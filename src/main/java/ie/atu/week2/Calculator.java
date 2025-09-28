package ie.atu.week2;

public class Calculator {

    private String Operation;
    private double sum;

    public Calculator(String Operation, double sum){
        this.Operation = Operation;
        this.sum = sum;
    }

    public String getOperation() {
        return Operation;
    }

    public double getsum() {
        return sum;
    }

}
