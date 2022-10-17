package Partyroom.desarrollo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Partyroom.desarrollo.model.Category;
import Partyroom.desarrollo.repository.CategoryRepository;


@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAll() {
        return categoryRepository.getAll();
    }

    public Optional<Category> getCategory(int id) {
        return categoryRepository.getCategory(id);
    }

    public Category save(Category category) {
        if (category.getId() == null) {
            return categoryRepository.save(category);
        } else {
            Optional<Category> tmpCategory = categoryRepository.getCategory(category.getId());
            if (tmpCategory.isEmpty()) {
                return categoryRepository.save(category);
            } else {
                return category;
            }
        }
    }

    public Category update(Category category) {
        if (category.getId() != null) {
            Optional<Category> tmpCategory = categoryRepository.getCategory(category.getId());
            if (!tmpCategory.isEmpty()) {
                return categoryRepository.save(category);
            }
        }
        return category;
    }

    public boolean deleteCategory(int id) {
        Boolean result = getCategory(id).map(category -> {
            categoryRepository.delete(category);
            return true;
        }).orElse(false);
        return result;
    }
}

