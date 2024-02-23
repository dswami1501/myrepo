package org.swami.service;

import org.springframework.stereotype.Service;
import org.swami.model.Attendance;
import org.swami.model.Student;
import org.swami.repo.AttendanceRepo;

import java.util.List;
import java.util.Optional;

@Service
public class AttendanceService {
    /*Attendance Service:

Record attendance for a student in a particular classroom.
View attendance history for a student.
Generate attendance reports for a classroom.*/


    private AttendanceRepo attendanceRepo;

    public AttendanceService(AttendanceRepo attendanceRepo) {
        this.attendanceRepo = attendanceRepo;
    }

    //Todo: Record attendance for a student in a particular classroom.
    public Attendance saveStudentAttendance(Attendance newAttendance){
        return attendanceRepo.save(newAttendance);
    }

    //Todo:View attendance history for a student.
    public Attendance getStudentAttendance(Integer studentId){
        Optional<Attendance> byId = attendanceRepo.findById(studentId);
        if (byId.isPresent()) {
            return byId.get();
        }
        return new Attendance();
    }

    //Todo:Generate attendance reports for a classroom.
    public Attendance getAttendanceReportForClassroom(){
        return null;
    }


    public Attendance setStudentAttendanceInAttendanceTable(Student student) {
        List<Attendance> attendances = student.getAttendances();
        Attendance singleAttendance=null;
        if (attendances!=null){
            for(Attendance attendance:attendances){
                singleAttendance=attendanceRepo.save(attendance);
            }
        }
        return singleAttendance;
    }
}
