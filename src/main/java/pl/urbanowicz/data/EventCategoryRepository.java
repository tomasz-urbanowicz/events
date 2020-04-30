package pl.urbanowicz.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.urbanowicz.models.EventCategory;

@Repository
public interface EventCategoryRepository extends CrudRepository<EventCategory, Integer> {
}
