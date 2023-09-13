package com.makeatable.makeatable.repository;

import com.makeatable.makeatable.model.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepo extends JpaRepository<Manager,Long> {
}
