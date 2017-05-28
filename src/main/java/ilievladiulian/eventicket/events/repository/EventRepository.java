package ilievladiulian.eventicket.events.repository;

import ilievladiulian.eventicket.events.model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Vlad on 27/05/2017.
 */
@Repository
public interface EventRepository extends CrudRepository<Event, Long> {
}
