package ru.netology.springwebmvc.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.netology.springwebmvc.exception.NotFoundException;
import ru.netology.springwebmvc.model.Post;
import ru.netology.springwebmvc.repository.PostRepository;

import java.util.List;

@Service
public class PostService {
    private final PostRepository repository;

    @Autowired
    public PostService(PostRepository repository) {
        this.repository = repository;
    }

    public List<Post> all() {
        return repository.findAll();
    }

    public Post getById(long id) {
        return repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Post not found"));
    }

    public Post save(Post post) {
        return repository.save(post);
    }

    public void removeById(long id) {
        repository.deleteById(id);
    }
}
