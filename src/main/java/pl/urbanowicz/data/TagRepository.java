package pl.urbanowicz.data;

import org.springframework.data.repository.CrudRepository;
import pl.urbanowicz.models.Tag;

public interface TagRepository extends CrudRepository<Tag, Integer> {
}
