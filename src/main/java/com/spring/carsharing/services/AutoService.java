package com.spring.carsharing.services;

import com.spring.carsharing.models.Auto;
import com.spring.carsharing.repositories.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AutoService {

    @Autowired
    private AutoRepository autoRepository;

    public void addAuto(Auto auto){
        autoRepository.save(auto);
    }


}
