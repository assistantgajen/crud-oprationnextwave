package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Todo {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String todo;
private String status;
private String priority;
	    
public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getTodo() {
	return todo;
}

public void setTodo(String todo) {
	this.todo = todo;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public String getPriority() {
	return priority;
}

public void setPriority(String priority) {
	this.priority = priority;
}
}
