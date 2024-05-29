package com.example.ticketjo.repository;

import com.example.ticketjo.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {}
