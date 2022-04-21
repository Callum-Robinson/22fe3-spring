package com.qa.intro_project.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.intro_project.data.entity.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{

	// custom query method, implementation auto generated by Spring. Will be looked at later...
	List<Post> findByUserId(int id);
	// findBy indicates we want find a list of users by their id (its a list because that is the return type)
	// - if you want only one post, set the return type to just Post
	// UserId is the name of the column in the database (expands out to user_id)
	// - we must also specify a parameter for the id to be passed to the generated method
	
	Post findByUserIdAndTitle(int id, String title);
	// - And is being used to add more predicates (conditions to test)
	
	// Derived query (https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.query-methods.details)
	// - Spring will auto generate the implementation based on the method name
	// findBy to search
	// update to update
	// delete to delete
	
	// Custom query structure: [subject][field][predicate(optional)][field(optional)]
	
	// Subjects = findBy, readBy, existsBy, deleteBy, removeBy
}