package net.luvina.registration.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "teachers")
public class Teacher extends User {

  private String phone;

  private Integer experiences;
}
