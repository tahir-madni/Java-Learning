package Quizes.Lab_Final.Assignment_1;

public class DistributionCenter extends LogisticsNode {
    private int activeFleetCount;

    public DistributionCenter(String nodeId, String location, double operationalCost, int activeFleetCount) {
        super(nodeId, location, operationalCost);
        this.activeFleetCount = activeFleetCount;

    }

    public int getActiveFleetCount() {
        return activeFleetCount;
    }

    public void setActiveFleetCount(int activeFleetCount) {
        this.activeFleetCount = activeFleetCount;
    }
}
