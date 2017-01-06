package com.greenfox.services;

import com.greenfox.model.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Zoltán on 2017.01.05..
 */
public interface PostRepositiry extends CrudRepository <Post, Long>{
    List<Post> findAllByOrderByRatingDesc();
}
