package hospitalmanagement;

import java.util.ArrayList;
import java.util.List;

public class AppointmentSchedulingModule {
    private static List<Appointment> appointments = new ArrayList<>();

    public static void scheduleAppointment(String appointmentId, String patientId, String doctorId, String date, String time) {
        Appointment appointment = new Appointment(appointmentId, patientId, doctorId, date, time);
        appointments.add(appointment);
        System.out.println("Appointment scheduled successfully.");
    }

    // Other methods for appointment management can be added here
}
