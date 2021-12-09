package com.seisme.configurations;


import com.seisme.repositories.SeismeRepository;
import com.seisme.services.SeismeService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SeismeConfiguration {

    @Bean
    public SeismeService SeismeService(
            SeismeRepository repository,
            ModelMapper mapper

    ){
        return new SeismeService(repository, mapper);
    }
}
