package africa.semicolon.ofofo.controllers.services;

import africa.semicolon.ofofo.controllers.data.models.Comment;
import africa.semicolon.ofofo.controllers.data.models.Post;
import africa.semicolon.ofofo.controllers.dto.requests.CreatePostRequest;


import java.util.List;

public interface PostServices {

    void createPost(CreatePostRequest createPostRequest);
    
    void updatePost(String id, String title, String body);
    
    void deletePost(String id);
    
    Post viewPOst(String id);

    List<Post> viewAll();
    void addComment(String postId, Comment comment);
}
