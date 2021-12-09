package com.seisme.services;

import com.seisme.entities.Localisation;
import com.seisme.localisationdtos.LocalisationDTO;
import com.seisme.localisationdtos.LocalisationDeleteDTO;
import com.seisme.localisationdtos.LocalisationSaveDTO;
import com.seisme.localisationdtos.LocalisationUpdateDTO;
import com.seisme.repositories.LocalisationRepository;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LocalisationService  implements CRUDService<LocalisationDTO, LocalisationSaveDTO, LocalisationUpdateDTO, LocalisationDeleteDTO> {

    LocalisationRepository repository;
    ModelMapper mapper;

    public LocalisationService(LocalisationRepository repository, ModelMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;

    }

    @Override
    public List<LocalisationDTO> findAll() {
        List<LocalisationDTO> localisationDTOS = new ArrayList<>();
        this.repository.findAll().forEach(post -> {
            localisationDTOS.add(mapper.map(post, LocalisationDTO.class));
        });
        return localisationDTOS;
    }

    @Override
    public LocalisationDTO find(String id) {
        Optional<Localisation> l = repository.findById(id);
        LocalisationDTO localisationDTO = null;
        if (l.isPresent()) {
            localisationDTO = mapper.map(l, LocalisationDTO.class);
        }
        return localisationDTO;
    }

    @Override
    public LocalisationDTO save(LocalisationSaveDTO obj) {
        Localisation localisationToSave = mapper.map(
                obj,
                Localisation.class
        );
        Localisation localisation = repository.save(localisationToSave);
        LocalisationDTO localisationSave = mapper.map(localisation, LocalisationDTO.class);
        return localisationSave;
    }

    @Override
    public LocalisationDTO update(LocalisationUpdateDTO obj) {
        Localisation localisationToUpdate = mapper.map(
                obj,
                Localisation.class
        );
        Localisation localisation = repository.save(localisationToUpdate);
        LocalisationDTO localisationSave = mapper.map(localisation, LocalisationDTO.class);
        return localisationSave;
    }

    @Override
    public void delete(LocalisationDeleteDTO obj) {
        Localisation localisationToSave = mapper.map (
                obj,
                Localisation.class
        );
        repository.delete(localisationToSave);

    }
}
