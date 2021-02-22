package com.homework.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homework.blog.entity.Post;
import com.homework.blog.repository.PostRepository;

@Service
public class PostService {

  @Autowired
  private PostRepository postRepository;

  public void addPost(Post post) {
    postRepository.save(post);
  }
}
