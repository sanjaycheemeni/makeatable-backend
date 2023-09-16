package com.makeatable.makeatable.controller;

import com.makeatable.makeatable.model.Booking;
import com.makeatable.makeatable.model.Manager;
import com.makeatable.makeatable.services.BookingService;
import com.makeatable.makeatable.util.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import static java.util.Map.of;

import static io.micrometer.common.KeyValue.of;
import static java.time.LocalDateTime.now;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/booking")
@RequiredArgsConstructor
public class BookingController {
    private final BookingService bookingService;

    @GetMapping("/list")
    public ResponseEntity<Response> getAllBooking() {
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(of("", bookingService.getAllBooking()))
                        .message("list of all managers")
                        .status(OK)
                        .statusCode(OK.value())
                        .build());
    }

    @PostMapping("/create")
    @ResponseBody
    public ResponseEntity<Response> addBooking(@RequestBody Booking booking) {
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(of("Added Booking", bookingService.addBooking(booking)))
                        .message("Booking added")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()

        );

    }


    public ResponseEntity<Response> updateBooking(@RequestBody Booking booking, @PathVariable("id") Long id){
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(of("Update booking", bookingService.updateBooking(booking, id)))
                        .message("Booking update")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );

    }

}
