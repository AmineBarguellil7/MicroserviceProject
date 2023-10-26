package com.example.events.model.Event;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EventDao extends JpaRepository<Event,Integer> {
}
