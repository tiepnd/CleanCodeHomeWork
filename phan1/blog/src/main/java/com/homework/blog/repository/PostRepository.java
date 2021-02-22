package com.homework.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homework.blog.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

  @Override
  default <S extends Post> S save(S entity) {
    return null;
  }
}
