package com.jsp.esa.responsedto;

import com.jsp.esa.enums.UserRole;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserResponse {

	private int userId;
	private String username;
	private String email;
	private UserRole userRole;
	private boolean isEmailVerified;
	private boolean isDeleted;
}
