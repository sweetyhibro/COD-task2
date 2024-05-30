package hospitalmanagement;

import java.util.HashMap;
import java.util.Map;

public class StaffManagementModule {
    private static Map<String, StaffMember> staff = new HashMap<>();

    public static void addStaff(String staffId, String name, String role, String department, String contactNumber) {
        StaffMember staffMember = new StaffMember(staffId, name, role, department, contactNumber);
        staff.put(staffId, staffMember);
        System.out.println("Staff member added successfully.");
    }

    // Other methods for staff management can be added here
}
