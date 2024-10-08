package com.blogmanagement.payloads;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {

	private int categoryId;
	
	@NotBlank
	@Size(min=4, message="Title must not be empty and have minimu 4 character")
	private String categoryTitle;
	
	@NotBlank
	@Size(min=10)
	private String categoryDescription;
	
	
}
