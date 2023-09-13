package com.makeatable.makeatable.repository;

import com.makeatable.makeatable.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepo extends JpaRepository<Booking,Long> {
}
