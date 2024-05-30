package hospitalmanagement;

public class Patient {
    private String patientId;
    private String name;
    private int age;
    private String gender;
    private String contactNumber;
    private String medicalHistory;

    public Patient(String patientId, String name, int age, String gender, String contactNumber, String medicalHistory) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contactNumber = contactNumber;
        this.medicalHistory = medicalHistory;
    }

    // Getters and setters
    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getContactNumber() { return contactNumber; }
    public String getMedicalHistory() { return medicalHistory; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setGender(String gender) { this.gender = gender; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }
    public void setMedicalHistory(String medicalHistory) { this.medicalHistory = medicalHistory; }
}
