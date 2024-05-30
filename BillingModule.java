package hospitalmanagement;

import java.util.HashMap;
import java.util.Map;

public class BillingModule {
    private static Map<String, Invoice> invoices = new HashMap<>();

    public static void generateInvoice(String invoiceId, String patientId, double amount) {
        Invoice invoice = new Invoice(invoiceId, patientId, amount, false);
        invoices.put(invoiceId, invoice);
        System.out.println("Invoice generated successfully.");
    }

    public static void markInvoiceAsPaid(String invoiceId) {
        Invoice invoice = invoices.get(invoiceId);
        if (invoice != null) {
            invoice.setPaid(true);
            System.out.println("Invoice marked as paid.");
        } else {
            System.out.println("Invoice not found.");
        }
    }

    public static Invoice getInvoiceByPatientId(String patientId) {
        for (Invoice invoice : invoices.values()) {
            if (invoice.getPatientId().equals(patientId)) {
                return invoice;
            }
        }
        return null;
    }
}
