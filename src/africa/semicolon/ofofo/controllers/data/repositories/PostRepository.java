package africa.semicolon.ofofo.controllers.data.repositories;

import africa.semicolon.ofofo.controllers.data.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post,String> {

    Post findPostById(String id);
}
