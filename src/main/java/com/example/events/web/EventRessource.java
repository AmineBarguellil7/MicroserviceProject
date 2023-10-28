package com.example.events.web;

import com.example.events.business.EventService;
import com.example.events.model.Event.Event;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/events")
@CrossOrigin(origins = "http://localhost:4200")
public class EventRessource {

    private final EventService eventService;

    public EventRessource(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping
    public List<Event> getEvents() {
        return eventService.getAll();
    }

    @GetMapping("/{id}")
    public Event getEvent(@PathVariable Integer id) {
        return eventService.getById(id);
    }

    @PostMapping
    public Event createEvent(@RequestBody Event event) {
        return eventService.create(event);
    }

    @PutMapping
    public Event updateEvent(@RequestBody Event event) {
        return eventService.update(event);
    }

    @DeleteMapping
    public void deleteEvent(@PathVariable Integer id) {
        eventService.delete(id);
    }

}
