package Quizes.Lab_Final.Assignment_3;

public class TransformerNode extends PowerGridComponent implements TelemetrySyncable {

    public TransformerNode(String componentId) {
        super(componentId);
    }

    @Override
    public void displayComponentStatus() {
        System.out.println("Displaying component Status");
    }

    @Override
    public void pushRealTimeMetrics() {
        System.out.println("Pushing realtime metrics");

    }

    public boolean pingGateway(String ipAddress) {
        System.out.println("Pinging gateway");
        return true;
    }
}
