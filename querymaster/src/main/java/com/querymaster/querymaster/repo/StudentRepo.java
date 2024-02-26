package com.querymaster.querymaster.repo;

import com.querymaster.querymaster.model.Classroom;
import com.querymaster.querymaster.model.Student;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
//Todo: Repo methods using Jpql: start
    //Todo: Basic Crud Operations start
    @Query("SELECT s FROM Student s WHERE s.studentId = :studentId")
    Optional<Student> findStudentById(@Param("studentId") int studentId);

    @Query("SELECT s FROM Student s WHERE s.name = :name")
    Optional<Student> findStudentByName(@Param("name") String name);

    @Query("SELECT s FROM Student s JOIN s.classroom c WHERE c.classroomId = :classroomId")
    Optional<List<Student>> findStudentsByClassroomId(@Param("classroomId") int classroomId);

    @Query("SELECT c FROM Classroom c WHERE c.classroomId = :classroomId")
    Classroom findClassroomById(@Param("classroomId") int classroomId);

    @Modifying
    @Query("UPDATE Student s SET s.name = :name WHERE s.studentId = :studentId")
    int updateStudentName(@Param("name") String name, @Param("studentId") int studentId);

    @Modifying
    @Query("UPDATE Classroom c SET c.grade = :grade WHERE c = (SELECT s.classroom FROM Student s WHERE s.studentId = :studentId)")
    int updateClassroomGradeByStudentId(@Param("grade") int grade, @Param("studentId") int studentId);

    @Modifying
    @Query("DELETE FROM Student s WHERE s.id = :studentId")
    int deleteStudentById(@Param("studentId") int studentId);
    //Todo: Basic Crud Operations end

    //Todo: Aggregation queries start
    @Query("SELECT COUNT(s) FROM Student s JOIN s.classroom c WHERE c.classroomId = :classroomId")
    Long countStudentsByClassroom(@Param("classroomId") int classroomId);

    @Query("SELECT SUM(s.studentId) FROM Student s WHERE s.classroom = :classroom")
    Double calculateTotalStudentidByClassroom(@Param("classroom") Classroom classroom);

    @Query("SELECT MAX(s.studentId) FROM Student s WHERE s.classroom = :classroom")
    Double findHighestStudentidByClassroom(@Param("classroom") Classroom classroom);

    @Query("SELECT MIN(s.studentId) FROM Student s WHERE s.classroom = :classroom")
    Double findLowestStudentidByClassroom(@Param("classroom") Classroom classroom);

    @Query("SELECT AVG(s.studentId) FROM Student s WHERE s.classroom = :classroom")
    Double averageStudentidByClassroom(@Param("classroom") Classroom classroom);
    //Todo: Aggregation queries end

    //Todo: Join queries start
    @Query("SELECT c.grade FROM Student s JOIN s.classroom c")
    List<Integer> findAllClassroomGrades();

    @Query("SELECT c.grade FROM Student s JOIN s.classroom c WHERE s.studentId = :studentId")
    Integer findClassroomGradeByStudentId(@Param("studentId") int studentId);
    //Todo: Join queries end

    //Todo: Subqueries start
    @Query("SELECT s FROM Student s WHERE s.classroom IN (SELECT c FROM Classroom c WHERE c.grade = :grade)")
    List<Student> findStudentsByGrade(@Param("grade") int grade);
    //Todo: Subqueries end

    //Todo: Pagination start
    @Query("SELECT s FROM Student s")
    List<Student> findAllStudentsWithPagination(Pageable pageable);
    /*Page<Student> findAllStudentsWithPagination(Pageable pageable);*/
    //Todo: Pagination end

    //Todo:Sorting start
    @Query("SELECT s FROM Student s ORDER BY s.name")
    List<Student> findAllStudentsOrderedByName();

    @Query("SELECT s FROM Student s ORDER BY s.name DESC")
    List<Student> findAllStudentsOrderedByNameDesc();

    @Query("SELECT DISTINCT s.classroom.grade FROM Student s ORDER BY s.classroom.grade")
    List<Integer> findAllClassroomGradesSort();

    @Query("SELECT DISTINCT s.classroom.grade FROM Student s ORDER BY s.classroom.grade DESC")
    List<Integer> findAllClassroomGradesSortDesc();
    //Todo: Sorting end

    //Todo: batch update start
    @Modifying
    @Query("UPDATE Student s SET s.classroom.classroomId = :newClassroomId WHERE s.classroom.classroomId = :oldClassroomId")
    int updateClassroomIdByOldValue(@Param("oldClassroomId") int oldClassroomId, @Param("newClassroomId") int newClassroomId);
    //Todo: batch update end
//Todo: Service methods using Jpql: end

}
