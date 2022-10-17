package Partyroom.desarrollo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Partyroom.desarrollo.repository.RepositoryAdmin;

@Service
public class AdminService {
    @Autowired
    private RepositoryAdmin repositoryAdmin;

    public RepositoryAdmin getRepositoryAdmin() {
        return repositoryAdmin;
    }

    public void setRepositoryAdmin(RepositoryAdmin repositoryAdmin) {
        this.repositoryAdmin = repositoryAdmin;
    }
   
}
