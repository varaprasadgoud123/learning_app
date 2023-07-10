package com.learning_app.robosoft.learning.app.rest;

import com.learning_app.robosoft.learning.app.entity.Subject;
import com.learning_app.robosoft.learning.app.service.SubjectServiceImpl;
import com.learning_app.robosoft.learning.app.service.SubjectServie;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SubjectRestController {

    private SubjectServie subjectServie;

    public SubjectRestController(SubjectServie theSubjectService){
        subjectServie = theSubjectService;
    }

    @PostMapping("/subject")
    public Subject save(@RequestBody Subject subject){
        return subjectServie.save(subject);
    }

    @DeleteMapping("/subject/{subject}")
    public String delete(@PathVariable int subject){
        subjectServie.delete(subject);
        return "subject deleted successfully!";
    }

    @GetMapping("/subject")
    public List<Subject> findAllSubjects(){
        return subjectServie.findAllSubjects();
    }
}
