package Quizes.Lab_Final.Assignment_4;

public class JobValidator {

    public void analyzeJobParameters(int requestedMemory, String securityToken) throws ResourceAllocationException {

        boolean isValidated = true;

        if (securityToken.equals("malware")) {
            isValidated = false;
            throw new MaliciousPayloadException("Malicious activity");
        }
        if (requestedMemory > 64) {
            isValidated = false;
            throw new ResourceAllocationException("The limit is exceeded");
        }
        if (isValidated == true) {
            System.out.println("Job validation successful!");
        }
    }
}
