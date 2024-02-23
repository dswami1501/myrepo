package org.swami.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.swami.model.Attendance;
import org.swami.service.AttendanceService;

@RestController
@RequestMapping("/school/attendance")
public class AttendanceController {
    private AttendanceService attendanceService;
    public AttendanceController(AttendanceService attendanceService){
        this.attendanceService=attendanceService;
    }

    @PostMapping("/savea")
    public Attendance saveAttendance(@RequestBody Attendance newAttendance){
        return attendanceService.saveStudentAttendance(newAttendance);
    }
}
