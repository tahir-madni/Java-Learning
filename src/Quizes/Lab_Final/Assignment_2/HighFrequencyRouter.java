package Quizes.Lab_Final.Assignment_2;

public class HighFrequencyRouter extends OrderRouter {

    public HighFrequencyRouter(String routerId) {
        super(routerId);
    }

    public double evaluateExecutionFee(double tradeValue) {
        return (tradeValue * 0.01) + 20.0;
    }

    public double evaluateExecutionFee(double tradeValue, String assetClass) {

        if (assetClass.equals("Crypto")) {
            return (tradeValue * 0.01) + 50.0;
        } else {
            return (tradeValue * 0.01) + 10.0;
        }
    }
}
