package com.example.superhero.model;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class SuperHero {

  @NonNull
  private Long id;
  @NonNull
  private String name;
  private String description;
  private boolean capa = false;

}
