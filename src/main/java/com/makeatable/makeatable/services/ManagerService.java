package com.makeatable.makeatable.services;

import com.makeatable.makeatable.model.Manager;
import com.makeatable.makeatable.repository.ManagerRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService {

    public final ManagerRepo managerRepo;

    public ManagerService(ManagerRepo managerRepo) {
        this.managerRepo = managerRepo;
    }
    public List<Manager> getAllManager() {
        return managerRepo.findAll();
    }

    public Manager addManager(Manager manager) {
        return managerRepo.save(manager);
    }

    public Manager updateManager(Manager manager){

    }
}
