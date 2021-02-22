package net.luvina.registration.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "teachers")
public class Teacher extends User {

  private String phone;

  private Integer experiences;

  @OneToMany(mappedBy = "teacher")
  private Set<Course> courses;
  
}
