package com.seisme.controllers;


import com.seisme.seismedtos.SeismeDTO;
import com.seisme.seismedtos.SeismeDeleteDTO;
import com.seisme.seismedtos.SeismeSaveDTO;
import com.seisme.seismedtos.SeismeUpdateDTO;
import com.seisme.services.SeismeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seisme")
public class SeismeController {

    SeismeService service;

    public SeismeController(SeismeService service) {
        this.service = service;
    }

    @GetMapping
    public List<SeismeDTO> findAll() {
        return service.findAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<SeismeDTO> find(@PathVariable String id) {
        SeismeDTO seismeDTO = service.find(id);
        if (seismeDTO == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(seismeDTO);
    }


    @PostMapping
    public ResponseEntity<SeismeDTO> save(@RequestBody SeismeSaveDTO seismeSaveDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(seismeSaveDTO));
    }

    @PutMapping
    public ResponseEntity<SeismeDTO> update(@RequestBody SeismeUpdateDTO seismeUpdateDTO) {
        return ResponseEntity.ok(service.update(seismeUpdateDTO));
    }

    @DeleteMapping
    public ResponseEntity<Boolean> delete(@RequestBody SeismeDeleteDTO seismeDeleteDTO) {
        service.delete(seismeDeleteDTO);
        return ResponseEntity.ok(true);
    }

}










