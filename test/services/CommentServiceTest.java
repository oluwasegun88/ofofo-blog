//package services;
//
//import africa.semicolon.ofofo.controllers.dto.requests.CreateCommentRequest;
//import africa.semicolon.ofofo.controllers.dto.requests.CreatePostRequest;
//import africa.semicolon.ofofo.controllers.services.CommentService;
//import africa.semicolon.ofofo.controllers.services.CommentServiceImpl;
//import africa.semicolon.ofofo.controllers.services.PostServiceImpl;
//import africa.semicolon.ofofo.controllers.services.PostServices;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//
//public class CommentServiceTest {
//    private CommentService commentService;
//
//    private PostServices postServices;
//
//    @BeforeEach
//    public void setUp(){
//        commentService = new CommentServiceImpl();
//        postServices = new PostServiceImpl();
//    }
//
//    @Test
//    public  void createCommentTest(){
//        CreatePostRequest createPostRequest = new CreatePostRequest();
//        createPostRequest.setTitle("title");
//        createPostRequest.setBody("Body");
//        postServices.createPost(createPostRequest);
//
//
//        CreateCommentRequest createCommentRequest = new CreateCommentRequest();
//        createCommentRequest.setCommenterName("Ojo");
//        createCommentRequest.setGetId(1);
//        createCommentRequest.setComment("I love your useless post");
//
//        commentService.createComment(createCommentRequest);
//
//
//
//
//
//    }
//}
