package Quizes.Lab_Final.Assignment_1;

public class LogisticNodeTester {
   public static void main() {

        FulfillmentHub f1 = new FulfillmentHub("HUB-01", "Karachi", 5000.0, 15, 1200);
        f1.setOperationalCost(-250.0);
        System.out.println(f1.getOperationalCost());

        System.out.println();

        System.out.println("Id: " + f1.getNodeId());
        System.out.println("Location: " + f1.getLocation());
        System.out.println("Cost: " + f1.getOperationalCost());
        System.out.println("Capacity: " + f1.getMaxSortcapacity());
        System.out.println("Count: " + f1.getActiveFleetCount());

//        System.out.println(f1);
    }


}
