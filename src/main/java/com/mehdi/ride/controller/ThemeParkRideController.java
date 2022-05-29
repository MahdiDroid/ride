package com.mehdi.ride.controller;


import com.mehdi.ride.Entity.ThemeParkRide;
import com.mehdi.ride.Repository.ThemeParkRideRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ThemeParkRideController {


    private final ThemeParkRideRepository themeParkRideRepository;

    public ThemeParkRideController(ThemeParkRideRepository themeParkRideRepository) {
        this.themeParkRideRepository = themeParkRideRepository;
    }

    @GetMapping(value = "/ride", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<ThemeParkRide> getRides(){
        return themeParkRideRepository.findAll();
    }

    @PostMapping(value = "/ride",
            consumes = MediaType.APPLICATION_JSON_VALUE,
             produces = MediaType.APPLICATION_JSON_VALUE )
    public ThemeParkRide addTheme(@RequestBody ThemeParkRide themeParkRide){
        return themeParkRideRepository.save(themeParkRide);
    }
    @GetMapping(value = "/ride/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ThemeParkRide getRide(@PathVariable String name){
       return themeParkRideRepository.findByName(name);
    }
}
