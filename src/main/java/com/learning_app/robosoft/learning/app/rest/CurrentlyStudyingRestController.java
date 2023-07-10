package com.learning_app.robosoft.learning.app.rest;

import com.learning_app.robosoft.learning.app.entity.CurrentlyStudying;
import com.learning_app.robosoft.learning.app.model.Token;
import com.learning_app.robosoft.learning.app.service.CurrentlyStudyingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CurrentlyStudyingRestController {

    private CurrentlyStudyingService currentlyStudyingService;

    public CurrentlyStudyingRestController( CurrentlyStudyingService theCurrentlySudyingService){
        currentlyStudyingService  = theCurrentlySudyingService;
    }

    @PostMapping("/currently_studying")
    private CurrentlyStudying newCurrentlyStudyingEntry(@RequestBody  CurrentlyStudying currentlyStudying){
        return currentlyStudyingService.save(currentlyStudying);
    }

    @GetMapping("/currently_studying")
    private List<CurrentlyStudying> currentlyStudyingList(@RequestBody Token token){
        return  currentlyStudyingService.findAllByUserId(token.getToken());
    }
}
