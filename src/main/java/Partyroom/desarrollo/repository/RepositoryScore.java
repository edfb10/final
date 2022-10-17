package Partyroom.desarrollo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Partyroom.desarrollo.repository.repositorycrud.ScoreCrudRepository;

@Repository
public class RepositoryScore {
    @Autowired
    private ScoreCrudRepository scoreCrudRepository;

    public ScoreCrudRepository getScoreCrudRepository() {
        return scoreCrudRepository;
    }

    public void setScoreCrudRepository(ScoreCrudRepository  scoreCrudRepository) {
        this. scoreCrudRepository =  scoreCrudRepository;
    }
}
