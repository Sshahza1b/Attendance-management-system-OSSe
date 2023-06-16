/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AttendanceController {
    private Map<String, List<String>> attendanceRecords;

    public AttendanceController() {
        attendanceRecords = new HashMap<>();
    }

    public void markAttendance(String studentName, String date) {
        List<String> datesAttended = attendanceRecords.getOrDefault(studentName, new ArrayList<>());
        datesAttended.add(date);
        attendanceRecords.put(studentName, datesAttended);
    }

    public void printAttendance() {
        for (String studentName : attendanceRecords.keySet()) {
            System.out.println(studentName + ": " + attendanceRecords.get(studentName));
        }
    }

    public static void main(String[] args) {
        AttendanceController controller = new AttendanceController();
        controller.markAttendance("Shahzeb", "2023-06-14");
        controller.markAttendance("Ahsan", "2023-06-14");
        controller.markAttendance("Shamsa", "2023-06-15");
        controller.printAttendance();
    }
}