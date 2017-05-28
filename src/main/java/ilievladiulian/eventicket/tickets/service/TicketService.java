package ilievladiulian.eventicket.tickets.service;

import ilievladiulian.eventicket.tickets.model.Ticket;

/**
 * Created by Vlad on 27/05/2017.
 */
public interface TicketService {
    Ticket getTicket(long id);

    Ticket createTicket(Ticket ticket);

    boolean deleteTicket(long id);
}
