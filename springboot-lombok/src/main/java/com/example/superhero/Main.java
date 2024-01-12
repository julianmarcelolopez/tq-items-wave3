package com.example.superhero;

import com.example.superhero.model.SuperHero;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    SuperHero s1 =
        SuperHero.builder().id(1L).name("batman").description("murcielago").capa(true).build();
    SuperHero s2 = SuperHero.builder().id(2L).name("robin").capa(true).build();

    List<SuperHero> superHeroList = Stream.of(s1, s2).collect(Collectors.toList());

    // Imprimir la lista usando Stream
    superHeroList.stream()
        .map(SuperHero::toString) // Opcional: mapear los elementos a sus representaciones de cadena
        .forEach(System.out::println);
  }
}
