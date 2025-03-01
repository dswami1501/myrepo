package com.querymaster.querymaster.service;

import com.querymaster.querymaster.dto.StudentDTO;
import com.querymaster.querymaster.model.Classroom;
import com.querymaster.querymaster.model.Student;
import com.querymaster.querymaster.repo.ClassroomRepo;
import com.querymaster.querymaster.repo.StudentRepo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    Logger logger = LoggerFactory.getLogger(StudentService.class);

    @Autowired
    private EntityManager entityManager;

    private StudentRepo studentRepo;
    @Autowired
    private ClassroomRepo classroomRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    //Todo:Register a new student.
    public Student registerNewStudent(Student newStudent){
        return studentRepo.save(newStudent);
    }

    //Todo:Get student details by ID.
    public StudentDTO getStudentById(Integer studentId){
        return convertStudentToStudentDto(studentId);
    }

    public StudentDTO convertStudentToStudentDto(Integer studentId){
        Optional<Student>  newStudent = studentRepo.findById(studentId);
        if(newStudent.isPresent()){
            Student student = newStudent.get();
            StudentDTO studentDTO = new StudentDTO();
            studentDTO.setStudentId(student.getStudentId());
            studentDTO.setName(student.getName());
            Optional<Classroom> classroomByStudentId = classroomRepo.findClassroomByStudentId(studentId);
            if(classroomByStudentId.isPresent()){
                studentDTO.setClassroom(classroomByStudentId.get());
            }
            return studentDTO;
        }
        return new StudentDTO();
    }

//Todo: Service methods using Jpql: start
    //Todo: Basic Crud Operations start
    public String getStudentByIdByJPQL(int studId){
        Optional<Student> studentById = studentRepo.findStudentById(studId);
        if (studentById.isPresent()){
            return "getStudentById "+ studentById.get();
        }
        return "getStudentById "+ studentById.get();
    }

    public String getStudentByName(String studName){
        Optional<Student> studentByName = studentRepo.findStudentByName(studName);
        if (studentByName.isPresent()){
            return "getStudentById "+ studentByName.get();
        }
        return "getStudentById "+ studentByName.get();
    }

    @Transactional
    public String updateStudUsingJpql(String name,int studId ){
        int i = studentRepo.updateStudentName(name, studId);
        return "updateStudUsingJpql "+i;
    }

    @Transactional
    public String updateStudClassUsingJpql(int grade,int studId ){
        int i = studentRepo.updateClassroomGradeByStudentId(grade, studId);
        return "updateStudClassUsingJpql "+i;
    }

    @Transactional
    public String deleteStudjpql(int studId ){
        int i = studentRepo.deleteStudentById(studId);
        return "deleteStudjpql "+i;
    }
    //Todo: Basic Crud Operations end

    //Todo: Aggregation queries start
    public String totalStudInClass(int classId){
        return "totalStudInClass "+ studentRepo.countStudentsByClassroom(classId);
    }

    public String totalStudentidOfClass(int classId){
        Classroom classroomById = studentRepo.findClassroomById(classId);
        return "totalStudentidOfClass "+studentRepo.calculateTotalStudentidByClassroom(classroomById);
    }

    public String maxMinStudentidOfClass(int classId){
        Classroom classroomById = studentRepo.findClassroomById(classId);
        return "maxStudentidOfClass "+studentRepo.findHighestStudentidByClassroom(classroomById) + " minStudentidOfClass "+studentRepo.findLowestStudentidByClassroom(classroomById);
    }

    public String averageStudentId(int classId){
        Classroom classroomById = studentRepo.findClassroomById(classId);
        return "averageStudentId "+studentRepo.averageStudentidByClassroom(classroomById);
    }
    //Todo: Aggregation queries end
    //Todo: Join queries start
    public String allClassGradeAndGradeByStudentId(int studId){
        return "allClassGradeAndGradeByStudentId: Classroom grade By studId: "+studentRepo.findClassroomGradeByStudentId(studId)+
                " All classroom grades: "+studentRepo.findAllClassroomGrades();
    }
    //Todo: Join queries end

    //Todo: Subqueries start
    public String usingSubQuery(int classGrade){
        return "usingSubQuery: "+studentRepo.findStudentsByGrade(classGrade);
    }
    //Todo: Subqueries end

    //Todo: Pagination Start
    public String usingPagination(int pNo, int pSize){
        PageRequest pageRequest = PageRequest.of(pNo, pSize);
        return "usingPagination "+studentRepo.findAllStudentsWithPagination(pageRequest);
    }
    //Todo: Pagination end

    //Todo: Sorting start
    public String sortingUse(){
        String descName = "sortingUse Descending: "+studentRepo.findAllStudentsOrderedByNameDesc();
        String classGrade = "sortingClassGrade: "+studentRepo.findAllClassroomGradesSort();
        String classGradeDesc = "sortingClassGradeDesc: "+studentRepo.findAllClassroomGradesSortDesc();
        return "sortingUse Ascending: "+studentRepo.findAllStudentsOrderedByName()+"\n"+descName+"\n"+classGrade+"\n"+classGradeDesc;
    }
    //Todo: Sorting end

    //Todo: batch update start
    @Transactional
    public String batchUpdate(int oldClassId, int newClassId){
        int i = studentRepo.updateClassroomIdByOldValue(oldClassId, newClassId);
        return "batchUpdate "+i;
    }
    //Todo: batch update end

    //Todo: Named Query start
    //Approach One and Two(Using Utility)
    public String namedQueryTest(int classId, int classGrade){
        TypedQuery<Student> findStudentsByClassroomId = entityManager.createNamedQuery("Student.byClassId", Student.class);
        findStudentsByClassroomId.setParameter("classroomId", classId);
        TypedQuery<Classroom> findClassByGrade = entityManager.createNamedQuery("Class.byClassGrade", Classroom.class);
        findClassByGrade.setParameter("grade", classGrade);
        List<Student> studentsUsingClassroomId = studentRepo.findStudentsUsingClassroomId(classId);
        List<Classroom> classroomByGrade = studentRepo.findClassroomByGrade(classGrade);
        return "namedQueryTest: findStudentsByClassroomId "+findStudentsByClassroomId.getResultList()+"\n"+"findClassByGrade: "+findClassByGrade.getResultList()
                +"\n"+"Secondapproach: studentsUsingClassroomId:"+studentsUsingClassroomId+"\n"+"Secondapproach: classroomByGrade:"+classroomByGrade;
    }
    //Todo: Named Query end

    //Todo: Native queries start
    public String jpqlNativeQuery(int classId){
        return "jpqlNativeQuery: "+studentRepo.findStudentsByClassroomIdUsingNativeQuery(classId);
    }
    //Todo: Native queries end
//Todo: Service methods using Jpql: end
}
