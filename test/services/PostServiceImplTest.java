//package services;
//
//import africa.semicolon.ofofo.controllers.data.models.Comment;
//import africa.semicolon.ofofo.controllers.data.models.Post;
//import africa.semicolon.ofofo.controllers.dto.requests.CreatePostRequest;
//import africa.semicolon.ofofo.controllers.services.PostServiceImpl;
//import africa.semicolon.ofofo.controllers.services.PostServices;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class PostServiceImplTest {
//
//    private PostServices postServices;
//
//    @BeforeEach
//    void setUp() {
//        postServices = new PostServiceImpl();
//    }
//
//    @Test
//    public void createPostTest(){
//        CreatePostRequest createPostRequest = new CreatePostRequest();
//        createPostRequest.setBody("Egusi is my best food");
//        createPostRequest.setTitle("New Post");
//        postServices.createPost(createPostRequest);
//        assertEquals(1,postServices.viewAll().size());
//
//    }
//
//    @Test
//    public void viewPostTest(){
//        CreatePostRequest createPostRequest = new CreatePostRequest();
//        createPostRequest.setBody("Egusi is my best food");
//        createPostRequest.setTitle("New Post");
//        postServices.createPost(createPostRequest);
//        assertEquals(1,postServices.viewAll().size());
//
//        Post post = postServices.viewPOst(1);
//        assertEquals("New Post",post.getTitle());
//        assertEquals("Egusi is my best food", post.getBody());
//        assertNotNull(post.getCreationTime());
//
//    }
//    @Test
//    public void addCommentTest(){
//        CreatePostRequest createPostRequest = new CreatePostRequest();
//        createPostRequest.setBody("Post Body");
//        createPostRequest.setTitle("Post Title");
//        postServices.createPost(createPostRequest);
//        Comment comment = new Comment();
//        comment.setComment("I love your post");
//        postServices.addComment(1, comment);
//
//        Post savedPost = postServices.viewPOst(1);
//        assertEquals(1, savedPost.getComments().size());
//        List<Comment> comments = savedPost.getComments();
//        Comment firstComment = comments.get(0);
//        assertEquals("I love your post", savedPost.getComments().get(0).getComment());
//    }
//}