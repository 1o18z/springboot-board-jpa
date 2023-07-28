package dev.jpaboard.post.domain;

import dev.jpaboard.BaseEntity;
import dev.jpaboard.user.domain.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Post extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @ManyToOne
  private User user;

  @Column(length = 25, nullable = false)
  private String title;

  @Column(length = 5000, nullable = false)
  private String content;

  @Builder
  private Post(String title, String content) {
    this.title = title;
    this.content = content;
  }

}
