package com.example.events.business;

import com.example.events.model.Event.Event;

import java.util.List;

public interface EventService {

    public List<Event> getAll();

    public Event create(Event event);

    public Event getById(Integer id);

    public Event update(Event event);

    public void delete(Integer id);
}
