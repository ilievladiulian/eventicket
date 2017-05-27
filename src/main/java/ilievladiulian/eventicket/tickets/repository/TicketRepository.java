package ilievladiulian.eventicket.tickets.repository;

import ilievladiulian.eventicket.tickets.model.Ticket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Vlad on 27/05/2017.
 */
@Repository
public interface TicketRepository extends CrudRepository<Ticket, Long> {
}
