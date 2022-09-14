package itstep.firstspring.repos;

import itstep.firstspring.entities.SiteContact;
import org.springframework.data.repository.CrudRepository;

public interface SiteContactsRepository extends CrudRepository<SiteContact, Long> {
}
