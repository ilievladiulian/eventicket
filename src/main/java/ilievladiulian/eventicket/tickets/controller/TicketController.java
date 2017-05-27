package ilievladiulian.eventicket.tickets.controller;

/**
 * Created by Vlad on 26/05/2017.
 */
import ilievladiulian.eventicket.tickets.service.TicketService;
import ilievladiulian.eventicket.tickets.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class TicketController {

    private final TicketService ticketService;

    private List<Ticket> ticketList = new ArrayList<>();

    @Autowired
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @RequestMapping(value = "/tickets/{id}", method = RequestMethod.GET)
    public Ticket getTicketDetails(@PathVariable(name = "id") long id) {
        return ticketService.getTicket(id);
    }

    @RequestMapping(value = "/tickets", method=RequestMethod.POST)
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return ticketService.createTicket(ticket);
    }

    @RequestMapping(value = "/cancel_ticket", method=RequestMethod.POST)
    public boolean cancelTicket(@RequestParam(value = "price", defaultValue = "0.00") double price, @RequestParam(value = "event_id", defaultValue = "0") long eventID) {
        return false;
    }

}
