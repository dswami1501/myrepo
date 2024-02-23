package org.swami.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.swami.model.Result;
import org.swami.service.ResultService;

@RestController
@RequestMapping("/school/result")
public class ResultController {
    private ResultService resultService;

    public ResultController(ResultService resultService){
        this.resultService=resultService;
    }

    @PostMapping("/saveres")
    public Result saveResult(@RequestBody Result newresult){
        return resultService.saveResult(newresult);
    }
}
