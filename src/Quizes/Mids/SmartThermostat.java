package Quizes.Mids;

public class SmartThermostat {
    private String deviceId;
    private double currentTemp;
    private double targetTemp;
    private final double MAX_TEMP = 30.0;

    SmartThermostat(String deviceId, double currentTemp, double targetTemp) {
        this.deviceId = deviceId;
        this.currentTemp = currentTemp;
        this.targetTemp = targetTemp;
    }

    SmartThermostat() {
        deviceId = "unknown";
        currentTemp = 22.0;
        targetTemp = 24.0;
    }

    double getCurrentTemp() {
        return currentTemp;
    }

    double getTargetTemp() {
        return targetTemp;
    }

    void setCurrentTemp(double currentTemp) {
        this.currentTemp = currentTemp;
    }

    void setTargetTemp(double targetTemp) {
        this.targetTemp = targetTemp;
    }

    String getMode() {
        String mode = "";

        double diff = currentTemp - targetTemp ;


        if (diff > 5) {
            mode = "Turbo Cooling";
        } else if (diff <= 5 && diff >= 1) {
            mode = "Eco Cooling";
        } else {
            mode = "Idle";
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hour " + i + ": Thermostat operating in " + mode + " mode.");
        }
        return mode;
    }
}


class Main {
    static boolean maxTester(SmartThermostat s) {
        if (30 - s.getCurrentTemp() <= 2) {
            return true;
        } else {
            return false;
        }
    }

    static void main(String[] args) {
        SmartThermostat s1 = new SmartThermostat("A-1", 19, 30);
        s1.getMode();
        if (maxTester(s1)) {
            System.out.println("Caution: System is approaching max limit !!");
        }
    }
}


