package Quizes.Lab_Final.Assignment_3;

public interface TelemetrySyncable {
    void pushRealTimeMetrics();

    boolean pingGateway(String ipAddress);
}

