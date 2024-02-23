package org.swami.service;

import org.springframework.stereotype.Service;
import org.swami.model.Subject;
import org.swami.repo.SubjectRepo;

import java.util.List;

@Service
public class SubjectService {
    /*Subject Service:

Create a new subject.
Assign subjects to a classroom.
View the list of subjects for a classroom.*/

    private SubjectRepo subjectRepo;

    public SubjectService(SubjectRepo subjectRepo){
        this.subjectRepo=subjectRepo;
    }

    //Todo:Create a new subject.
    public Subject createNewSubject(Subject newSubject){
        return subjectRepo.save(newSubject);
    }

    //Todo:Assign subjects to a classroom.
    public Subject assignSubjectToClassroom(){
        return null;
    }

    //Todo:View the list of subjects for a classroom.
    public List<Subject> getListOfSubjectsOfClass(){
        return null;
    }

}
