package com.hnono.mustage.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

public class UserVO {

	private String id;
	private String password;
	private String name;
	private String nick;
	private String email;
	private String tel;
	private String role;
}
