package com.example.ticketjo.service;

import com.example.ticketjo.model.Stadium;
import com.example.ticketjo.repository.StadiumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StadiumService {
    @Autowired
    private StadiumRepository stadiumRepository;

    public Stadium saveStadium(Stadium stadium) {
        return stadiumRepository.save(stadium);
    }

    public List<Stadium> findAllStadiums() {
        return stadiumRepository.findAll();
    }

    public Stadium findStadiumById(Long id) {
        return stadiumRepository.findById(id).orElse(null);
    }

    public void deleteStadiumById(Long id) {
        stadiumRepository.deleteById(id);
    }
}
