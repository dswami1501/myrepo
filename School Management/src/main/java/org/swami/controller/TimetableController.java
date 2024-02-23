package org.swami.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.swami.model.Timetable;
import org.swami.service.TimetableService;

@RestController
@RequestMapping("/school/tt")
public class TimetableController {
    private TimetableService timetableService;

    public TimetableController(TimetableService timetableService){
        this.timetableService=timetableService;
    }

    @PostMapping("/savett")
    public Timetable saveTimetable(@RequestBody Timetable newTimetable){
        return timetableService.createNewTimeTable(newTimetable);
    }
}
