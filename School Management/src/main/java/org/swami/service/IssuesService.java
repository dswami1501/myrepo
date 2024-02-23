package org.swami.service;

import org.springframework.stereotype.Service;
import org.swami.model.Issues;
import org.swami.model.Student;
import org.swami.repo.IssuesRepo;

import java.util.List;

@Service
public class IssuesService {
    /*Issues Service:

Report an issue for a student.
Resolve an issue.
View a list of reported issues.*/

    private IssuesRepo issuesRepo;

    public IssuesService(IssuesRepo issuesRepo){
        this.issuesRepo=issuesRepo;
    }

    //Todo: Report an issue for a student.
    public Issues saveNewIssue(Issues newIssue){
        return issuesRepo.save(newIssue);
    }

    //Todo: Resolve an Issue
    public String resolveAnIssue(){
        return null;
    }

    //Todo: View a list of reported issues.
    public List<Issues> getIssuesList(){
        return null;
    }

    public Issues setStudentIssueInIssuesTable(Student studentIssue) {
        List<Issues> issues = studentIssue.getIssues();
        Issues issue =null;
        if(issues!=null){
            for (Issues singleIssue:issues){
                issue=issuesRepo.save(singleIssue);
            }
        }
        return issue;
    }
}
