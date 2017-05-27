package ilievladiulian.eventicket.tickets.service.impl;

import ilievladiulian.eventicket.tickets.model.Ticket;
import ilievladiulian.eventicket.tickets.repository.TicketRepository;
import ilievladiulian.eventicket.tickets.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Vlad on 27/05/2017.
 */
@Service
public class SimpleTicketService implements TicketService {

    private final TicketRepository ticketRepository;

    @Autowired
    public SimpleTicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public Ticket getTicket(long id) {
        return ticketRepository.findOne(id);
    }

    @Override
    public Ticket createTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }
}
