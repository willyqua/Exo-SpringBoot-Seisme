package com.seisme.services;

import com.seisme.entities.Seisme;
import com.seisme.repositories.SeismeRepository;
import com.seisme.seismedtos.SeismeDTO;
import com.seisme.seismedtos.SeismeDeleteDTO;
import com.seisme.seismedtos.SeismeSaveDTO;
import com.seisme.seismedtos.SeismeUpdateDTO;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SeismeService implements CRUDService<SeismeDTO, SeismeSaveDTO, SeismeUpdateDTO, SeismeDeleteDTO>{

    SeismeRepository repository;
    ModelMapper mapper;

    public SeismeService(SeismeRepository repository ,ModelMapper mapper ){
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<SeismeDTO> findAll() {
        List<SeismeDTO> seismeDTOS = new ArrayList<>();
        this.repository.findAll().forEach(user -> {
            seismeDTOS.add(mapper.map(user, SeismeDTO.class));
        });
        return seismeDTOS;
    }

    @Override
    public SeismeDTO find(String id) {
       Optional<Seisme> s = repository.findById(id);
       SeismeDTO seismeDTO = null;
       if(s.isPresent()) {
           seismeDTO = mapper.map(s,SeismeDTO.class);
       }
        return seismeDTO;
    }

    @Override
    public SeismeDTO save(SeismeSaveDTO ojb) {
        Seisme seismeToSave =  mapper.map(
                ojb,
                Seisme.class
        );
        Seisme seisme = repository.save(seismeToSave);
        SeismeDTO seismeSaved = mapper.map(seisme, SeismeDTO.class);
        return seismeSaved;
    }

    @Override
    public SeismeDTO update(SeismeUpdateDTO obj) {
        Seisme seismeToUpdate =  mapper.map(
                obj,
                Seisme.class
        );
        Seisme seisme = repository.save(seismeToUpdate);
        SeismeDTO seismeSaved = mapper.map(seisme, SeismeDTO.class);
        return seismeSaved;
    }

    @Override
    public void delete(SeismeDeleteDTO obj) {
        Seisme seismeTodelete = mapper.map(
                obj,
                Seisme.class
        );
        repository.delete(seismeTodelete);
    }
}
