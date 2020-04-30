package pl.urbanowicz.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.urbanowicz.models.Event;

@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {
}
