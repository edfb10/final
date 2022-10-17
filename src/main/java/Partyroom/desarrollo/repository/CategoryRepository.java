package Partyroom.desarrollo.repository;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Partyroom.desarrollo.model.Category;

import Partyroom.desarrollo.repository.repositorycrud.CategoryCrudRepository;

@Repository
public class CategoryRepository {
    @Autowired
    private CategoryCrudRepository categoryCrudRepository;

    public List<Category> getAll() {
        return (List<Category>) categoryCrudRepository.findAll();
    }
    public Optional<Category> getCategory(int id){
        return categoryCrudRepository.findById(id);
    }
    public Category save(Partyroom.desarrollo.model.Category category){
        return categoryCrudRepository.save(category);
    }
    public void delete(Category category){
        categoryCrudRepository.delete(category);
    }
}
