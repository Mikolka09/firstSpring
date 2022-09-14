package itstep.firstspring.repos;

import itstep.firstspring.entities.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
