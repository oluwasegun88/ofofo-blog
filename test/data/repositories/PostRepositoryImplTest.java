//package data.repositories;
//
//import africa.semicolon.ofofo.controllers.data.models.Post;
//import africa.semicolon.ofofo.controllers.data.repositories.PostRepository;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class PostRepositoryImplTest {
//
//    PostRepository postRepository;
//
//    @BeforeEach
//    void setUp() {
//        postRepository = new PostRepositoryImpl();
//    }
//
//    @Test
//    public void saveNewPost_countShouldBeOne_Test(){
//        Post post = new Post();
//        post.setBody("Our post body");
//        post.setTitle("our post title");
//        postRepository.save(post);
//        assertEquals(1L, postRepository.count());
//    }
//
//    @Test
//    public void saveNewPost_findById_shouldReturnSavedPOstTest(){
//        Post post = new Post();
//        post.setBody("Our post body");
//        post.setTitle("our post title");
//        postRepository.save(post);
//        assertEquals(1L, postRepository.count());
//
//        Post savedPost = postRepository.findById(1);
//        assertEquals(post, savedPost);
//        Post post2 = new Post();
//        postRepository.save(post2);
//        assertEquals(post2,postRepository.findById(2));
//    }
//
//    @Test
//    public void saveNewPost_updatePost_countIsOneTest() {
//        Post post = new Post();
//        post.setBody("Our post body");
//        post.setTitle("our post title");
//        postRepository.save(post);
//
//        Post updatedPost = new Post();
//        updatedPost.setId(1);
//        updatedPost.setBody("updated body");
//        updatedPost.setTitle("updated title");
//        postRepository.save(updatedPost);
//        assertEquals(1L, postRepository.count());
//        assertEquals(post,postRepository.findById(1));
//        assertEquals("updated body", post.getBody());
//        assertEquals("updated title", post.getTitle());
//    }
//
//    @Test
//    public void deleteItem_countIsZeroTest(){
//            Post post = new Post();
//            post.setBody("Our post body");
//            post.setTitle("our post title");
//            postRepository.save(post);
//            assertEquals(1L, postRepository.count());
//            postRepository.delete(1);
//            assertEquals(0L,postRepository.count());
//        }
//
//    }