package Quizes.Lab_Final.Assignment_1;

public class FulfillmentHub extends DistributionCenter {
    private int maxSortcapacity;

    public FulfillmentHub(String nodeId, String location, double operationalCost, int activeFleetCount, int maxSortcapacity) {
        super(nodeId, location, operationalCost, activeFleetCount);
        this.maxSortcapacity = maxSortcapacity;
    }

    public int getMaxSortcapacity() {
        return maxSortcapacity;
    }

    public void setMaxSortcapacity(int maxSortcapacity) {
        this.maxSortcapacity = maxSortcapacity;
    }

//    public String toString() {
//        return "Id: " + getNodeId() +
//                "  Location: " + getLocation() +
//                "  Cost: " + getOperationalCost() +
//                "  Capacity: " + getMaxSortcapacity() +
//                "  Count: " + getActiveFleetCount();
//    }
}
