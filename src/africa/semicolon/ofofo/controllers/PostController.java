package controllers;

import data.models.Post;
import dto.requests.CreatePostRequest;
import services.PostServiceImpl;
import services.PostServices;

public class PostController {

    private PostServices postServices = new PostServiceImpl();

    public String createPost(CreatePostRequest createPostRequest){
        postServices.createPost(createPostRequest);
        return "Successful";
    }

    public Post viewPost(int postId){
        return postServices.viewPOst(postId);
    }
}
