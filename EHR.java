package hospitalmanagement;

public class EHR {
    private String patientId;
    private String diagnosis;
    private String treatmentPlan;
    private String medications;
    private String labResults;

    public EHR(String patientId, String diagnosis, String treatmentPlan, String medications, String labResults) {
        this.patientId = patientId;
        this.diagnosis = diagnosis;
        this.treatmentPlan = treatmentPlan;
        this.medications = medications;
        this.labResults = labResults;
    }

    // Getters and setters
}
