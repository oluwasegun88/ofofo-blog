package africa.semicolon.ofofo.controllers.services;

import africa.semicolon.ofofo.controllers.data.models.Comment;
import africa.semicolon.ofofo.controllers.data.models.Post;
import africa.semicolon.ofofo.controllers.data.repositories.PostRepository;
import africa.semicolon.ofofo.controllers.dto.requests.CreatePostRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class PostServiceImpl implements PostServices{

    @Autowired
    private PostRepository postRepository;

    @Override
    public void createPost(CreatePostRequest createPostRequest) {
        Post post = new Post();
        post.setBody(createPostRequest.getBody());
        post.setTitle(createPostRequest.getTitle());
        postRepository.save(post);

    }


    @Override
    public void updatePost(String id, String title, String body) {

    }

    @Override
    public void deletePost(String id) {

    }

    @Override
    public Post viewPOst(String id) {
        return postRepository.findPostById(id);
    }

    @Override
    public List<Post> viewAll() {
        return postRepository.findAll();
    }

    @Override
    public void addComment(String postId, Comment comment) {
        Post savePost = postRepository.findPostById(postId);
        savePost.getComments().add(comment);
        postRepository.save(savePost);

    }
}
