package Quizes.Lab_Final.Assignment_3;

public class TelemetryTester {
    static void main() {
        PowerGridComponent component = new TransformerNode("TX-001");
        component.displayComponentStatus();

        component.emergencyShutdown();
        System.out.println(component.isGridSynchronized);

    }
}
