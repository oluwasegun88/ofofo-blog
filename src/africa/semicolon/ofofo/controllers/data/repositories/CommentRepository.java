package africa.semicolon.ofofo.controllers.data.repositories;

import africa.semicolon.ofofo.controllers.data.models.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CommentRepository extends MongoRepository<Comment, String> {

    Comment save(Comment comment);
}
