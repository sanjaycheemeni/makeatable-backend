package com.makeatable.makeatable.services;

import com.makeatable.makeatable.model.Manager;
import com.makeatable.makeatable.model.Rating;
import com.makeatable.makeatable.repository.ManagerRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ManagerService {

    public final ManagerRepo managerRepo;

    public ManagerService(ManagerRepo managerRepo) {
        this.managerRepo = managerRepo;
    }






    // 


    public List<Manager> getAllManager() {
        return managerRepo.findAll();
    }

    public Manager addManager(Manager manager) {
        return managerRepo.save(manager);
    }

    public Manager updateManager(Long id,Manager manager){

        Optional<Manager> optionalRating = managerRepo.findById(id);
        if (optionalRating.isPresent()) {

            Manager newmManager = optionalRating.get();

            
            newmManager.setRestoid(manager.getRestoid());
            newmManager.setRestoname(manager.getRestoname());
            newmManager.setLocname(manager.getLocname());
            newmManager.setLoclong(manager.getLoclong());
            newmManager.setLoclat(manager.getLoclat());
            newmManager.setPhone(manager.getPhone());
            newmManager.setRoomtype(manager.getRoomtype());
            newmManager.setStarttime(manager.getStarttime());
            newmManager.setEndtime(manager.getEndtime());
            newmManager.setRestotype(manager.getRestotype());
            newmManager.setCapacity(manager.getCapacity());
            newmManager.setStatus(manager.getStatus());
            newmManager.setProimgurl(manager.getProimgurl());

            
            return managerRepo.save(newmManager);
        }
        return null;


    }



}











