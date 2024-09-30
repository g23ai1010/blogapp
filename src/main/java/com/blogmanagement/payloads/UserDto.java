package com.blogmanagement.payloads;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public class UserDto {

	private int id;
	
	@NotEmpty
	@Size(min=4, message="Username must be greater 4 character")
	
	private String name;
	@Email(message="Enter valid email.")
	
	private String email;
	@NotEmpty
	@Size(min=4,max=16, message="Password muste be in range 4-16")
	
	private String password;
	@NotEmpty
	
	private String about;
	
}
