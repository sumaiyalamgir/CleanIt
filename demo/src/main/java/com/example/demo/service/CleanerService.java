package com.example.demo.service;

import com.example.demo.entity.Cleaner;
import com.example.demo.repository.CleanerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CleanerService {

    @Autowired
    private CleanerRepository cleanerRepository;

    public Cleaner addCleaner(Cleaner cleaner) {
        return cleanerRepository.save(cleaner);
    }

    public List<Cleaner> getAllCleaners() {
        return cleanerRepository.findAll();
    }
}
