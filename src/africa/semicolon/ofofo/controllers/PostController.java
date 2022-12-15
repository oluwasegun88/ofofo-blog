package africa.semicolon.ofofo.controllers;

import africa.semicolon.ofofo.controllers.data.models.Post;
import africa.semicolon.ofofo.controllers.dto.requests.CreatePostRequest;
import africa.semicolon.ofofo.controllers.services.PostServiceImpl;
import africa.semicolon.ofofo.controllers.services.PostServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {

    @Autowired
    private  PostServices postServices;
    @PostMapping("/post")
    public String createPost(@RequestBody CreatePostRequest createPostRequest){
        postServices.createPost(createPostRequest);
        return "Successful";
    }

    @GetMapping("/post/{postId}")
    public Post viewPost(@PathVariable String postId){
        return postServices.viewPOst(postId);
    }
}
