Code Documentation for Blogging Application
Repository:- https://github.com/g23ai1010/blogapp/tree/main
Modules:- /src/main/java/com/blogmanagement
com.blogmanagement 
•	BlogAppApisApplication.java: - Main Java class user to execute the whole application
com.blogmanagement.config
•	AppConstant.java: - This is created to define constants which has static values in job using multiple places
•	SecurityConfig.java: - This class is created to define all security configuration method user Authentication and role-based authentication
com.blogmanagement.controllers
The Controller jobs are created to execute the APIs 
•	CategoryController.java: - This class is to call all Category methods/APIs to perform CURD operations
•	CommentController.java: - This class is to call comment methods/APIs
•	PostController.java: - This class is to call Posts related methods/APIs
•	UserController.java: - This class is to call User related methods/APIs like adding removing user
com.blogmanagement.entities
This Entities folder has all entities job like user, categories, posts, comments, role. Which is used to define database structure or object
•	Category.java
•	Post.java
•	User.java
•	Comment.java
•	Role.java
com.blogmanagement.exceptions 
This Repo has all exception handling methods which is used to throw exception when there is a failure in code like if a user is not present it will show user not found error.
•	GlobalExceptionHandler.java: - This class will pick all the exceptions applicable in all modules
•	ResouurceNotFoundHandler.java: - This is for when resource is not available and someone is trying to access which is not available

com.blogmanagement.payloads: - 
This repo has all Data Transfer objects classes which is used for data transfer which is stored in the objects for the latest one like updating a post so this PostDto wil be used to update the posts table in db. 
•	ApiResponse.java
•	CategoryDto.java
•	CommentDto.java
•	PostDto.java
•	UserDto.java
•	PostResponseDto.java
com.blogmanagement.repositories: - 
This repository leveraging JPA's capabilities to handle database operations without the need to write any implementation code.
•	CategoryRepo.java
•	PostRepo.java
•	UserRepo.java
•	CommentRepo.java

com.blogmanagement.security
This is for security class in which we define the rules for authentication and validation.
•	CustomUserDetailService.java
com.blogmanagement.services
This repository contains all classes in which we declared our methods like delete , add, create, get.
•	CategoryService.java
•	FileService.java
•	UserService.java
•	PostService.java
•	CommentService.java
com.blogmanagement.services.impl
This is Implementation of above methods defined in service repo.
•	CategoryServiceImpl.java
•	FileServiceImpl.java
•	UserServiceImpl.java
•	PostServiceImpl.java
•	CommentServiceImpl.java


