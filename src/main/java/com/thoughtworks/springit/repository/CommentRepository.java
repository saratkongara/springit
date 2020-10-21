package com.thoughtworks.springit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thoughtworks.springit.domain.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
