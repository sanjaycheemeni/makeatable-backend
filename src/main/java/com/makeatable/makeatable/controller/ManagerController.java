package com.makeatable.makeatable.controller;

public class ManagerController {
<<<<<<< Updated upstream
=======
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
>>>>>>> Stashed changes
}
