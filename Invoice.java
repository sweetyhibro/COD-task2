package hospitalmanagement;

public class Invoice {
    private String invoiceId;
    private String patientId;
    private double amount;
    private boolean paid;

    public Invoice(String invoiceId, String patientId, double amount, boolean paid) {
        this.invoiceId = invoiceId;
        this.patientId = patientId;
        this.amount = amount;
        this.paid = paid;
    }

    // Getters and setters
    public String getInvoiceId() { return invoiceId; }
    public String getPatientId() { return patientId; }
    public double getAmount() { return amount; }
    public boolean isPaid() { return paid; }

    public void setPaid(boolean paid) { this.paid = paid; }
}
