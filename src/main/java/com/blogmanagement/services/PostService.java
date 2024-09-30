package com.blogmanagement.services;

import java.util.List;


import com.blogmanagement.entities.Post;
import com.blogmanagement.payloads.PostDto;
import com.blogmanagement.payloads.PostResponse;


public interface PostService {

	
	//Create 
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	//update
	PostDto updatePost(PostDto postDto, Integer postId);
	
	//delete
	void deletePost(Integer postId);
	
	//getAllPost
	PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy, String sortDir );
	//List<PostDto> getAllPost(Integer pageNumber, Integer pageSize );
	//getSinglePost
	PostDto getPostById(Integer postId);
	
	//getAllPostByCategory
	List<PostDto> getPostsByCategory(Integer categoryId);
	
	//getAllPostByUser
	List<PostDto> getPostsByUser(Integer userId);
		
	
	//searchPost
	List<PostDto> searchPosts(String keyword);
	
		
	
}
