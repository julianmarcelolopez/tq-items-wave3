package com.example.superhero.entity;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

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

  @Column(nullable = false)
  private String owner;

  @Column(name = "created_at", insertable = true, updatable = false)
  @Temporal(TemporalType.TIMESTAMP)
  @CreatedDate
  private Date createdAt;

  @Column(name = "updated_at", insertable = true, updatable = true)
  @LastModifiedDate
  @Temporal(TemporalType.TIMESTAMP)
  private Date updatedAt;

  @Column(name = "active", nullable = false)
  private boolean active;

  @PrePersist
  public void prePersist() {
    createdAt = new Date();
    updatedAt = new Date();
  }
}
