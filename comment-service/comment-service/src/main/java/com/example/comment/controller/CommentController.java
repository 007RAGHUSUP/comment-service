package com.example.comment.controller;

import com.example.comment.model.Comment;
import com.example.comment.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comments")

public class CommentController {

    @Autowired
    CommentService commentService;

    @PostMapping("/comments-new")
    public ResponseEntity<Comment> createPost(@RequestBody Comment comment){
        // logger.info("user creating a post");
        return new ResponseEntity<Comment>(commentService.createPost(comment), HttpStatus.CREATED);

    }

//    @DeleteMapping("/comments/{userId}")
//    public ResponseEntity<Comment>deleteComment  (@PathVariable ("commentId")String comment){
//
//        return new ResponseEntity<Comment>(commentService.deleteComment(comment), HttpStatus.CREATED);
//
//    }



}
