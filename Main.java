package hospitalmanagement;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    registerPatient();
                    break;
                case 2:
                    scheduleAppointment();
                    break;
                case 3:
                    addEHR();
                    break;
                case 4:
                    generateInvoice();
                    break;
                case 5:
                    payInvoice();
                    break;
                case 6:
                    viewBill(); // Added option to view bill
                    break;
                case 7:
                    addInventoryItem();
                    break;
                case 8:
                    addStaffMember();
                    break;
                case 9:
                    System.out.println("Exiting system. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("Hospital Management System");
        System.out.println("1. Register Patient");
        System.out.println("2. Schedule Appointment");
        System.out.println("3. Add EHR");
        System.out.println("4. Generate Invoice");
        System.out.println("5. Pay Invoice");
        System.out.println("6. View Bill"); // Added option to view bill
        System.out.println("7. Add Inventory Item");
        System.out.println("8. Add Staff Member");
        System.out.println("9. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void registerPatient() {
        // Method implementation for registering a patient
    	System.out.print("Enter Patient ID: ");
        String patientId = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Gender: ");
        String gender = scanner.nextLine();
        System.out.print("Enter Contact Number: ");
        String contactNumber = scanner.nextLine();
        System.out.print("Enter Medical History: ");
        String medicalHistory = scanner.nextLine();

    }

    private static void scheduleAppointment() {
        // Method implementation for scheduling an appointment
    	System.out.print("Enter Appointment ID: ");
        String appointmentId = scanner.nextLine();
        System.out.print("Enter Patient ID: ");
        String patientId = scanner.nextLine();
        System.out.print("Enter Doctor ID: ");
        String doctorId = scanner.nextLine();
        System.out.print("Enter Date: ");
        String date = scanner.nextLine();
        System.out.print("Enter Time: ");
        String time = scanner.nextLine();

    }

    private static void addEHR() {
        // Method implementation for adding electronic health records
    	System.out.print("Enter Patient ID: ");
        String patientId = scanner.nextLine();
        System.out.print("Enter Diagnosis: ");
        String diagnosis = scanner.nextLine();
        System.out.print("Enter Treatment Plan: ");
        String treatmentPlan = scanner.nextLine();
        System.out.print("Enter Medications: ");
        String medications = scanner.nextLine();
        System.out.print("Enter Lab Results: ");
        String labResults = scanner.nextLine();
    }

    private static void generateInvoice() {
        System.out.print("Enter Invoice ID: ");
        String invoiceId = scanner.nextLine();
        System.out.print("Enter Patient ID: ");
        String patientId = scanner.nextLine();
        System.out.print("Enter Amount: ");
        double amount = Double.parseDouble(scanner.nextLine());

        BillingModule.generateInvoice(invoiceId, patientId, amount);
    }

    private static void payInvoice() {
        System.out.print("Enter Invoice ID to pay: ");
        String invoiceId = scanner.nextLine();

        BillingModule.markInvoiceAsPaid(invoiceId);
    }

    private static void viewBill() {
        System.out.print("Enter Patient ID to view bill: ");
        String patientId = scanner.nextLine();

        // Retrieve the patient's invoice from BillingModule
        Invoice invoice = BillingModule.getInvoiceByPatientId(patientId);
        if (invoice != null) {
            System.out.println("Invoice ID: " + invoice.getInvoiceId());
            System.out.println("Patient ID: " + invoice.getPatientId());
            System.out.println("Amount: $" + invoice.getAmount());
            System.out.println("Status: " + (invoice.isPaid() ? "Paid" : "Unpaid"));
        } else {
            System.out.println("No invoice found for the patient.");
        }
    }

    private static void addInventoryItem() {
        // Method implementation for adding inventory items
    	System.out.print("Enter Item ID: ");
        String itemId = scanner.nextLine();
        System.out.print("Enter Item Name: ");
        String itemName = scanner.nextLine();
        System.out.print("Enter Quantity: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Price: ");
        double price = Double.parseDouble(scanner.nextLine());
    }

    private static void addStaffMember() {
        // Method implementation for adding staff members
    	System.out.print("Enter Staff ID: ");
        String staffId = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Role: ");
        String role = scanner.nextLine();
        System.out.print("Enter Department: ");
        String department = scanner.nextLine();
        System.out.print("Enter Contact Number: ");
        String contactNumber = scanner.nextLine();
    }
}
