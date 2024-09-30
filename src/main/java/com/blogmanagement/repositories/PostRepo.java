package com.blogmanagement.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.blogmanagement.entities.Category;
import com.blogmanagement.entities.Post;
import com.blogmanagement.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer> {
	
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category user);
	
	List<Post> findByTitleContaining(String title);
	//List<Post> findByContentContaining(String content);
}
