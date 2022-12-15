package data.repositories;

import data.models.Comment;

import java.util.List;

public interface CommentRepository {
    Comment save(Comment comment);
    List<Comment> viewComments();
    long count();
    Comment viewComment(int commentId);
    void deleteComment(Comment comment);
    void deleteComment(int commentId);
}
