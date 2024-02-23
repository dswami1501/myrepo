package org.swami.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.swami.model.Issues;
import org.swami.service.IssuesService;

@RestController
@RequestMapping("/school/issue")
public class IssuesController {
    private IssuesService issuesService;

    public IssuesController(IssuesService issuesService){
        this.issuesService=issuesService;
    }

    @PostMapping("/savei")
    public Issues saveExam(@RequestBody Issues newIssue){
        return issuesService.saveNewIssue(newIssue);
    }
}
