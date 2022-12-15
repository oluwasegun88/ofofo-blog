package africa.semicolon.ofofo.controllers.services;

import africa.semicolon.ofofo.controllers.data.models.Comment;
import africa.semicolon.ofofo.controllers.data.repositories.CommentRepository;
import africa.semicolon.ofofo.controllers.dto.requests.CreateCommentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
   private CommentRepository commentRepository ;

    @Autowired
    private PostServices postServices;


    @Override
    public void createComment(CreateCommentRequest createCommentRequest) {
        Comment comment = new Comment();
        comment.setComment(createCommentRequest.getComment());
        comment.setComment(createCommentRequest.getCommenterName());
        Comment savedComment = commentRepository.save(comment);
        postServices.addComment(createCommentRequest.getGetId(), savedComment);
    }

    @Override
    public List<Comment>viewAll(){
        return commentRepository.findAll();
    }
}
