package com.commentservice.controller;

import com.commentservice.model.Comment;
import com.commentservice.service.CommentService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@AutoConfigureMockMvc
@WebMvcTest(CommentController.class)
public class CommentControllerTest {

    @MockBean
    CommentService commentService;
    @Autowired
    MockMvc mockMvc;

    public static String asJsonString(final Object object) {
        try {
            return new ObjectMapper().writeValueAsString(object);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    void createPost() throws Exception {

        Comment user = createNewPost();
        Mockito.when(commentService.createPost(user)).thenReturn(user);
        mockMvc.perform(post("/comments/comments-new")
                        .content(asJsonString(user))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated());
    }




    private Comment createNewPost() {
        Comment comment = new Comment();
        comment.getCommentedBy();
        comment.getComment();
        comment.getCreatedAt();
        comment.getUpdatedAt();
        return comment;

    }
}



