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

            
            newmManager.setResto_id(manager.getResto_id());
            newmManager.setResto_name(manager.getResto_name());
            newmManager.setLoc_name(manager.getLoc_name());
            newmManager.setLoc_long(manager.getLoc_long());
            newmManager.setLoc_lat(manager.getLoc_lat());
            newmManager.setPhone(manager.getPhone());
            newmManager.setRoom_type(manager.getRoom_type());
            newmManager.setStart_time(manager.getStart_time());
            newmManager.setEnd_time(manager.getEnd_time());
            newmManager.setResto_type(manager.getResto_type());
            newmManager.setCapacity(manager.getCapacity());
            newmManager.setStatus(manager.getStatus());
            newmManager.setPro_img_url(manager.getPro_img_url());

            
            return managerRepo.save(newmManager);
        }
        return null;


    }



}











