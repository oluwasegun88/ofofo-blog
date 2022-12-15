package africa.semicolon.ofofo.controllers;

import africa.semicolon.ofofo.controllers.dto.requests.CreateCommentRequest;
import africa.semicolon.ofofo.controllers.services.CommentService;
import africa.semicolon.ofofo.controllers.services.CommentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping("/comment")
    public String addComment(@RequestBody CreateCommentRequest createCommentRequest){
        commentService.createComment(createCommentRequest);
        return "Comment added";
    }
}
