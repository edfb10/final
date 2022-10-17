package Partyroom.desarrollo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Partyroom.desarrollo.repository.repositorycrud.AdminCrudRepository;


@Repository
public class RepositoryAdmin {
    @Autowired
    private AdminCrudRepository adminCrudRepository;

    public AdminCrudRepository getAdminCrudRepositoryn() {
        return adminCrudRepository;
    }

    public void setAdminCrudRepository(AdminCrudRepository adminCrudRepository) {
        this.adminCrudRepository = adminCrudRepository;
    }
}
