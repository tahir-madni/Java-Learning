package Quizes.Lab_Final.Assignment_1;

public class LogisticsNode {
    private String nodeId;
    private String location;
    private double operationalCost;

   public LogisticsNode(String nodeId, String location, double operationalCost) {
        this.nodeId = nodeId;
        this.location = location;
        this.operationalCost = operationalCost;
    }

    public String getNodeId() {
        return nodeId;
    }

    public double getOperationalCost() {
        return operationalCost;
    }

    public String getLocation() {
        return location;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public void setOperationalCost(double operationalCost) {
        if (operationalCost < 0) {
            System.out.println("Invalid value");
            this.operationalCost = 0.0;
        } else {
            this.operationalCost = operationalCost;
        }
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
