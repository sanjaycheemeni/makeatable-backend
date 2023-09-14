package com.makeatable.makeatable.services;

import com.makeatable.makeatable.model.Booking;
import com.makeatable.makeatable.repository.BookingRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class BookingService {

    public final BookingRepo bookingRepo;

    public BookingService(BookingRepo bookingRepo) {
        this.bookingRepo = bookingRepo;
    }

    public List<Booking> getAllBooking() {
        return bookingRepo.findAll();
    }
    public Booking addBooking(Booking booking) {
        return bookingRepo.save(booking);
    }

    public Booking updateBooking(Booking booking, Long id) {

        Optional<Booking> optionalBooking = bookingRepo.findById(id);
        if (optionalBooking.isPresent()) {
            Booking newBoooking = optionalBooking.get();

            newBoooking.setBooking_id(booking.getBooking_id());
            newBoooking.setUsername(booking.getUsername());

            return bookingRepo.save(newBoooking);

        }
        return null;
    }


}
