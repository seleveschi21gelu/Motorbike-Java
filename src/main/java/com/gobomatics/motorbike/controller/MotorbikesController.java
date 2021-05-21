package com.gobomatics.motorbike.controller;

import com.gobomatics.motorbike.models.Motorbike;
import com.gobomatics.motorbike.repositories.MotorbikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/motorbikes")
public class MotorbikesController {

    @Autowired
    private MotorbikeRepository motorbikeRepository;

    @GetMapping
    public List<Motorbike> motorbikeList() {
        return motorbikeRepository.findAll();
    }


    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Motorbike motorbike) {
        System.out.println("Motorbike was created");
        motorbikeRepository.save(motorbike);
    }

    @GetMapping("/{id}")
    public Motorbike getMotorbike(@PathVariable long id) {
        return motorbikeRepository.getOne(id);
    }

    @PutMapping("/{id}")
    public Motorbike edit(@PathVariable long id,@RequestBody Motorbike motorbike){
        motorbike.setId(id);
        return motorbikeRepository.save(motorbike);
    }

}
