package ru.netology.springwebmvc.repository;

import org.springframework.stereotype.Repository;
import ru.netology.springwebmvc.model.Post;

import java.util.*;

@Repository
public class InMemoryPostRepository implements PostRepository {

    private final Map<Long, Post> posts = new HashMap<>();
    private long nextId = 1;
    @Override
    public List<Post> findAll() {
        return List.of();
    }

    @Override
    public Optional<Post> findById(long id) {
        return Optional.empty();
    }

    @Override
    public Post save(Post post) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }
}