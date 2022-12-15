package services;

import data.models.Post;
import dto.requests.CreatePostRequest;

import java.util.Collection;
import java.util.List;

public interface PostServices {

    void createPost(CreatePostRequest createPostRequest);


    
    void updatePost(int id, String title, String body);
    
    void deletePost(int id);
    
    Post viewPOst(int id);

    List<Post> viewAll();
}
