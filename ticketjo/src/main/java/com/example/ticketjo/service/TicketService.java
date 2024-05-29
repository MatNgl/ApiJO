package com.example.ticketjo.service;

import com.example.ticketjo.model.Ticket;
import com.example.ticketjo.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    public Ticket saveTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    public List<Ticket> findAllTickets() {
        return ticketRepository.findAll();
    }

    public Ticket findTicketById(Long id) {
        return ticketRepository.findById(id).orElse(null);
    }

    public void deleteTicketById(Long id) {
        ticketRepository.deleteById(id);
    }
}
