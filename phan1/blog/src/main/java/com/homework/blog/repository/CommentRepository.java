package com.homework.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homework.blog.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
