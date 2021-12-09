package com.seisme.configurations;

import com.seisme.repositories.LocalisationRepository;
import com.seisme.services.LocalisationService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LocalisationConfiguration {
    @Bean
    public LocalisationService localisationService(
            LocalisationRepository repository,
            ModelMapper mapper

    ){
        return new LocalisationService(repository, mapper);
    }
}
