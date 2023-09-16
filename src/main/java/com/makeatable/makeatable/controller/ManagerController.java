package com.makeatable.makeatable.controller;

import com.makeatable.makeatable.model.Manager;
import com.makeatable.makeatable.model.Rating;
import com.makeatable.makeatable.services.ManagerService;
import com.makeatable.makeatable.util.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.transform.OutputKeys;

import static java.time.LocalDateTime.now;
import static java.util.Map.of;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/rating")
@RequiredArgsConstructor
public class ManagerController {

    private final ManagerService managerService;

    @GetMapping("/list")
    public ResponseEntity<Response> getAllManager() {
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(of("", managerService.getAllManager()))
                        .message("list of all managers")
                        .status(OK)
                        .statusCode(OK.value())
                        .build());

    }

    @PostMapping("/create")
    @ResponseBody
    public ResponseEntity<Response> addManager(@RequestBody Manager manager) {
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(of("Added Manager", managerService.addManager(manager)))
                        .message("Manager added")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()


        );
    }


        public  ResponseEntity<Response> updatemanager(@RequestBody Manager manager, @PathVariable("id") Long id){

        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(of("Updated manager", managerService.updateManager( id,manager)))
                        .message("manager updated")
                        .status(OK)
                        .statusCode(OK.value())
                       .build()

        );
    }

}


