package hospitalmanagement;

import java.util.HashMap;
import java.util.Map;

public class EHRModule {
    private static Map<String, EHR> ehrRecords = new HashMap<>();

    public static void addEHR(String patientId, String diagnosis, String treatmentPlan, String medications, String labResults) {
        EHR ehr = new EHR(patientId, diagnosis, treatmentPlan, medications, labResults);
        ehrRecords.put(patientId, ehr);
        System.out.println("EHR added successfully.");
    }

    // Other methods for EHR management can be added here
}
