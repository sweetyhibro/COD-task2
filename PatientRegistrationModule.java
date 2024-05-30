package hospitalmanagement;

import java.util.HashMap;
import java.util.Map;

public class PatientRegistrationModule {
    private static Map<String, Patient> patients = new HashMap<>();

    public static void registerPatient(String patientId, String name, int age, String gender, String contactNumber, String medicalHistory) {
        Patient patient = new Patient(patientId, name, age, gender, contactNumber, medicalHistory);
        patients.put(patientId, patient);
        System.out.println("Patient registered successfully.");
    }

    public static Patient getPatient(String patientId) {
        return patients.get(patientId);
    }

    // Other methods for patient management can be added here
}
