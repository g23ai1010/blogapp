package com.blogmanagement.services;

import com.blogmanagement.entities.Comment;
import com.blogmanagement.payloads.CommentDto;

public interface CommentService {

	CommentDto  createComment(CommentDto commentDto, Integer postId ) ;

	void deleteComment(Integer commentId);
	 
	
}
