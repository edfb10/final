package Partyroom.desarrollo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import Partyroom.desarrollo.service.ScoreService;

@RestController
public class ScoreController {
    @Autowired
    private ScoreService scoreService;

    public ScoreService getScoreService() {
        return scoreService;
    }

    public void setScoreService(ScoreService scoreService) {
        this.scoreService = scoreService;
    }
}
