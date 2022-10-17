package Partyroom.desarrollo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Partyroom.desarrollo.model.Partyroom;
import Partyroom.desarrollo.repository.repositorycrud.PartyroomCrudRepository;

@Repository
public class PartyroomRepository {
    @Autowired
    private PartyroomCrudRepository partyroomCrudRepository;

    public List<Partyroom> getAll() {
        return (List<Partyroom>) partyroomCrudRepository.findAll();
    }
    public Optional<Partyroom> getPartyroom(int id){
        return partyroomCrudRepository.findById(id);
    }
    public Partyroom save(Partyroom partyroom){
        return partyroomCrudRepository.save(partyroom);
    }
    public void delete(Partyroom partyroom){
        partyroomCrudRepository.delete(partyroom);
    }
}
