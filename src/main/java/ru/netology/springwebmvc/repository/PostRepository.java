package ru.netology.springwebmvc.repository;

import org.springframework.stereotype.Repository;
import ru.netology.springwebmvc.model.Post;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository {
    List<Post> findAll();
    Optional<Post> findById(long id);
    Post save(Post post);
    void deleteById(long id);
}