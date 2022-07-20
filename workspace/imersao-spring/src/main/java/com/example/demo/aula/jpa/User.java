package com.example.demo.aula.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tb_user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Integer id;
	@Column(length = 50, nullable = false)
	private String name;
	@Column(length = 20, nullable = false)
    private String username;
	@Column(length = 100, nullable = false)
	private String password;

	
	public User(String string, String string2, String string3) {
		this.name = string;
		this.username = string2;
		this.password = string3;
	}
}
