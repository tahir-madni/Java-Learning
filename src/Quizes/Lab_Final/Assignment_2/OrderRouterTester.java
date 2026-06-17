package Quizes.Lab_Final.Assignment_2;

public class OrderRouterTester {
    static void main() {
        OrderRouter myRouter = new HighFrequencyRouter("R-101");
        System.out.println("myRouter: " + myRouter.evaluateExecutionFee(15000.0));

        HighFrequencyRouter highRouter = new HighFrequencyRouter("R-102");
        System.out.println("highRouter(crypto): " + highRouter.evaluateExecutionFee(15000.0, "Crypto"));
        System.out.println("highRouter(no-crypto): " + highRouter.evaluateExecutionFee(15000.0, "cash"));

    }
}
