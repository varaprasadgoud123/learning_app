package com.learning_app.robosoft.learning.app.rest;

import com.learning_app.robosoft.learning.app.entity.Chapter;
import com.learning_app.robosoft.learning.app.model.SubjectId;
import com.learning_app.robosoft.learning.app.service.ChapterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ChapterRestController {

    private ChapterService chapterService;

    public ChapterRestController(ChapterService theChapterService){
        chapterService = theChapterService;
    }

    @PostMapping("/chapter")
    public Chapter save(@RequestBody Chapter chapter){
        return chapterService.save(chapter);
    }

    @DeleteMapping("/chapter/{id}")
    public String delete(@PathVariable int id){
        chapterService.delete(id);
        return "chapter deleted successfully!";
    }

    @GetMapping("/chapter")
    public List<Chapter> findAll(){
        return chapterService.viewAll();
    }

//    @GetMapping("/chapter")
//    public List<Chapter> findAllBySubjectId(@RequestBody SubjectId id){
//        return chapterService.findBySubjectId(id.getSubjectId());
//    }
}
