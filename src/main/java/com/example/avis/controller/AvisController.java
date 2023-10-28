package com.example.avis.controller;

import com.example.avis.entity.Avis;
import com.example.avis.Service.IAvisService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/avis")
@CrossOrigin(origins = "http://localhost:4200")
public class AvisController {

    private  IAvisService avisService;

    @PostMapping("/add")
    Avis addAvis(@RequestBody Avis avis){
        return avisService.addAvis(avis);
    }
    @PutMapping("/update")
    Avis updateAvis(@RequestBody Avis avis){
        return avisService.updateAvis(avis);
    }
    @GetMapping("/get/{id}")
    Avis getAvis(@PathVariable("id") Integer idAvis){
        return avisService.retrieveAvis(idAvis);
    }
    @GetMapping("/all")
    List<Avis> getAllAvis(){
        return avisService.retrieveAllAvis();
    }
    @DeleteMapping("/delete/{id}")
    void deleteAvis(@PathVariable("id") Integer idAvis){
        avisService.removeAvis(idAvis);
    }
}
