package com.ilias.blog.models.Repo;

import com.ilias.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepo extends CrudRepository<Post, Long> {
}
