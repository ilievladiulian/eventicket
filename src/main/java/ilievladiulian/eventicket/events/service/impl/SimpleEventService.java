package ilievladiulian.eventicket.events.service.impl;

import ilievladiulian.eventicket.events.service.EventService;
import ilievladiulian.eventicket.events.model.Event;
import ilievladiulian.eventicket.events.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vlad on 27/05/2017.
 */
@Service
public class SimpleEventService implements EventService {

    private final EventRepository eventRepository;

    @Autowired
    public SimpleEventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public List<Event> getEvents() {
        List<Event> eventsList = (List<Event>) this.eventRepository.findAll();
        return eventsList;
    }
}
