package Quizes.Lab_Final.Assignment_3;

public abstract class PowerGridComponent {
    private String componentId;
    protected boolean isGridSynchronized;


    public PowerGridComponent(String componentId) {
        this.componentId = componentId;
        isGridSynchronized = false;
    }

    public void emergencyShutdown() {
        System.out.println("Shutting the grid down.Danger at: " + componentId);
        isGridSynchronized = false;
    }

    public abstract void displayComponentStatus();
}

