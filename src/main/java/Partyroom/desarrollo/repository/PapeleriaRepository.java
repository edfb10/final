package Partyroom.desarrollo.repository;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Partyroom.desarrollo.model.Papeleria;
import Partyroom.desarrollo.repository.repositorycrud.PapeleriaCrudRepository;

import java.util.List;


@Repository
public class PapeleriaRepository {
    @Autowired
    private PapeleriaCrudRepository papeleriaCrudRepository;

    public List<Papeleria> getAll(){
        return (List<Papeleria>) papeleriaCrudRepository.findAll();
    }

    public Optional<Papeleria> getPapeleria(int id){
        return papeleriaCrudRepository.findById(id);
    }

    public Papeleria save(Papeleria p){
        return papeleriaCrudRepository.save(p);
    }
}
