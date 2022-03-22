package com.example.comment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "Comment")
public class Comment {

    @Id
    private String commentId;
    private String commentedBy;
    private String comment;
    private Date createdAt;
    private Date updatedAt;


}
