package com.example.comment.service;

import com.example.comment.model.Comment;
import com.example.comment.repo.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentRepo commentRepo;
    @Autowired
    Comment comment;

    @Override
    public Comment createPost(Comment comment) {

        return commentRepo.save(comment);
    }

//    @Override
//    public Comment deleteComment(Comment comment) {
//        return commentRepo.findById(comment);
//    }



}
