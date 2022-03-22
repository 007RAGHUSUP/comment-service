package com.commentservice.repo;

import com.commentservice.model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentRepo extends MongoRepository<Comment, String> {
}
