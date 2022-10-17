package Partyroom.desarrollo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Partyroom.desarrollo.model.Papeleria;
import Partyroom.desarrollo.repository.PapeleriaRepository;
@Service
public class PapeleriaService {
    @Autowired
    private PapeleriaRepository papeleriaRepository;

    public List<Papeleria> getAll(){
        return papeleriaRepository.getAll();
    }

    public Optional <Papeleria> getPapeleria(int id){
        return papeleriaRepository.getPapeleria(id);
    }
    //por si ya etsa creado el id
    public Papeleria save(Papeleria p){
        if(p.getId()==null){
            return papeleriaRepository.save(p);
        }else{
            Optional<Papeleria> paux=papeleriaRepository.getPapeleria(p.getId());
            if(paux.isEmpty()){
                return papeleriaRepository.save(p);
            }else{
                return p;
            }
        }
    }
}
