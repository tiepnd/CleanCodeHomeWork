package com.homework.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homework.blog.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
