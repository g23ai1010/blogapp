package com.blogmanagement.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.blogmanagement.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer> {

	
}
