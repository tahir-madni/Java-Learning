package Quizes.Lab_Final.Assignment_4;

public class JobTester {
    static void main() {
        JobValidator job = new JobValidator();

        try {
            job.analyzeJobParameters(10, "pass");
        } catch (MaliciousPayloadException e) {
            System.out.println(e.getMessage());
        } catch (ResourceAllocationException e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("[System Log] Clearing validation buffers");
        }
    }
}
