package services;

import data.models.Post;
import data.repositories.PostRepository;
import data.repositories.PostRepositoryImpl;
import dto.requests.CreatePostRequest;

import java.util.List;

public class PostServiceImpl implements PostServices{

    private PostRepository postRepository = new PostRepositoryImpl();

    @Override
    public void createPost(CreatePostRequest createPostRequest) {
        Post post = new Post();
        post.setBody(createPostRequest.getBody());
        post.setTitle(createPostRequest.getTitle());
        postRepository.save(post);

    }


    @Override
    public void updatePost(int id, String title, String body) {

    }

    @Override
    public void deletePost(int id) {

    }

    @Override
    public Post viewPOst(int id) {
        return postRepository.findById(id);
    }

    @Override
    public List<Post> viewAll() {
        return postRepository.findAll();
    }
}
