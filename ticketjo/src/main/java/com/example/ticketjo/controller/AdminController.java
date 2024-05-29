package com.example.ticketjo.controller;

import com.example.ticketjo.model.Event;
import com.example.ticketjo.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @Autowired
    private EventService eventService;

    @PostMapping("/events")
    public Event createEvent(@RequestBody Event event) {
        return eventService.saveEvent(event);
    }

    @PutMapping("/events/{id}/open")
    public Event openEvent(@PathVariable Long id) {
        Event event = eventService.findEventById(id);
        event.setStatus("OPEN");
        return eventService.saveEvent(event);
    }

    @PutMapping("/events/{id}/close")
    public Event closeEvent(@PathVariable Long id) {
        Event event = eventService.findEventById(id);
        event.setStatus("CLOSED");
        return eventService.saveEvent(event);
    }

    @PutMapping("/events/{id}/postpone")
    public Event postponeEvent(@PathVariable Long id, @RequestParam String newDate) {
        Event event = eventService.findEventById(id);
        event.setStatus("POSTPONED");
        event.setDate(LocalDate.parse(newDate));
        return eventService.saveEvent(event);
    }

    @DeleteMapping("/events/{id}")
    public void cancelEvent(@PathVariable Long id) {
        eventService.deleteEventById(id);
    }
}
