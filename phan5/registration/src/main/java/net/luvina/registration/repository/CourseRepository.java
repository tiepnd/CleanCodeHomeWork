package net.luvina.registration.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.luvina.registration.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

  List<Course> findAllByNameLike(String name);

  List<Course> findAllByNameLike(Sort sort, String name);

}
