package com.seisme.controllers;


import com.seisme.localisationdtos.LocalisationDTO;
import com.seisme.localisationdtos.LocalisationDeleteDTO;
import com.seisme.localisationdtos.LocalisationSaveDTO;
import com.seisme.localisationdtos.LocalisationUpdateDTO;
import com.seisme.services.LocalisationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/localisation")
public class LocalisationController {

    LocalisationService service;

    public LocalisationController(LocalisationService service) {
        this.service = service;
    }

    @GetMapping
    public List<LocalisationDTO> findAll() {
        return service.findAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<LocalisationDTO> find(@PathVariable String id) {
        LocalisationDTO localisationDTO = service.find(id);
        if (localisationDTO == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(localisationDTO);
    }

    @PostMapping
    public ResponseEntity<LocalisationDTO> save(@RequestBody LocalisationSaveDTO localisationSaveDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(localisationSaveDTO));
    }

    @PutMapping
    public ResponseEntity<LocalisationDTO> update(@RequestBody LocalisationUpdateDTO localisationUpdateDTO) {
        return ResponseEntity.ok(service.update(localisationUpdateDTO));
    }

    @DeleteMapping
    public ResponseEntity<Boolean> delete(@RequestBody LocalisationDeleteDTO lcoalisationDeleteDTO) {
        service.delete(lcoalisationDeleteDTO);
        return ResponseEntity.ok(true);
    }

}
