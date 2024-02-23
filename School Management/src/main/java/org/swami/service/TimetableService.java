package org.swami.service;

import org.springframework.stereotype.Service;
import org.swami.model.Timetable;
import org.swami.repo.TimetableRepo;

@Service
public class TimetableService {
    /*Timetable Service:

Create a timetable for a classroom.
View the timetable for a classroom.
Update the timetable.*/

    private TimetableRepo timetableRepo;

    public TimetableService(TimetableRepo timetableRepo){
        this.timetableRepo=timetableRepo;
    }

    //Todo:Create a timetable for a classroom.
    public Timetable createNewTimeTable(Timetable timetable){
        return timetableRepo.save(timetable);
    }

    //Todo: View the timetable for a classroom.
    public Timetable getTimeTableForClassRoom(){
        return null;
    }

    //Todo: Update the timetable.
    public Timetable updateTime(){
        return null;
    }
}
