package com.makeatable.makeatable.controller;

import org.springframework.http.ResponseEntity;

import com.makeatable.makeatable.model.Food;
import com.makeatable.makeatable.services.FoodService;
import com.makeatable.makeatable.util.Response;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import static java.time.LocalDateTime.now;
import static java.util.Map.*;
import static org.springframework.http.HttpStatus.OK;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@RestController
@RequestMapping("/api/food")
@RequiredArgsConstructor
public class FoodController {

    private final FoodService foodService;


    @PostMapping("/upload")
    @ResponseBody
    public String upload(@RequestPart MultipartFile img) throws IOException{
        String imgName = img.getOriginalFilename();
        System.out.println(imgName);
        // Post p = new Post();
        // p.setTitle(title);
        // p.setImageName(imgName);
        // postService.add(p);
        File upl = new File("images/" + imgName);
        upl.createNewFile();
        FileOutputStream fout = new FileOutputStream(upl);
        fout.write(img.getBytes());
        fout.close();
        return "api_url/images/"+imgName;
    }


    @GetMapping("/list")
    public ResponseEntity<Response> getaAllFoods() {
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(of("servers",foodService.getAllFoods()))
                        .message("list of all foods")
                        .status(OK)
                        .statusCode(OK.value())
                        .build());
    }

    

    @PostMapping
    public ResponseEntity<Response> addNewFood( @RequestBody Food food) {
        System.out.println(food);
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(of("Added food ",foodService.addFood(food)))
                        .message("Food Item Added")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()

        );
    }

}
