package com.example.superhero.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "SUPERHERO")
public class SuperHero {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "name", unique = true, nullable = false)
  private String name;

  @Column(name = "description", unique = false, nullable = true)
  private String description;

  @Column(name = "capa", nullable = false)
  private boolean capa;
}
