package ilievladiulian.eventicket.events.controller;

/**
 * Created by Vlad on 26/05/2017.
 */
import ilievladiulian.eventicket.events.service.EventService;
import ilievladiulian.eventicket.events.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class EventController {

    private final EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @RequestMapping(value = "/events/list_events", method = RequestMethod.GET)
    public List<Event> getEvents() {
        return this.eventService.getEvents();
    }


}
