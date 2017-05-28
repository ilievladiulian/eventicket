package ilievladiulian.eventicket.tickets.controller;

/**
 * Created by Vlad on 26/05/2017.
 */
import ilievladiulian.eventicket.tickets.service.TicketService;
import ilievladiulian.eventicket.tickets.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class TicketController {

    private final TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @RequestMapping(value = "/tickets/ticket_details/{id}", method = RequestMethod.GET)
    public Ticket getTicketDetails(@PathVariable(name = "id") long id) {
        return ticketService.getTicket(id);
    }

    @RequestMapping(value = "/tickets/buy_ticket", method=RequestMethod.POST)
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return ticketService.createTicket(ticket);
    }

    @RequestMapping(value = "/tickets/cancel_ticket", method=RequestMethod.POST)
    public boolean cancelTicket(@RequestParam(value = "id") long id) {
        return ticketService.deleteTicket(id);
    }

}
