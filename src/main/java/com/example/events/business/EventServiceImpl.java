package com.example.events.business;

import com.example.events.model.Event.Event;
import com.example.events.model.Event.EventDao;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    private final EventDao eventDao;

    public EventServiceImpl(EventDao eventDao) {
        this.eventDao = eventDao;
    }

    @Override
    public List<Event> getAll() {
        return eventDao.findAll();
    }

    @Override
    public Event create(Event event) {
        return eventDao.save(event);
    }

    @Override
    public Event getById(Integer id) {
        return eventDao.findById(id).orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public Event update(Event event) {
        return eventDao.save(event);
    }

    @Override
    public void delete(Integer id) {
        Event event = eventDao.findById(id).orElse(null);
        eventDao.delete(event);
    }
}
