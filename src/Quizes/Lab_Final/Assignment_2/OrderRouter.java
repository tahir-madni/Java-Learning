package Quizes.Lab_Final.Assignment_2;

public class OrderRouter {
    private String routerId;

    public OrderRouter(String routerId) {
        this.routerId = routerId;
    }

    public double evaluateExecutionFee(double tradeValue) {
        return tradeValue * 0.01;
    }
}
