package Partyroom.desarrollo.repository.repositorycrud;

import org.springframework.data.repository.CrudRepository;

import Partyroom.desarrollo.model.Message;

public interface MessageCrudRepository extends CrudRepository<Message, Integer>{
    
}
