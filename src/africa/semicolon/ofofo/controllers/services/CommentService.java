package africa.semicolon.ofofo.controllers.services;

import africa.semicolon.ofofo.controllers.data.models.Comment;
import africa.semicolon.ofofo.controllers.dto.requests.CreateCommentRequest;

import java.util.List;

public interface CommentService {

    void createComment(CreateCommentRequest createCommentRequest);

    List<Comment>viewAll();

}
