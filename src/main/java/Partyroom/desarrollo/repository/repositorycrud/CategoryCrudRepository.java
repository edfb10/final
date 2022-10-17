package Partyroom.desarrollo.repository.repositorycrud;



import Partyroom.desarrollo.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryCrudRepository  extends CrudRepository<Category, Integer> {
    
}
