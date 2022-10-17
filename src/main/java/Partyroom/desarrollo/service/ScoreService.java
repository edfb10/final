package Partyroom.desarrollo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Partyroom.desarrollo.repository.RepositoryScore;

@Service
public class ScoreService {
     
    @Autowired
    private RepositoryScore repositoryScore;

    public RepositoryScore getRepositoryScore() {
        return repositoryScore;
    }

    public void setRepositoryScore(RepositoryScore repositoryScore) {
        this.repositoryScore = repositoryScore;
    }
}
