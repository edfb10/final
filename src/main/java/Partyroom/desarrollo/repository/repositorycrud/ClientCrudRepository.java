package Partyroom.desarrollo.repository.repositorycrud;

import org.springframework.data.repository.CrudRepository;

import Partyroom.desarrollo.model.Client;

public interface ClientCrudRepository extends CrudRepository<Client, Integer>  {
    
}
