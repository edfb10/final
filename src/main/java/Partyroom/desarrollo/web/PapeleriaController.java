package Partyroom.desarrollo.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import Partyroom.desarrollo.model.Papeleria;
import Partyroom.desarrollo.service.PapeleriaService;

@RestController
@RequestMapping ("/api/Papeleria")
@CrossOrigin (origins ="*",methods ={RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class PapeleriaController {
    @Autowired
    private PapeleriaService papeleriaService;


    @GetMapping("/all")
    public List<Papeleria> gePapelerias(){
        return papeleriaService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Papeleria> getPapeleria(@PathVariable("id")int id){
        return papeleriaService.getPapeleria(id);

    }
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Papeleria save(Papeleria p){
        return papeleriaService.save(p);
    }
}
